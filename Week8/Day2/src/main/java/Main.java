import dao.PlayerDAO;
import dao.impl.PlayerDAOImpl;
import model.Player;
import model.Team;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");

        PlayerDAOImpl playerDAOImpl = (PlayerDAOImpl) applicationContext.getBean("playerDAO");
        Player player = new Player();
        player.setPlayerId(109);
        player.setPlayerName("Akshay");
        player.setPlayerAge(21);
        player.setPlayerCity("Panvel");
        player.setPlayerContact(9987406550L);
        player.setPlayerSportsName("Coding");
        player.setPlayerGender("M");
        Team team = new Team();
        team.setPlayerTeamId(2);
        player.setTeam(team);

        //playerDAOImpl.addPlayer(player);

        List<Player> playerList =  playerDAOImpl.getAllPlayers();
        for (Player p : playerList) {
            System.out.println("Player Id: " +p.getPlayerId());
            System.out.println("Name : " +p.getPlayerName());
            System.out.println("Age : " +p.getPlayerAge());
            if (p.getPlayerGender().equals("M")) {
                System.out.println("Gender : Male");
            } else if(p.getPlayerGender().equals("F")) {
                System.out.println("Gender : Female");
            }
            System.out.println("Contact : "+p.getPlayerContact());
            System.out.println("Sports : "+p.getPlayerSportsName());
            System.out.println("Team : " +p.getTeam().getPlayerTeamName());
            System.out.println();
        }
    }
}
