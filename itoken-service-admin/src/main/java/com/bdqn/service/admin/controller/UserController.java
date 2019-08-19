package com.bdqn.service.admin.controller;


import com.alibaba.druid.util.StringUtils;
import com.bdqn.common.service.dto.BaseResult;
import com.bdqn.service.admin.entity.User;
import com.bdqn.service.admin.service.UserService;
import com.google.common.collect.Lists;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author yxy
 * @since 2019-08-18
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @PostMapping("/register")
    public String register(User user){
        return null;
    }

    @GetMapping("/login")
    public Object login(String loginCode,String password){
        BaseResult baseResult = checkLogin(loginCode,password);

        // 验证失败
        if (baseResult != null){
            return baseResult;
        }

        // 登陆
        User user = userService.login(loginCode,password);

        // 成功
        if (user != null){
            return BaseResult.ok(user);
        }
        // 失败
        else {
         return BaseResult.notOk(Lists.newArrayList(new BaseResult.Error("fail","登陆失败")));
        }
    }

    /**
     * 验证登陆信息
     * @param loginCode
     * @param password
     * @return
     */
    private BaseResult checkLogin(String loginCode,String password){
        BaseResult baseResult = null;

        if (StringUtils.isEmpty(loginCode) || StringUtils.isEmpty(password)){
            return baseResult = BaseResult.notOk(Lists.newArrayList(
                    new BaseResult.Error("loginCode","登陆账号不能为空"),
                    new BaseResult.Error("password","密码不能为空")
            ));
        }
        return baseResult;
    }

}

