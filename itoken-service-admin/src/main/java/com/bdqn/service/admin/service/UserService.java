package com.bdqn.service.admin.service;

import com.bdqn.service.admin.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author yxy
 * @since 2019-08-18
 */
public interface UserService extends IService<User> {

    void register(User user);

    User login(String loginCode,String password);

}
