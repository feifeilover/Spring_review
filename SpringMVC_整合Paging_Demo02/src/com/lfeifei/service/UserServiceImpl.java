package com.lfeifei.service;

import com.lfeifei.mapper.UserMapper;
import com.lfeifei.pojo.Page;
import com.lfeifei.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author :feifei
 * @date 2018/11/23 21:56
 * @Deprecated
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper mapper;
    @Override
    public Page<User> search(String compo, String inputText, int currPage, int pageSize) {
        Page<User> page = new Page<>(currPage,pageSize);
        Map<String,Object> params = new HashMap<>(2);
        params.put("compo", compo);
        params.put("inputText", inputText);
        int rowsCount = mapper.fuzzySelectUserCount(params);
        int pageCount = (int) Math.ceil(rowsCount/(double)pageSize);
        int begin = (currPage - 1) * pageSize;
        Map<String,Object> map = new HashMap<>(4);
        map.put("compo", compo);
        map.put("inputText", inputText);
        map.put("begin", begin);
        map.put("size", pageSize);
        List<User> users = mapper.selectUserByFuzzy(map);

        page.setData(users);
        page.setPageCount(pageCount);
        page.setRowsCount(rowsCount);

        return page;
    }
}
