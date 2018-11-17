package com.lfeifei.pojo;

/**
 * @author :feifei
 */
public class User {
    private int id;
    private String userName;
    private String gender;

    public User() {
    }

    public User(int id, String userName, String gender) {
        this.id = id;
        this.userName = userName;
        this.gender = gender;
    }

    /**
     * set方法注入
     */

    public void setId(int id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
