import dao.PlayerDAO;
import model.Player;
import model.Team;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-hibernate-bean.xml");

        PlayerDAO playerDAO = (PlayerDAO) applicationContext.getBean("playerDAO");

        Player player = new Player();
        player.setPlayerName("Akshay");
        player.setPlayerAge(21);
        player.setPlayerGender("M");
        player.setPlayerCity("Panvel");
        player.setPlayerSportsName("Coding");


        Player player2 = new Player();
        player.setPlayerName("Virat Kolhi");
        player.setPlayerAge(32);
        player.setPlayerGender("M");
        player.setPlayerCity("Delhi");
        player.setPlayerSportsName("Cricket");

        Team team1 = new Team();
        team1.setPlayerTeamName("RCB");
        team1.setPlayer(player);

        Team team2 = new Team();
        team2.setPlayerTeamName("CSK");
        team2.setPlayer(player);

        player.getTeamList().add(team1);
        player.getTeamList().add(team2);

        //playerDAO.addPlayer(player);
        List<Player> playerList = playerDAO.getAllPlayer();
        System.out.println("Player Details..");
        for (Player p: playerList) {
            System.out.println("\nPlayer Id : " + p.getPlayerId());
            System.out.println("Name   : " +p.getPlayerName());
            System.out.println("Age    : "+p.getPlayerAge());
            String gender = p.getPlayerGender().equals("M") ? "Male" : "Female";
            System.out.println("Gender : " + gender);
            System.out.println("City   : " +p.getPlayerCity());

            StringBuilder teamStr = new StringBuilder();
            for (Team team : p.getTeamList()) {
                teamStr.append(team.getPlayerTeamName()).append(", ");
            }
            System.out.print("Team   : " +teamStr.substring(0, teamStr.length()-2));
        }
    }
}
