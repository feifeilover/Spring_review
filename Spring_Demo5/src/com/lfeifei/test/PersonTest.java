package com.lfeifei.test;

import com.lfeifei.pojo.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author :feifei
 * @date 2018/11/17 20:45
 * @Deprecated
 */
public class PersonTest {
    @Test
    public void test01() {
        ApplicationContext act = new ClassPathXmlApplicationContext("classpath:config.xml");
        Person person = (Person) act.getBean("person");
        person.say();
    }
}
