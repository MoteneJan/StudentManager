package com.JanMotene.Student.Manager.Controller;

import com.JanMotene.Student.Manager.Model.Student;
import com.JanMotene.Student.Manager.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudent(){
        return studentRepository.findAll();
    }
}
