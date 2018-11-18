package com.lfeifei.test;

import com.lfeifei.service.PersonService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @author :feifei
 * @date 2018/11/18 20:29
 * @Deprecated
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:config.xml")
public class PersonTest {
    @Resource(name = "personService")
    private PersonService personService;

    @Test
    public void test01() {
        personService.delete();
    }
}
