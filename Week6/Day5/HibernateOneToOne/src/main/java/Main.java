import model.Car;
import model.Owner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().configure();
        StandardServiceRegistryBuilder standardServiceRegistryBuilder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
        SessionFactory sessionFactory = configuration.buildSessionFactory(standardServiceRegistryBuilder.build());
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Owner owner = new Owner();
        owner.setOwnerName("Akshay");
        Car car = new Car();
        car.setCarId(101);
        car.setCarName("Suzuki Swift");
        owner.setCar(car);
        session.save(owner);
        session.save(car);
        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}
