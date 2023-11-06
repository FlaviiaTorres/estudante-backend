package com.flaviatorres.studentsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flaviatorres.studentsystem.model.StudentModel;

public interface StudentRepository extends JpaRepository<StudentModel, Integer>{
    
}
