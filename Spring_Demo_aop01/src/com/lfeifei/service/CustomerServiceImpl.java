package com.lfeifei.service;

/**
 * @author :feifei
 * @date 2018/11/18 20:50
 * @Deprecated
 */
public class CustomerServiceImpl implements CustomerService {
    @Override
    public void save() {
        System.out.println("业务保存");
    }

    @Override
    public int find() {
        System.out.println("业务查找..");
        return 77;
    }

    @Override
    public void select() {
        System.out.println("业务select...");
    }

    @Override
    public int delete() {
        int i=10;
        i = i/0;
        System.out.println("业务delete.....");
        return 0;
    }
}
