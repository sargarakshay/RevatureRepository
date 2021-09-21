package com.app.springschool.service.impl;

import com.app.springschool.model.Student;
import com.app.springschool.service.StudentCRUDService;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class StudentCRUDServiceImpl implements StudentCRUDService {

    String url = "http://localhost:8080/student";
    RestTemplate restTemplate = new RestTemplate();

    @Override
    public Student addStudent(Student student) {
        return restTemplate.postForObject(url, student, Student.class);
    }

    @Override
    public Student updateStudent(Student student) {
        restTemplate.put(url, student);
        return student;
    }

    @Override
    public Student getStudentById(int studentId) {
        ResponseEntity<Student> studentResponseEntity = restTemplate.exchange(url, HttpMethod.GET, null, Student.class);
        return studentResponseEntity.getBody();
    }

    @Override
    public void deleteStudentById(int studentId) {
        restTemplate.delete(url+"/"+studentId);
    }

    @Override
    public List<Student> getAllStudents() {
        ResponseEntity<List<Student>> responseEntity = restTemplate.exchange(url+"s", HttpMethod.GET, null, new ParameterizedTypeReference<List<Student>>() {
        });
        return responseEntity.getBody();
    }
}
