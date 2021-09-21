package model;

public class Team {
    private int playerTeamId;
    private String playerTeamName;

    public Team() {
    }

    public Team(int playerTeamId, String playerTeamName) {
        this.playerTeamId = playerTeamId;
        this.playerTeamName = playerTeamName;
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

    @Override
    public String toString() {
        return "Team{" +
                "playerTeamId=" + playerTeamId +
                ", playerTeamName='" + playerTeamName + '\'' +
                '}';
    }
}
