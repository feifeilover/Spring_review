package com.lfeifei.mapper;

import com.lfeifei.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author :feifei
 * @date 2018/11/23 21:31
 * @Deprecated
 */
@Repository
public interface UserMapper {
    /**
     * 模糊查找的总记录数
     * @param params
     * @return
     */
    public int fuzzySelectUserCount(Map<String,Object> params);

    /**
     * 模糊查找用户+分页
     * @param params
     * @return
     */
    public List<User> selectUserByFuzzy(Map<String,Object> params);

}
