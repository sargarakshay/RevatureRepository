package com.app.springschool.controller;

import com.app.springschool.model.Student;
import com.app.springschool.service.StudentCRUDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
    
@CrossOrigin
@RestController
public class StudentCRUDController {

    @Autowired
    private StudentCRUDService studentCRUDService;

    @PostMapping("/student")
    public Student addStudent(@RequestBody Student student) {
        return studentCRUDService.addStudent(student);
    }

    @PutMapping("/student")
    public Student updateStudent(@RequestBody Student student) {
        return studentCRUDService.updateStudent(student);
    }

    @GetMapping("/student/{studentId}")
    public Student getStudentById(@PathVariable int studentId) {
        return studentCRUDService.getStudentById(studentId);
    }

    @DeleteMapping("/student/{studentId}")
    public void deleteStudentById(@PathVariable int studentId) {
        studentCRUDService.deleteStudentById(studentId);
    }

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return studentCRUDService.getAllStudents();
    }
}
