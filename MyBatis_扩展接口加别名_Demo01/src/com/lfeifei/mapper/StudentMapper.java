package com.lfeifei.mapper;

import com.lfeifei.pojo.Student;

import java.util.List;

/**
 * @author :feifei
 * @date 2018/11/19 11:31
 * @Deprecated:Student的mapper接口
 */
public interface StudentMapper {
    /**
     * 根据id查询学生
     * @param id
     * @return
     */
    public Student selectStuById(int id);

    /**
     * 查询所有学生
     * @return
     */
    public List<Student> selectAllStu();

    /**
     * 插入一个学生
     * @param student
     * @return
     */
    public int  insertStu(Student student);

    /**
     * 修改学生
     * @param student
     * @return
     */
    public int updateStu(Student student);

    /**
     * 根据id删除一个学生
     * @param id
     * @return
     */
    public int deleteStuById(int id);
}
