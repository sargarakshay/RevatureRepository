package com.app.dao;

import com.app.exception.BusinessException;
import com.app.model.Player;

import java.util.List;

public interface PlayerDAO {
    Player createPlayer(Player player) throws BusinessException;
    Player getPlayerId(int playerId) throws BusinessException;
    Player updatePlayer(Player player) throws BusinessException;
    void deletePlayer(int playerId) throws BusinessException;
    List<Player> getAllPlayers() throws BusinessException;
}
