package com.lfeifei.mapper;

import com.lfeifei.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author :feifei
 * @date 2018/11/23 18:23
 * @Deprecated
 */
@Repository
public interface UserMapper {
    /**
     * 分页总的记录数
     * @param name
     * @return
     */
    public int selectPagingCount(String name);

    /**
     * 根据姓名模糊查询，前台传来一个字符串和分页的开始页码，每页显示最大个数
     * @param params
     * @return
     */
    public List<User> selectUserByName(Map<String,Object> params);
}
