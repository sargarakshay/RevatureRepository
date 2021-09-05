package com.app.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int employeeId;
    private String employeeName;
    @OneToMany(mappedBy = "employee", fetch = FetchType.EAGER)
    private List<Phone> phoneList = new ArrayList<>();

    public Employee() {
    }

    public Employee(int employeeId, String employeeName, List<Phone> phoneList) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.phoneList = phoneList;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public List<Phone> getPhoneList() {
        return phoneList;
    }

    public void setPhoneList(List<Phone> phoneList) {
        this.phoneList = phoneList;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", phoneList=" + phoneList +
                '}';
    }
}
