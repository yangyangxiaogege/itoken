package com.bdqn.web.admin.controller;

import com.bdqn.web.admin.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;

@Controller
public class UserController {

    @Resource
    private UserService userService;

    /**
     * 跳转到登陆页
     * @return
     */
    @GetMapping(value = {"","login"})
    public String login(){
        String json = userService.login("","");
        System.out.println(json);
        return "index";
    }
}
