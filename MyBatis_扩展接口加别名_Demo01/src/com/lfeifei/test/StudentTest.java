package com.lfeifei.test;

import com.lfeifei.mapper.StudentMapper;
import com.lfeifei.pojo.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.Date;
import java.util.List;


/**
 * @author :feifei
 * @date 2018/11/19 11:42
 * @Deprecated
 */
public class StudentTest {
    /**开启工厂*/
    private SqlSessionFactory factory;

    @Before
    public void before() throws IOException {
        /**开启工厂的工厂*/
        SqlSessionFactoryBuilder builder =  new SqlSessionFactoryBuilder();
        factory = builder.build(Resources.getResourceAsStream("SqlMapperConfig.xml"));
    }


    @Test
    public void demo01() {
        /**开启会话*/
        SqlSession session = factory.openSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        Student stu = mapper.selectStuById(1001);
        System.out.println(stu);
    }

    @Test
    public void demo02() {
        /**开启会话*/
        SqlSession session = factory.openSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        List<Student> stus = mapper.selectAllStu();
        for (Student stu:
             stus) {
            System.out.println(stu);
        }
    }

    @Test
    public void demo03() {
        /**开启会话*/
        SqlSession session = factory.openSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        int i = mapper.insertStu(new Student(10012, "vae", "男", new Date(), "vae@163.com"));
        session.commit();
        System.out.println(i);
        session.close();
    }

    @Test
    public void demo04() {
        SqlSession session = factory.openSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        int i = mapper.updateStu(new Student(10012, "花花", "男", new Date(), "hua@163.com"));
        /**提交*/
        session.commit();
        System.out.println(i>0?"修改成功":"修改失败");
        /**关闭会话*/
        session.close();
    }

    @Test
    public void demo05() {
        SqlSession session = factory.openSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        int i = mapper.deleteStuById(1006);
        System.out.println(i>0?"删除成功":"删除失败");
        /**提交*/
        session.commit();
        /**关闭会话*/
        session.close();
    }
}
