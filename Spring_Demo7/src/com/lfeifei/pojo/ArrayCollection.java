package com.lfeifei.pojo;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

/**
 * @author :feifei
 * @date 2018/11/17 21:25
 * @Deprecated
 */
public class ArrayCollection {
    /**
     * 数组:arrs
     */
    private String[] arrs;

    /**
     * List集合:list
     */
    public List<String> list;

    /**
     * set集合:set
     */
    public Set<Integer> set;

    /**
     * set方式注入
     * @param arrs
     */
    public void setArrs(String[] arrs) {
        this.arrs = arrs;
    }

    /**
     * set方式注入
     * @param list
     */
    public void setList(List<String> list) {
        this.list = list;
    }

    /**
     * set方式注入
     * @param set
     */
    public void setSet(Set<Integer> set) {
        this.set = set;
    }

    public void print() {
        System.out.println("数组输出:" + Arrays.asList(arrs));
    }

    public void printList() {
        System.out.println("List集合输出:" + list);
    }

    public void printSet() {
        System.out.println("set集合输出:" + set);
    }
}
