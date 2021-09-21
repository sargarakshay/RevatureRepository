package model;

public class Player {
    private int playerId;
    private String playerName;
    private int playerAge;
    private String playerGender;
    private String playerCity;
    private String playerSportsName;
    private long playerContact;
    private Team team;

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

    public long getPlayerContact() {
        return playerContact;
    }

    public void setPlayerContact(long playerContact) {
        this.playerContact = playerContact;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Player() {
    }

    public Player(int playerId, String playerName, int playerAge, String playerGender, String playerCity, String playerSportsName, long playerContact, Team team) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.playerAge = playerAge;
        this.playerGender = playerGender;
        this.playerCity = playerCity;
        this.playerSportsName = playerSportsName;
        this.playerContact = playerContact;
        this.team = team;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerId=" + playerId +
                ", playerName='" + playerName + '\'' +
                ", playerAge=" + playerAge +
                ", playerGender='" + playerGender + '\'' +
                ", playerCity='" + playerCity + '\'' +
                ", playerSportsName='" + playerSportsName + '\'' +
                ", playerContact=" + playerContact +
                ", team=" + team +
                '}';
    }

    //playerId, playerName, playerAge, playerGender, playerCity, playerSportsName, playerContact, playerTeamId
}
