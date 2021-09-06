package model;
import javax.persistence.*;

@Entity
@Table
public class Player {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private int playerId;
    private String playerName;
    private int playerAge;
    private char playerGender;
    private long playerContact;



    public Player(String playerName, int playerAge, char playerGender, long playerContact) {
        this.playerName = playerName;
        this.playerAge = playerAge;
        this.playerGender = playerGender;
        this.playerContact = playerContact;
    }

    public Player() {

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

    public char getPlayerGender() {
        return playerGender;
    }

    public void setPlayerGender(char playerGender) {
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
                ", playerGender=" + playerGender +
                ", playerContact=" + playerContact +
                '}';
    }
}
