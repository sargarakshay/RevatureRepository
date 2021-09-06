package com.app.model;

import javax.persistence.*;

@Entity
@Table
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int playerId;
    private String playerName;
    private int playerAge;
    private String playerGender;
    private long playerContact;

    public Player() {
    }

    public Player(String playerName, int playerAge, String playerGender, long playerContact) {
        super();
        this.playerName = playerName;
        this.playerAge = playerAge;
        this.playerGender = playerGender;
        this.playerContact = playerContact;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPlayerAge() {
        return playerAge;
    }

    public void setPlayerAge(int playerAge) {
        this.playerAge = playerAge;
    }

    public String getPlayerGender() {
        return playerGender;
    }

    public void setPlayerGender(String playerGender) {
        this.playerGender = playerGender;
    }

    public long getPlayerContact() {
        return playerContact;
    }

    public void setPlayerContact(long playerContact) {
        this.playerContact = playerContact;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerId=" + playerId +
                ", playerName='" + playerName + '\'' +
                ", playerAge=" + playerAge +
                ", playerGender='" + playerGender + '\'' +
                ", playerContact=" + playerContact +
                '}';
    }
}
