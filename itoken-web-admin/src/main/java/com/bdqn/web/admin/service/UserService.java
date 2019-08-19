package com.bdqn.web.admin.service;

import com.bdqn.web.admin.service.fallback.UserServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "itoken-service-admin",fallback = UserServiceFallback.class)
public interface UserService {

    @GetMapping("/user/login")
    String login(@RequestParam("loginCode") String loginCode,@RequestParam("password") String password);
}
