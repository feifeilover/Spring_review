package com.lfeifei.test;

import com.lfeifei.mapper.UserMapper;
import com.lfeifei.pojo.QueryVo;
import com.lfeifei.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author :feifei
 * @date 2018/11/21 21:56
 * @Deprecated
 */
public class UserTest {
    /**开启工厂*/
    private SqlSessionFactory factory;

    @Before
    public void Before() throws IOException {
        /**开启工厂的工厂*/
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        /**读取配置文件,指定工厂*/
        factory = builder.build(Resources.getResourceAsReader("SqlMapperConfig.xml"));
    }

    @Test
    public void test01() {
        /**开启会话*/
        SqlSession session = factory.openSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = new User();
        user.setLoginName("ee");
        user.setPassword("333");
        User u = mapper.selectUserByLoginNameAndPassword(user);
        System.out.println(u);
    }

    @Test
    public void test02() {
        /**开启会话*/
        SqlSession session = factory.openSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        Map<String,Object> map = new HashMap<>();
        /**put中的字段必须与User类中的字段保持一致*/
        map.put("loginName", "ee");
        map.put("password", "333");
        User u = mapper.selectUserByLoginNameAndPassword2(map);
        System.out.println(u);
    }

    @Test
    public void test03() {
        /**开启会话*/
        SqlSession session = factory.openSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        QueryVo qv = new QueryVo();
        User user = new User();
        user.setLoginName("ee");
        user.setPassword("333");
        qv.setUser(user);
        User u = mapper.selectUserByLoginNameAndPassword3(qv);
        System.out.println(u);
    }

    @Test
    public void test04() {
        SqlSession session = factory.openSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        int count = mapper.selectUserCount();
        System.out.println(count);
    }

    @Test
    public void test05() {
        SqlSession session = factory.openSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = mapper.selectPart(1);
        System.out.println(user);
    }

    @Test
    public void test06() {
        SqlSession session = factory.openSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        Map<String, Object> lists = mapper.selectPart2(1);
        System.out.println(lists);
    }

    @Test
    public void test07() {
        SqlSession session = factory.openSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        List<Map<String, Object>> lists = mapper.selectPart3();
        System.out.println(lists);
    }

    @Test
    public void test08() {
        SqlSession session = factory.openSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User uu = mapper.selectUserByResultMap(1);
        System.out.println(uu);
    }
}
