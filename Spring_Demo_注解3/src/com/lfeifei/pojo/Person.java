package com.lfeifei.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author :feifei
 * @date 2018/11/18 20:21
 * @Deprecated
 */
@Component("p1")
public class Person {

    @Value("张三")
    private String name;
    @Value("你好!")
    private String message;

    public void say() {
        System.out.println(name + "说:" +message);
    }

}
