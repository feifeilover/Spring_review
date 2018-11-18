package com.lfeifei.test;

import com.lfeifei.service.CustomerService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.TestExecutionListeners;

/**
 * @author :feifei
 * @date 2018/11/18 21:19
 * @Deprecated
 */
public class ServiceTest {
    @Test
    public void test01() {
        ApplicationContext act = new ClassPathXmlApplicationContext("classpath:config.xml");
        CustomerService service = (CustomerService) act.getBean("customerService");
        service.save();
        service.find();
        service.select();
        service.delete();
    }
}
