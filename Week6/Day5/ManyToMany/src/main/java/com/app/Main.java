package com.app;

import com.app.model.Person;
import com.app.model.Meeting;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Configuration configuration = new Configuration().configure();
        StandardServiceRegistryBuilder standardServiceRegistryBuilder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
        SessionFactory sessionFactory = configuration.buildSessionFactory(standardServiceRegistryBuilder.build());
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Person person1 = new Person();
        person1.setPersonId(1);
        person1.setPersonFirstName("Akshay");
        person1.setPersonLastName("Sargar");

        Person person2 = new Person();
        person2.setPersonId(2);
        person2.setPersonFirstName("Radha");
        person2.setPersonLastName("Sargar");

        Meeting meeting1 = new Meeting();
        meeting1.setMeetingId(101);
        meeting1.setMeetingSubject("Java Meeting");
        meeting1.setDate(new Date());

        Meeting meeting2 = new Meeting();
        meeting2.setMeetingId(102);
        meeting2.setMeetingSubject("Maven Meeting");
        meeting2.setDate(new Date());

        List<Person> personList = new ArrayList<>();
        List<Meeting> meetingList = new ArrayList<>();

        personList.add(person1);
        personList.add(person2);
        meetingList.add(meeting1);
        meetingList.add(meeting2);

        person1.setMeeting(meetingList);
        person2.setMeeting(meetingList);

        session.save(person1);
        session.save(person2);
        session.save(meeting1);
        session.save(meeting2);

        Query query = session.createQuery("from com.app.model.Person");
        List<Person> persons = query.list();
        for (Person person: persons) {
            System.out.println(person);
            for (Meeting meeting: person.getMeeting()) {
                System.out.println(meeting);
            }
        }

        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}
