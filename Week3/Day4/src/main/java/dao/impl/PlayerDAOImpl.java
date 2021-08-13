package dao.impl;

import dao.PlayerDAO;
import dao.concDB.mySQLDbConnection;
import exception.BusinessException;
import model.Player;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PlayerDAOImpl implements PlayerDAO {

    @Override
    public List<Player> getPlayers() throws BusinessException {

        List<Player> playerList = new ArrayList<>();
        try(Connection connection = mySQLDbConnection.getConnection()) {
            String sql = "SELECT id, name, age, gender, city, sportsName, contact from player";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Player player = new Player();
                player.setId(resultSet.getInt("id"));
                player.setName(resultSet.getString("name"));
                player.setAge(resultSet.getInt("age"));
                player.setGender(resultSet.getString("gender"));
                player.setCity(resultSet.getString("city"));
                player.setContact(resultSet.getLong("contact"));
                player.setSportsName(resultSet.getString("sportsName"));
                playerList.add(player);
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
            throw new BusinessException("Internal error occurred, please contact support");
        }
        return playerList;
    }

    @Override
    public int createPlayer(Player player) throws BusinessException {
        int c = 0;
        try(Connection connection = mySQLDbConnection.getConnection()) {
            String sql = "INSERT INTO Player (id, name, age, gender, sportsName, city, contact) values (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1, player.getId());
            preparedStatement.setString(2, player.getName());
            preparedStatement.setInt(3, player.getAge());
            preparedStatement.setString(4, player.getGender());
            preparedStatement.setString(5, player.getSportsName());
            preparedStatement.setString(6, player.getCity());
            preparedStatement.setLong(7, player.getContact());

            c = preparedStatement.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
            throw new BusinessException("Internal error occurred, please contact support");
        }
        return c;
    }

    @Override
    public int updatePlayer(int id, long contact) throws BusinessException {
        int c = 0;
        try (Connection connection = mySQLDbConnection.getConnection()){
            String sql = "UPDATE player SET contact = ? WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, contact);
            preparedStatement.setInt(2, id);
            c = preparedStatement.executeUpdate();

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
            throw new BusinessException("Internal error occurred, please contact support");
        }
        return c;
    }

    @Override
    public int deletePlayer(int id) throws BusinessException {
        int c = 0;
        try(Connection connection = mySQLDbConnection.getConnection()){
            String sql = "DELETE FROM Player WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            c = preparedStatement.executeUpdate();
            
        } catch (ClassNotFoundException | SQLException e) {
            throw new BusinessException("Internal error occurred, please contact support");
        }
        return c;
    }
}
