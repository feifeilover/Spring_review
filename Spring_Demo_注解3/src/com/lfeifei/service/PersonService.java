package com.lfeifei.service;

import com.lfeifei.dao.PersonDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author :feifei
 * @date 2018/11/18 20:26
 * @Deprecated
 */
@Service("personService")
public class PersonService {
    @Resource(name = "personDao")
    private PersonDao personDao;

    public void delete() {
        System.out.println("业务删除....");
    }
}
