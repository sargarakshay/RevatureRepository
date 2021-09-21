package model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int playerId;
    private String playerName;
    private int playerAge;
    private String playerGender;
    private String playerCity;
    private String playerSportsName;
    @OneToMany(mappedBy = "player", fetch = FetchType.EAGER)
    private List<Team> teamList = new ArrayList<>();

    public Player() {
    }

    public List<Team> getTeamList() {
        return teamList;
    }

    public void setTeamList(List<Team> teamList) {
        this.teamList = teamList;
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

    public String getPlayerCity() {
        return playerCity;
    }

    public void setPlayerCity(String playerCity) {
        this.playerCity = playerCity;
    }

    public String getPlayerSportsName() {
        return playerSportsName;
    }

    public void setPlayerSportsName(String playerSportsName) {
        this.playerSportsName = playerSportsName;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerId=" + playerId +
                ", playerName='" + playerName + '\'' +
                ", playerAge=" + playerAge +
                ", playerGender=" + playerGender +
                ", playerCity='" + playerCity + '\'' +
                ", playerSportsName='" + playerSportsName + '\'' +
                ", teamList= blank" +
                '}';
    }
}
