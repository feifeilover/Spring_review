package com.lfeifei.pojo;

/**
 * @author :feifei
 */
public class Person {
    private String name;
    private String message;

    /**
     * 采用set方式注入
     */
    public void setName(String name) {
        this.name = name;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * 添加一个say方法
     */
    public void say() {
        System.out.println(name + "说:" + message);
    }
}
