package com.lfeifei.pojo;

/**
 * @author :feifei
 * @date 2018/11/17 19:52
 * @Deprecated :Person类
 */
public class Person {
    private String name;
    private String message;

    public Person() {
    }

    public void init() {
        System.out.println("init方法初始化...");
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

    public void destroy() {
        System.out.println("destroy方法销毁了...");
    }


}
