package dao.impl;

import dao.PlayerDAO;
import model.Player;
import model.Team;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import java.util.List;

public class PlayerDAOImpl implements PlayerDAO {
    private SessionFactory sessionFactory;
    private Session session;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Session getSession() {
        return session = sessionFactory.openSession();
    }

    @Override
    public Player addPlayer(Player player) {
        Session session = getSession();
        Transaction transaction = session.beginTransaction();
        session.save(player);
        for (Team team : player.getTeamList())  {
            session.save(team);
        }
        transaction.commit();
        session.close();
        return player;
    }

    @Override
    public Player updatePlayer(Player player) {
        session = getSession();
        Transaction transaction = session.beginTransaction();
        session.update(player);
        transaction.commit();
        session.close();
        return player;
    }

    @Override
    public Player getPlayerById(int playerId) {
        session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Player player = (Player) session.get(Player.class, playerId);
        transaction.commit();
        session.close();
        return player;
    }

    @Override
    public List<Player> getAllPlayer() {
        session = getSession();
        return session.createQuery("from model.Player").list();
    }

    @Override
    public void deletePlayer(int playerId) {
        session = getSession();
        Transaction transaction = session.beginTransaction();
        Player player = new Player();
        player.setPlayerId(playerId);
        session.delete(player);
        transaction.commit();
        session.close();
    }
}
