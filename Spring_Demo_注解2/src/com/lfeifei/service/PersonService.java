package com.lfeifei.service;

import com.lfeifei.dao.PersonDao;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * @author :feifei
 * @date 2018/11/18 18:18
 * @Deprecated
 */
@Service("personService")
/*@Scope(scopeName = "singleton")*/
@Scope(scopeName = "prototype")
public class PersonService {
    @Resource(name = "personDao")
    private PersonDao personDao;


    public void remove() {
        System.out.println("业务删除...");
    }

    @PostConstruct
    public void init() {
        System.out.println("初始化....");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("销毁....");
    }
}
