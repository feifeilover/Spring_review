package com.lfeifei.service.impl;

import com.lfeifei.dao.UserDao;
import com.lfeifei.pojo.User;
import com.lfeifei.service.UserService;

import java.util.List;

/**
 * @author :feifei
 */
public class UserServiceImpl implements UserService {

    private UserDao dao;

    /**set方式注入*/
    public void setDao(UserDao dao) {
        this.dao = dao;
    }

    @Override
    public boolean addUser(User user) {
        try {
            return dao.insertUser(user) > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean editUser(User user) {
        return false;
    }

    @Override
    public boolean removeUserById(int id) {
        return false;
    }

    @Override
    public User queryUserById(int id) {
        try {
            return dao.selectById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<User> queryUserByName(String name) {
        return null;
    }
}
