package com.lfeifei.service;

import com.lfeifei.pojo.Paging;
import com.lfeifei.pojo.User;

/**
 * @author :feifei
 * @date 2018/11/23 18:35
 * @Deprecated
 */
public interface UserService {
    /**根据当前页和每页显示的数据数量，分页查询返回分页对象*/
    public Paging<User> search(String name,int currPage,int pageSize);
}
