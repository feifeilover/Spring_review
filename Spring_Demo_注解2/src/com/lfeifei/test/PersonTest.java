package com.lfeifei.test;

import com.lfeifei.service.PersonService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author :feifei
 * @date 2018/11/18 18:22
 * @Deprecated
 */
public class PersonTest {
    @Test
    public void test01() {
        //读取配置文件
        ApplicationContext act = new ClassPathXmlApplicationContext("classpath:config.xml");
        PersonService service = (PersonService) act.getBean("personService");
        service.remove();

        PersonService service2 = (PersonService) act.getBean("personService");
        service2.remove();

        /**
         * 单例才可以销毁，多例不可以销毁
         */
        ((ClassPathXmlApplicationContext) act).close();
    }
}
