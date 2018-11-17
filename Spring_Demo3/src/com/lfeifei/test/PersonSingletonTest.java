package com.lfeifei.test;

import com.lfeifei.pojo.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author :feifei
 * @date 2018/11/17 19:58
 * @Deprecated
 */
public class PersonSingletonTest {
    @Test
    public void test01() {
        /**
         * 读取配置文件
         */
        ApplicationContext act = new ClassPathXmlApplicationContext("classpath:singletonConfig.xml");
        Person person = (Person) act.getBean("person");
        person.say();
        System.out.println("person:" + person);

        Person person2 = (Person) act.getBean("person");
        person2.say();
        System.out.println("person2:" + person);
        System.out.println(person==person2?"是同一个对象":"不是同一个对象");

        /**
         * 只有在Scope为singleton单例的时候才可以关闭
         */
        ((ClassPathXmlApplicationContext) act).close();
    }
}
