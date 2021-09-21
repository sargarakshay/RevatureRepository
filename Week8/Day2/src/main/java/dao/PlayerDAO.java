package dao;

import model.Player;

import java.util.List;

public interface PlayerDAO {
    Player addPlayer(Player player);
    Player updatePlayer(Player player);
    Player getPlayerById(int id);
    void deletePlayer(int id);
    List<Player> getAllPlayers();
    List<Player> getPlayersBySportsName(String sportsName);
    List<Player> getPlayersByCity(String city);
    List<Player> getPlayersByAge(int age);
    List<Player> getPlayersByGender(String gender);
}
