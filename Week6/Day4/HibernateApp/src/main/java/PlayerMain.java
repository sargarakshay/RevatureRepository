import model.Player;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class PlayerMain {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().configure();
        StandardServiceRegistryBuilder standardServiceRegistryBuilder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
        SessionFactory sessionFactory = configuration.buildSessionFactory(standardServiceRegistryBuilder.build());

        Session session = sessionFactory.openSession();
        Player sachin = new Player("Sachin Tendulkar", 45, 'M', 9987406550L);
        session.save(sachin);
        session.close();
        sessionFactory.close();
    }
}
