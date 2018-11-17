package com.lfeifei.pojo;

/**
 * @author :feifei
 * @date 2018/11/17 20:23
 * @Deprecated
 */
public class Student {
    private String name;
    private String message;

    /**
     * 采用构造方法注入
     * @param name
     * @param message
     */
    public Student(String name, String message) {
        this.name = name;
        this.message = message;
    }

    public void say() {
        System.out.println(name + "说:" + message);
    }
}
