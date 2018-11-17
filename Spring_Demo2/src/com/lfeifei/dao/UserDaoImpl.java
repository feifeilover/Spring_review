package com.lfeifei.dao;

import com.lfeifei.pojo.User;

import java.util.List;

/**
 * @author :feifei
 */
public class UserDaoImpl implements UserDao{



    @Override
    public int insertUser(User user) throws Exception {
        System.out.println("增加一个用户....");
        return 1;
    }

    @Override
    public int updateUser(User user) throws Exception {
        System.out.println("更新一个用户....");
        return 0;
    }


    @Override
    public int deleteUser(int id) throws Exception {
        System.out.println("根据id删除一个用户....");
        return 0;
    }

    @Override
    public User selectById(int id) throws Exception {
        System.out.println("根据id查找一个用户....");
        User user = new User();
        user.setId(1001);
        user.setUserName("花花");
        user.setGender("女");
        return user;
    }

    @Override
    public List<User> selectByName(String name) {
        System.out.println("根据名字查找所有用户....");
        return null;
    }
}
