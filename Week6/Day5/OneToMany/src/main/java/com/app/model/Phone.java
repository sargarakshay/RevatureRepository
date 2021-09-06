package com.app.model;

import javax.persistence.*;

@Entity
@Table
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int phoneId;
    private int phoneAreaCode;
    private long phoneContact;
    @ManyToOne
    @JoinColumn(name = "employeeId")
    private Employee employee;

    public Phone() {
    }

    public Phone(int phoneId, int phoneAreaCode, long phoneContact, Employee employee) {
        this.phoneId = phoneId;
        this.phoneAreaCode = phoneAreaCode;
        this.phoneContact = phoneContact;
        this.employee = employee;
    }

    public int getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(int phoneId) {
        this.phoneId = phoneId;
    }

    public int getPhoneAreaCode() {
        return phoneAreaCode;
    }

    public void setPhoneAreaCode(int phoneAreaCode) {
        this.phoneAreaCode = phoneAreaCode;
    }

    public long getPhoneContact() {
        return phoneContact;
    }

    public void setPhoneContact(long phoneContact) {
        this.phoneContact = phoneContact;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "phoneId=" + phoneId +
                ", phoneAreaCode=" + phoneAreaCode +
                ", phoneContact=" + phoneContact +
                '}';
    }
}
