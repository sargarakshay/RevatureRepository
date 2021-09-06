package com.app.service.impl;

import com.app.dao.PlayerDAO;
import com.app.dao.impl.PlayerDAOImpl;
import com.app.exception.BusinessException;
import com.app.model.Player;
import com.app.service.PlayerService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlayerServiceImpl implements PlayerService {
    PlayerDAO playerDAO = new PlayerDAOImpl();
    @Override
    public Player createPlayer(Player player) throws BusinessException {
        if (player!=null) {
            player = playerDAO.createPlayer(player);
        }
        return player;
    }

    @Override
    public Player getPlayerId(int playerId) throws BusinessException {
        Player player = new Player();
        if (playerId!= 0) {
            player = playerDAO.getPlayerId(playerId);
        }
        return player;
    }

    @Override
    public Player updatePlayer(Player player) {
        return null;
    }

    @Override
    public void deletePlayer(int playerId) {

    }

    @Override
    public List<Player> getAllPlayers() throws BusinessException {
        List<Player> playerArrayList;
        playerArrayList = playerDAO.getAllPlayers();
        return playerArrayList;
    }
//    public static Map<Integer, Player> map = new HashMap<>();
//    public static int count=0;
//
//    @Override
//    public Player createPlayer(Player player) {
//        player.setPlayerId(++count);
//        map.put(count, player);
//        return player;
//    }
//
//    @Override
//    public Player getPlayerId(int playerId) {
//        return map.get(playerId);
//    }
//
//    @Override
//    public Player updatePlayer(Player player) {
//        map.put(player.getPlayerId(),player);
//        return player;
//    }
//
//    @Override
//    public void deletePlayer(int playerId) {
//        map.remove(playerId);
//    }
//
//    @Override
//    public List<Player> getAllPlayers() {
//       return new ArrayList<>(map.values());
//    }


}
