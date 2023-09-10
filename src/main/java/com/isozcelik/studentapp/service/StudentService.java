package com.isozcelik.studentapp.service;

import com.isozcelik.studentapp.model.Student;

import java.util.List;

public interface StudentService {

    public Student saveStudent(Student student);
    public List<Student> getAllStudents();

}
