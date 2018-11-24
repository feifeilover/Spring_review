package com.lfeifei.service;

import com.lfeifei.pojo.Page;
import com.lfeifei.pojo.User;

/**
 * @author :feifei
 * @date 2018/11/23 21:51
 * @Deprecated
 */
public interface UserService {
    /**
     * 分页信息
     * @param compo
     * @param inputText
     * @param currPage
     * @param pageSize
     * @return
     */
    public Page<User> search(String compo,String inputText,int currPage,int pageSize);

}
