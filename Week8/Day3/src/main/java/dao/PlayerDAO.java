package dao;

import model.Player;
import model.Team;

import java.util.List;

public interface PlayerDAO {
    Player addPlayer(Player player);
    Player updatePlayer(Player player);
    Player getPlayerById(int playerId);
    List<Player> getAllPlayer();
    void deletePlayer(int playerId);
}
