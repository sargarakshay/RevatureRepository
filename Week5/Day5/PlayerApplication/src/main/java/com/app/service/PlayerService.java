package com.app.service;

import com.app.exception.BusinessException;
import com.app.model.Player;

import java.util.List;

public interface PlayerService {
    Player createPlayer(Player player) throws BusinessException;
    Player getPlayerId(int playerId) throws BusinessException;
    Player updatePlayer(Player player);
    void deletePlayer(int playerId);
    List<Player> getAllPlayers() throws BusinessException;
}
