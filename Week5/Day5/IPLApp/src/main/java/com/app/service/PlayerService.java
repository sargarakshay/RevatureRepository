package com.app.service;

import com.app.model.Player;

import java.util.List;

public interface PlayerService {
    Player createPlayer(Player player);
    Player getPlayerId(int playerId);
    Player updatePlayer(Player player);
    void deletePlayer(int playerId);
    List<Player> getAllPlayers();
}
