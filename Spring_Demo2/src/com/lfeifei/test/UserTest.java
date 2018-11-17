package com.lfeifei.test;

import com.lfeifei.pojo.User;
import com.lfeifei.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author :feifei
 */
public class UserTest {
    @Test
    public void test01() {
        ApplicationContext act = new ClassPathXmlApplicationContext("classpath:config.xml");
        UserService service = (UserService) act.getBean("userService");
        User user = service.queryUserById(1001);
        System.out.println(user);
        System.out.println("======================");
        UserService service1 = (UserService) act.getBean("userService");
        boolean result = service1.addUser(new User(1002, "大华", "男"));
        System.out.println("是否添加" + result);
    }

}
