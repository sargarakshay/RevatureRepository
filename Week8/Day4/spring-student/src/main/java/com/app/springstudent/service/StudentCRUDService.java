package com.app.springstudent.service;

import com.app.springstudent.model.Student;

import java.util.List;

public interface StudentCRUDService {
    Student addStudent(Student student);

    Student updateStudent(Student student);

    Student getStudentById(int studentId);

    void deleteStudentById(int studentId);

    List<Student> getAllStudents();
}
