package com.flaviatorres.studentsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flaviatorres.studentsystem.model.StudentModel;
import com.flaviatorres.studentsystem.repository.StudentRepository;

@Service
public class StudentServiceImplement implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public StudentModel saveStudent(StudentModel student) {
        return studentRepository.save(student);
    }

    @Override
    public List<StudentModel> getAllStudents() {
        return studentRepository.findAll();
    }
    
}
