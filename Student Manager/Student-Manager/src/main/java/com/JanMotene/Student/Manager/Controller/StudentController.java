package com.JanMotene.Student.Manager.Controller;

import com.JanMotene.Student.Manager.Model.Student;
import com.JanMotene.Student.Manager.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping
    public List<Student> getAllStudent(){
        return studentRepository.findAll();
    }
}
