package com.bdqn.service.admin.test;

import com.bdqn.service.admin.ServiceAdminApplication;
import com.bdqn.service.admin.entity.User;
import com.bdqn.service.admin.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ServiceAdminApplication.class)
//@ActiveProfiles( value = "prod")
//@Transactional
//@Rollback
public class ServiceAdminTest {

    @Resource
    private UserService userService;

    /**
     * 注册
     */
    @Test
    public void register(){
        User user = new User();
//        user.setUserCode("10010");
        user.setUserName("yangyang");
        user.setLoginCode("yangyang");
        user.setPassword("123456");
        user.setUserType("新用户");
        user.setMgrType("1");
        user.setStatus("0");
        user.setCreateBy("张三");
        user.setCreateDate(new Date());
        user.setUpdateBy("张三");
        user.setUpdateDate(new Date());
        user.setCorpCode("001");
        user.setCorpName("老坛酸菜集团");
        userService.register(user);
    }

    /**
     * 登陆
     */
    @Test
    public void login(){
        userService.login("yangyang","123456");
    }
}
