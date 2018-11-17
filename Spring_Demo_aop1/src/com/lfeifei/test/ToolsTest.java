package com.lfeifei.test;

import com.lfeifei.pojo.Tools;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author :feifei
 * @date 2018/11/17 22:41
 * @Deprecated
 */

public class ToolsTest {
    /**
     * 测试注解
     */
    @Test
    public void test01() {
        ApplicationContext act = new ClassPathXmlApplicationContext("classpath:config.xml");
        Tools tools = (Tools) act.getBean("tools");
        double result = tools.add(3, 4);
        System.out.println(result);

        double result2 = tools.chu(36, 5);
        System.out.println(result2);
    }
}
