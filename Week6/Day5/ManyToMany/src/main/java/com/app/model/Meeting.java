package com.app.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table
public class Meeting {
    @Id
    private int meetingId;
    private String meetingSubject;
    private Date date;
    @ManyToMany(mappedBy = "meeting")
    private List<Person> person;

    public Meeting() {
    }

    public Meeting(int meetingId, String meetingSubject, Date date) {
        this.meetingId = meetingId;
        this.meetingSubject = meetingSubject;
        this.date = date;
    }

    public int getMeetingId() {
        return meetingId;
    }

    public void setMeetingId(int meetingId) {
        this.meetingId = meetingId;
    }

    public String getMeetingSubject() {
        return meetingSubject;
    }

    public void setMeetingSubject(String meetingSubject) {
        this.meetingSubject = meetingSubject;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Person> getPerson() {
        return person;
    }

    public void setPerson(List<Person> person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Meeting{" +
                "meetingId=" + meetingId +
                ", meetingSubject='" + meetingSubject + '\'' +
                ", date=" + date +
                '}';
    }
}
