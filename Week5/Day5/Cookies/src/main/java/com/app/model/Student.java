package com.app.model;

public class Student {
    private int studentId;
    private String studentName;
    private long studentContact;
    private String universityName;
    private int yearOfPassing;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public long getStudentContact() {
        return studentContact;
    }

    public void setStudentContact(long studentContact) {
        this.studentContact = studentContact;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public int getYearOfPassing() {
        return yearOfPassing;
    }

    public void setYearOfPassing(int yearOfPassing) {
        this.yearOfPassing = yearOfPassing;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentContact=" + studentContact +
                ", universityName='" + universityName + '\'' +
                ", yearOfPassing=" + yearOfPassing +
                '}';
    }
}
