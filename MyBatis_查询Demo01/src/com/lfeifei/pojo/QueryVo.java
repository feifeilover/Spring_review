package com.lfeifei.pojo;

/**
 * @author :feifei
 * @date 2018/11/21 22:20
 * @Deprecated
 */
public class QueryVo {
    private User user;

    public QueryVo() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "QueryVo{" +
                "user=" + user +
                '}';
    }
}
