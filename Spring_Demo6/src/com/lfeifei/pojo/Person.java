package com.lfeifei.pojo;

/**
 * @author :feifei
 * @date 2018/11/17 20:55
 * @Deprecated
 */
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
