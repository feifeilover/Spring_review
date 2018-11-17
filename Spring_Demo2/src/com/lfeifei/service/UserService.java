package com.lfeifei.service;

import com.lfeifei.pojo.User;

import java.util.List;

/**
 * @author :feifei
 */
public interface UserService {
    /**
     * 是否添加一个用户
     * @param user
     * @return
     */
    public boolean addUser(User user);

    /**
     * 是否更新一个用户
     * @param user
     * @return
     */
    public boolean editUser(User user);

    /**
     * 按照主键删除一个用户
     * @param id
     * @return
     */
    public boolean removeUserById(int id);

    /**
     * 根据主键查找用户
     * @param id
     * @return
     */
    public User queryUserById(int id);

    /**
     * 根据名字查找所有用户
     * @param name
     * @return
     */
    public List<User> queryUserByName(String name);
}
