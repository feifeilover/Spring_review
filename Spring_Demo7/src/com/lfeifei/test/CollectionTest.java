package com.lfeifei.test;

import com.lfeifei.pojo.ArrayCollection;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author :feifei
 * @date 2018/11/17 21:34
 * @Deprecated
 */
public class CollectionTest {
    /**
     * 数组测试
     */
    @Test
    public void test01() {
        ApplicationContext act = new ClassPathXmlApplicationContext("classpath:config.xml");
        ArrayCollection arr = (ArrayCollection) act.getBean("arrayCollection");
        arr.print();
    }

    /**
     * List集合测试
     */
    @Test
    public void test02() {
        ApplicationContext act = new ClassPathXmlApplicationContext("classpath:config.xml");
        ArrayCollection list = (ArrayCollection) act.getBean("arrayCollection");
        list.printList();
    }

    /**
     * set集合测试：有去重的效果
     */
    @Test
    public void test03() {
        ApplicationContext act = new ClassPathXmlApplicationContext("classpath:config.xml");
        ArrayCollection set = (ArrayCollection) act.getBean("arrayCollection");
        set.printSet();
    }
}
