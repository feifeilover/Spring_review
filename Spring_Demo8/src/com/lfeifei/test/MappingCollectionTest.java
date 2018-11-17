package com.lfeifei.test;

import com.lfeifei.pojo.MappingCollection;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author :feifei
 * @date 2018/11/17 22:03
 * @Deprecated
 */
public class MappingCollectionTest {
    @Test
    public void test01() {
        ApplicationContext act = new ClassPathXmlApplicationContext("classpath:config.xml");
        MappingCollection mappCon = (MappingCollection) act.getBean("mappingCollection");
        mappCon.printMap();
    }

    @Test
    public void test02() {
        ApplicationContext act = new ClassPathXmlApplicationContext("classpath:config.xml");
        MappingCollection prop = (MappingCollection) act.getBean("mappingCollection");
        prop.printProps();
    }
}
