package com.lfeifei.pojo;

import org.springframework.stereotype.Component;

/**
 * @author :feifei
 * @date 2018/11/18 18:12
 * @Deprecated :Person类
 */
@Component("p1")
public class Person {
    private String name;
    private String message;

    public Person() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void say() {
        System.out.println(name + "说:" + message);
    }
}
