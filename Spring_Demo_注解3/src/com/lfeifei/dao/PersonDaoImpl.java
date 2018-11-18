package com.lfeifei.dao;

import org.springframework.stereotype.Repository;

/**
 * @author :feifei
 * @date 2018/11/18 20:25
 * @Deprecated
 */
@Repository("personDao")
public class PersonDaoImpl implements PersonDao {
    @Override
    public int delete() {
        System.out.println("删除....");
        return 0;
    }
}
