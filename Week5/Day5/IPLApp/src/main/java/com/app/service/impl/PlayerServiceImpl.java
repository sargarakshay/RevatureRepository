package com.app.service.impl;

import com.app.model.Player;
import com.app.service.PlayerService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlayerServiceImpl implements PlayerService {
    public static Map<Integer, Player> map = new HashMap<>();
    public static int count;

    @Override
    public Player createPlayer(Player player) {
        map.put(++count, player);
        return player;
    }

    @Override
    public Player getPlayerId(int playerId) {
        return map.get(playerId);
    }

    @Override
    public Player updatePlayer(Player player) {
        map.put(player.getPlayerId(),player);
        return player;
    }

    @Override
    public void deletePlayer(int playerId) {
        map.remove(playerId);
    }

    @Override
    public List<Player> getAllPlayers() {
       return new ArrayList<>(map.values());
    }
}
