package com.app.model;

public class Player {
    private int playerId;
    private String playerName;
    private int playerAge;
    private String playerGender;
    private int playerTeamId;

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

    public int getPlayerTeamId() {
        return playerTeamId;
    }

    public void setPlayerTeamId(int playerTeamId) {
        this.playerTeamId = playerTeamId;
    }

    public Player() {
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerId=" + playerId +
                ", playerName='" + playerName + '\'' +
                ", playerAge=" + playerAge +
                ", playerGender='" + playerGender + '\'' +
                ", playerTeamId=" + playerTeamId +
                '}';
    }
}
