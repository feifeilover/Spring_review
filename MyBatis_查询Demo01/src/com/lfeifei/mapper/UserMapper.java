package com.lfeifei.mapper;

import com.lfeifei.pojo.QueryVo;
import com.lfeifei.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @author :feifei
 * @date 2018/11/21 21:51
 * @Deprecated
 */
public interface UserMapper {
    /**
     * 根据登录名和密码查询一个用户(存入一个User类中)
     * @param user
     * @return
     */
    public User selectUserByLoginNameAndPassword(User user);

    /**
     * 根据登录名和密码查询一个用户(存入一个map中)
     * @param map
     * @return
     */
    public User selectUserByLoginNameAndPassword2(Map<String,Object> map);

    /**
     * 根据登录名和密码查询一个用户(存入一个QueryVo类中)
     * @param qv
     * @return
     */
    public User selectUserByLoginNameAndPassword3(QueryVo qv);

    /**
     * 返回总记录数
     * @return
     */
    public int selectUserCount();

    /**
     * 根据id查询部分列(存在User类中)
     * @param id
     * @return
     */
    public User selectPart(int id);

    /**
     * 根据id查询部分列(存在Map中)
     * @param id
     * @return
     */
    public Map<String,Object> selectPart2(int id);

    /**
     * 查询所有用户的部分信息，存在一个List中
     * @param
     * @return
     */
    public List<Map<String,Object>> selectPart3();

    /**
     * 自定义结果集映射
     * @param id
     * @return
     */
    public User selectUserByResultMap(int id);
}
