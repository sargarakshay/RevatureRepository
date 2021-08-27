package com.app;


import com.app.model.Player;

public class PlayerData {
    public void getPlayerData(Player player) {
        System.out.println("Player Name : " + player.getName());
        System.out.println("Player Age : " + player.getAge());
        System.out.println("Player City : " + player.getCity());
    }
}
