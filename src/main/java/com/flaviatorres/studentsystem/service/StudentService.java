package com.flaviatorres.studentsystem.service;

import java.util.List;

import com.flaviatorres.studentsystem.model.StudentModel;

public interface StudentService {

    public StudentModel saveStudent(StudentModel student);

    public List<StudentModel> getAllStudents();
}
