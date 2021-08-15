package dao.impl;

import dao.PlayerDAO;
import dao.dbutil.MySQLDBConnection;
import dao.exception.BusinessException;
import model.Player;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class PlayerDAOImpl implements PlayerDAO {
    private static final Logger log = Logger.getLogger(PlayerDAOImpl.class);

    @Override
    public int createPlayer(Player player) throws BusinessException {
        int isSuccesfull = 0;
        try(Connection connection = MySQLDBConnection.getConnection()) {
            String sql = "INSERT INTO player(id, name, age, gender, city, sportsName, contact, teamId) VALUES(?,?,?,?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, player.getId());
            preparedStatement.setString(2, player.getName());
            preparedStatement.setInt(3, player.getAge());
            preparedStatement.setString(4, player.getGender());
            preparedStatement.setString(5, player.getCity());
            preparedStatement.setString(6, player.getSportsName());
            preparedStatement.setLong(7, player.getContact());
            preparedStatement.setInt(8, player.getTeam().getTeamId());

            isSuccesfull = preparedStatement.executeUpdate();
            if (isSuccesfull != 1) {
                throw new BusinessException("Player insertion failed! Check your query and try again!!!");
            }

        } catch (ClassNotFoundException | SQLException e) {
            log.warn(e.getMessage());
            throw new BusinessException("Internal error occurred contact ");
        }
        return isSuccesfull;
    }

    @Override
    public int updatePlayer(int id) throws BusinessException {
        return 0;
    }

    @Override
    public int deletePlayer(int id) throws BusinessException {
        return 0;
    }

    @Override
    public List<Player> getAllPlayers() throws BusinessException {
        return null;
    }
}
