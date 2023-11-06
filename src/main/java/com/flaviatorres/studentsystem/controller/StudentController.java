package com.flaviatorres.studentsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flaviatorres.studentsystem.model.StudentModel;
import com.flaviatorres.studentsystem.service.StudentService;
@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {
    
     @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody StudentModel student){
        studentService.saveStudent(student);
        return "Novo estudante salvo";
    }

    @GetMapping("/getAll")
    public java.util.List<StudentModel> list(){
        return studentService.getAllStudents();
    }
}
