package com.lfeifei.service;

import com.lfeifei.mapper.UserMapper;
import com.lfeifei.pojo.Paging;
import com.lfeifei.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author :feifei
 * @date 2018/11/23 18:37
 * @Deprecated
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper mapper;

    @Override
    public Paging<User> search(String name, int currPage, int pageSize) {
        Paging<User> paging = new Paging<>(currPage,pageSize);
        /**调用业务层*/
        /**总记录数*/
        int rowsCount = mapper.selectPagingCount(name);
        /**一共多少页*/
        int pageCount = (int) Math.ceil(rowsCount/(double)pageSize);
        int begin = (currPage - 1) * pageSize;
        Map<String,Object> map = new HashMap<String, Object>(3);
        map.put("name", name);
        map.put("begin", begin);
        map.put("size", pageSize);
        List<User> data = mapper.selectUserByName(map);

        /**封装到分页对象*/
        paging.setPageCount(pageCount);
        paging.setRowsCount(rowsCount);
        paging.setData(data);

        return paging;
    }
}
