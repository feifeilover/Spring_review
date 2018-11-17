package com.lfeifei.test;

import com.lfeifei.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author :feifei
 * @date 2018/11/17 20:27
 * @Deprecated
 */
public class StudentTest {
    @Test
    public void test01() {
        /**
         * 读取配置文件
         */
        ApplicationContext act = new ClassPathXmlApplicationContext("classpath:config.xml");
        Student student = (Student) act.getBean("student");
        student.say();
    }
}
