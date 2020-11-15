package com.ruike.controller;

import com.ruike.pojo.Student;
import com.ruike.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author 吴泽胜
 * @FileName StudentController
 * @date 2020-11-15 11:05 下午
 * @Software: IntelliJ IDEA
 */

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void addStudent(@PathVariable Student student) throws Exception {
        System.out.println("Student add");
        studentService.addStudent(student);
    }
}
