package com.app;

import com.app.model.Player;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class PlayerMain {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(com.app.model.Player.class).configure();
        StandardServiceRegistryBuilder standardServiceRegistryBuilder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
        SessionFactory sessionFactory = configuration.buildSessionFactory(standardServiceRegistryBuilder.build());
        Session session = sessionFactory.openSession();

        Player player = new Player("Sachin", 45, "M", 91231414141L);
        Transaction transaction = session.beginTransaction();
        session.save(player);
        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}
