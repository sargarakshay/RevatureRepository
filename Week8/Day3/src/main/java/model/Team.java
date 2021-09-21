package model;

import javax.persistence.*;

@Entity
@Table
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int playerTeamId;
    private String playerTeamName;
    @ManyToOne
    @JoinColumn(name = "playerId")
    private Player player;

    public Team() {
    }

    public Team(int playerTeamId, String playerTeamName, Player player) {
        this.playerTeamId = playerTeamId;
        this.playerTeamName = playerTeamName;
        this.player = player;
    }

    public int getPlayerTeamId() {
        return playerTeamId;
    }

    public void setPlayerTeamId(int playerTeamId) {
        this.playerTeamId = playerTeamId;
    }

    public String getPlayerTeamName() {
        return playerTeamName;
    }

    public void setPlayerTeamName(String playerTeamName) {
        this.playerTeamName = playerTeamName;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    @Override
    public String toString() {
        return "Team{" +
                "playerTeamId=" + playerTeamId +
                ", playerTeamName='" + playerTeamName + '\'' +
                ", player=" + player +
                '}';
    }
}
