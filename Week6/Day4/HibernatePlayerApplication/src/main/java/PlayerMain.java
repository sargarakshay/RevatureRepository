import com.app.model.Player;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class PlayerMain {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().configure();
        StandardServiceRegistryBuilder standardServiceRegistryBuilder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
        SessionFactory sessionFactory = configuration.buildSessionFactory(standardServiceRegistryBuilder.build());
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Player player = new Player();
        player.setPlayerName("Akshay");
        player.setPlayerAge(21);
        player.setPlayerGender("M");
        player.setPlayerContact(9987406550L);

        session.save(player);
        Player player1 = (Player) session.get(Player.class, 1);
        System.out.println(player1);

        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}
