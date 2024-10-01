package com.demo.demoSpringboot.service.impl;


import com.demo.demoSpringboot.entities.Student;
import com.demo.demoSpringboot.repositery.StudentRepository;
import com.demo.demoSpringboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {


    @Autowired
    private StudentRepository studentRepository;


    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }
}
