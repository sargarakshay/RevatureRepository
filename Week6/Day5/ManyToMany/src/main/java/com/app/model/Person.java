package com.app.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Person {
    @Id
    private int personId;
    private String personFirstName;
    private String personLastName;
    @ManyToMany
    private List<Meeting> meeting;

    public Person() {
    }

    public Person(int personId, String personFirstName, String personLastName) {
        this.personId = personId;
        this.personFirstName = personFirstName;
        this.personLastName = personLastName;
    }

    public List<Meeting> getMeeting() {
        return meeting;
    }

    public void setMeeting(List<Meeting> meeting) {
        this.meeting = meeting;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getPersonFirstName() {
        return personFirstName;
    }

    public void setPersonFirstName(String personFirstName) {
        this.personFirstName = personFirstName;
    }

    public String getPersonLastName() {
        return personLastName;
    }

    public void setPersonLastName(String personLastName) {
        this.personLastName = personLastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", personFirstName='" + personFirstName + '\'' +
                ", personLastName='" + personLastName + '\'' +
                '}';
    }
}
