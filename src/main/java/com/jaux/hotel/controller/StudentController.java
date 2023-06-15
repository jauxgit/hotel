package com.jaux.hotel.controller;

import com.jaux.hotel.common.R;
import com.jaux.hotel.pojo.Student;
import com.jaux.hotel.service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "学生管理接口")
@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @ApiOperation("根据id查询学生信息")
    @GetMapping("/info/{id}")
    public R<Student> selectById(@PathVariable("id") int id){
        Student student = studentService.selectStudentById(id);
        return R.success(student);
    }
}
