import dao.PlayerDAO;
import dao.impl.PlayerDAOImpl;
import exception.BusinessException;
import model.Player;
import org.apache.log4j.Logger;

import java.util.List;

public class PlayerMain {

    private static final Logger log = Logger.getLogger(PlayerMain.class);
    public static void main(String[] args) {
        PlayerDAO playerDAO = new PlayerDAOImpl();
        log.info("Hello, This is my firstLog");

        try {
            List<Player> playerList = playerDAO.getPlayers();
            System.out.println("Player Details Below");
            for (Player player : playerList) {
                System.out.println(player);
            }
        } catch (BusinessException e) {
            System.out.println(e.getMessage());
        }
//
//        Player player = new Player(101, "MS Dhoni", 35, "Ranchi", "M","Cricket", 9892412328L);
//
//        try {
//            if(playerDAO.createPlayer(player) == 1) {
//                System.out.println("Player created with below details successfully");
//                System.out.println(player);
//            }
//        } catch (BusinessException e) {
//            e.printStackTrace();
//        }
//
//        try {
//            if (playerDAO.updatePlayer(100, 9987406550L) == 1) {
//                System.out.println("Player updated with below details successfully");
//                System.out.println(player);
//            }
//        } catch (BusinessException e) {
//            e.printStackTrace();
//        }
//
//
//        try {
//            if (playerDAO.deletePlayer(101) == 1) {
//                System.out.println("Player deleted successfully...");
//            }
//        } catch (BusinessException e) {
//            e.printStackTrace();
//        }


   }

}
