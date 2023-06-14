package com.jaux.hotel.controller;

import com.jaux.hotel.common.R;
import com.jaux.hotel.pojo.Student;
import com.jaux.hotel.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/info/{id}")
    public R<Student> selectById(@PathVariable("id") int id){
        Student student = studentService.selectStudentById(id);
        return R.success(student);
    }
}
