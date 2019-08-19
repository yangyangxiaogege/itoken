package com.bdqn.service.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bdqn.service.admin.entity.User;
import com.bdqn.service.admin.dao.UserMapper;
import com.bdqn.service.admin.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author yxy
 * @since 2019-08-18
 */
@Service
@Transactional
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    @Transactional(readOnly = false)
    public void register(User user) {
        userMapper.insert(user);
    }

    @Override
    public User login(String loginCode, String password) {

        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("login_code",loginCode);
        queryWrapper.eq("password",password);

        User user = userMapper.selectOne(queryWrapper);

        if (user != null){
            return user;
        }
        return null;
    }
}
