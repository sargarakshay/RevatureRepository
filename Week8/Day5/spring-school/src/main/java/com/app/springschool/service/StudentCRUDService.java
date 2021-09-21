package com.app.springschool.service;

import com.app.springschool.model.Student;

import java.util.List;

public interface StudentCRUDService {
    Student addStudent(Student student);
    Student updateStudent(Student student);
    Student getStudentById(int studentId);
    void deleteStudentById(int studentId);
    List<Student> getAllStudents();
}
