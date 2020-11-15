package com.ruike.service.impl;

import com.ruike.mapper.StudentMapper;
import com.ruike.pojo.Student;
import com.ruike.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 吴泽胜
 * @FileName StudentServiceImpl
 * @date 2020-11-15 10:57 下午
 * @Software: IntelliJ IDEA
 */

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public void addStudent(Student student) throws Exception {
        studentMapper.addStudent(student);
    }

    @Override
    public List<Student> getStudentList() throws Exception {
        return studentMapper.getStudentList();
    }

    @Override
    public Student findStudentByStudent_idAndPassword(Student student) throws Exception {
        return studentMapper.findStudentByStudent_idAndPassword(student);
    }

    @Override
    public Student findStudentIdById(Integer id) throws Exception {
        return studentMapper.findStudentIdById(id);
    }

    @Override
    public Student findStudentByName(String nickName) throws Exception {
        return studentMapper.findStudentByName(nickName);
    }

    @Override
    public List<Student> getStudentListByName(String student_id) throws Exception {
        return studentMapper.getStudentListByName(student_id);
    }

    @Override
    public Student findStudentIdByStudentId(String student_id) throws Exception {
        return studentMapper.findStudentIdByStudentId(student_id);
    }

    @Override
    public Student findStudentIdListByStudentId(String student_id) throws Exception {
        return studentMapper.findStudentIdByStudentId(student_id);
    }
}
