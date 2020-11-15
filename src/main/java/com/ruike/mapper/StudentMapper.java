package com.ruike.mapper;

import com.ruike.pojo.Student;

import java.util.List;

/**
 * @author 吴泽胜
 * @FileName StudentMapper
 * @date 2020-11-14 5:57 下午
 * @Software: IntelliJ IDEA
 */

public interface StudentMapper {


    // 添加学生
    public void addStudent(Student student) throws Exception;

    // 查询所有学生
    public List<Student> getStudentList() throws Exception;

    // 学生登录
    public Student findStudentByStudent_idAndPassword(Student student) throws Exception;

    // 通过主键id查询学生
    public Student findStudentIdById(Integer id) throws Exception;

    // 根据用户名查询学生
    public Student	findStudentByName(String nickName) throws Exception;

    // 根据用户名模糊查询学生
    public List<Student> getStudentListByName(String student_id) throws Exception;

    // 通过学生学号查询学生
    public Student findStudentIdByStudentId(String student_id) throws Exception;

    // 根据学生学号模糊查询学生
    public Student findStudentIdListByStudentId(String student_id) throws Exception;


}
