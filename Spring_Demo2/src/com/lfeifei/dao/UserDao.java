package com.lfeifei.dao;

import com.lfeifei.pojo.User;

import java.util.List;

/**
 * @author :feifei
 */
public interface UserDao {
    /**
     * 增加用户
     * @param user
     * @return int
     * @throws Exception
     */
    public int insertUser(User user) throws Exception;

    /**
     * 更新用户
     * @param user
     * @return int
     * @throws Exception
     */
    public int updateUser(User user) throws Exception;

    /**
     * 根据id删除用户
     * @param id
     * @return int
     * @throws Exception
     */
    public int deleteUser(int id) throws Exception;

    /**
     * 根据id查询用户
     * @param id
     * @return User
     * @throws Exception
     */
    public User selectById(int id) throws Exception;

    /**
     * 根据名字查询所有用户
     * @param name
     * @return List<User>
     */
    public List<User> selectByName(String name);
}
