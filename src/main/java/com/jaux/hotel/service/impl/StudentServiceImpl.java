package com.jaux.hotel.service.impl;

import com.jaux.hotel.mapper.StudentMapper;
import com.jaux.hotel.pojo.Student;
import com.jaux.hotel.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student selectStudentById(int id) {
        Student student = studentMapper.selectStudentById(id);
        return student;
    }
}
