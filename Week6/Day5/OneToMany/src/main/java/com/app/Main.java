package com.app;

import com.app.model.Employee;
import com.app.model.Phone;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().configure();
        StandardServiceRegistryBuilder standardServiceRegistryBuilder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
        SessionFactory sessionFactory = configuration.buildSessionFactory(standardServiceRegistryBuilder.build());
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();


        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        List<Phone> phoneList = new ArrayList<>();

        employee1.setEmployeeName("Akshay");
        employee2.setEmployeeName("Radha");

        Phone phone1 = new Phone();
        phone1.setEmployee(employee1);
        phone1.setPhoneContact(9987406550L);
        phone1.setPhoneAreaCode(91);

        Phone phone2 = new Phone();
        phone2.setEmployee(employee1);
        phone2.setPhoneContact(9284823974L);
        phone2.setPhoneAreaCode(91);

        Phone phone3 = new Phone();
        phone3.setEmployee(employee2);
        phone3.setPhoneAreaCode(91);
        phone3.setPhoneContact(9874563215L);


        employee1.getPhoneList().add(phone1);
        employee1.getPhoneList().add(phone2);
        employee2.getPhoneList().add(phone3);

        session.save(employee1);
        session.save(employee2);
        session.save(phone1);
        session.save(phone2);
        session.save(phone3);

        Query query =session.createQuery("from com.app.model.Employee");
        List<Employee> employeeList = query.list();
        System.out.println("Employee Details");
        for(Iterator iterator = employeeList.iterator(); iterator.hasNext();) {
            Employee emp = (Employee) iterator.next();
            System.out.println(emp.getEmployeeId()+") "+ emp.getEmployeeName());
            System.out.println("   Phone Numbers : ");
            for(Phone ph : emp.getPhoneList()) {
                System.out.println("   +"+ph.getPhoneAreaCode()+" "+ph.getPhoneContact());
            }
            System.out.println();
        }

        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}
