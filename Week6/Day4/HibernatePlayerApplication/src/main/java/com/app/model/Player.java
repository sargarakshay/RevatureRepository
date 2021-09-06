package com.app.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int playerId;
    private String playerName;
    private int playerAge;
    private String playerGender;
    private long playerContact;

    public Player() {
    }

    public Player(int playerId, String playerName, int playerAge, String playerGender, long playerContact) {
        super();
        this.playerId = playerId;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return playerId == player.playerId && playerAge == player.playerAge && playerContact == player.playerContact && Objects.equals(playerName, player.playerName) && Objects.equals(playerGender, player.playerGender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playerId, playerName, playerAge, playerGender, playerContact);
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
