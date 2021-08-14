package dao;

import model.Player;

import java.util.List;

public interface PlayerDAO {
    public List<Player> getAllPlayers();
    public int deletePlayer(int id);

}
