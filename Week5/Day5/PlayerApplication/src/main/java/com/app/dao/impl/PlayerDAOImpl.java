package com.app.dao.impl;

import com.app.dao.PlayerDAO;
import com.app.dao.dbutil.MySQLDBConnection;
import com.app.exception.BusinessException;
import com.app.model.Player;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PlayerDAOImpl implements PlayerDAO {
    @Override
    public Player createPlayer(Player player) throws BusinessException {

        try(Connection connection = MySQLDBConnection.getConnection()) {
            String sql = "INSERT INTO player(playerName, playerAge, playerGender, playerTeamId) VALUES(?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            preparedStatement.setString(1, player.getPlayerName());
            preparedStatement.setInt(2, player.getPlayerAge());
            preparedStatement.setString(3, player.getPlayerGender());
            preparedStatement.setInt(4, player.getPlayerTeamId());

            preparedStatement.executeUpdate();
            ResultSet resultSet = preparedStatement.getGeneratedKeys();
            if (resultSet.next()) {
              player.setPlayerId(resultSet.getInt(1));
            }
        } catch (ClassNotFoundException | SQLException e) {
            throw new BusinessException("Internal Error Occurred, Please contact sysAdmin");
        }
        return player;
    }

    @Override
    public Player getPlayerId(int playerId) throws BusinessException {
        Player player = new Player();
        try(Connection connection = MySQLDBConnection.getConnection()) {
            String sql = "SELECT playerId, playerName, playerAge, playerGender, playerTeamId FROM player WHERE playerId=?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, playerId);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                player.setPlayerId(resultSet.getInt("playerId"));
                player.setPlayerName(resultSet.getString("playerName"));
                player.setPlayerAge(resultSet.getInt("playerAge"));
                player.setPlayerGender(resultSet.getString("playerGender"));
                player.setPlayerTeamId(resultSet.getInt("playerTeamId"));
            }
        } catch (ClassNotFoundException | SQLException e) {
            throw new BusinessException("Internal Error Occurred, Please contact sysAdmin");
        }
        return player;
    }

    @Override
    public Player updatePlayer(Player player) throws BusinessException {
        try(Connection connection = MySQLDBConnection.getConnection()) {
            String sql = "UPDATE player SET playerName=?, playerAge=?,playerGender=?,playerTeamId=? WHERE playerId=?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, player.getPlayerName());
            preparedStatement.setInt(2, player.getPlayerAge());
            preparedStatement.setString(3, player.getPlayerGender());
            preparedStatement.setInt(4, player.getPlayerTeamId());

        } catch (ClassNotFoundException | SQLException e) {
            throw new BusinessException("Internal Error Occurred, Please contact sysAdmin");
        }
        return player;
    }

    @Override
    public void deletePlayer(int playerId) throws BusinessException {
        try(Connection connection = MySQLDBConnection.getConnection()) {
            String sql = "DELETE FROM player WHERE playerId=?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, playerId);
            preparedStatement.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {
            throw new BusinessException("Internal Error Occurred, Please contact sysAdmin");
        }
    }

    @Override
    public List<Player> getAllPlayers() throws BusinessException {
        ArrayList<Player> playerList = new ArrayList<>();
        try(Connection connection = MySQLDBConnection.getConnection()) {
            String sql = "SELECT playerId, playerName, playerAge, playerGender, playerTeamId FROM player";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Player player = new Player();
                player.setPlayerId(resultSet.getInt("playerId"));
                player.setPlayerName(resultSet.getString("playerName"));
                player.setPlayerAge(resultSet.getInt("playerAge"));
                player.setPlayerGender(resultSet.getString("playerGender"));
                player.setPlayerTeamId(resultSet.getInt("playerTeamId"));
                playerList.add(player);
            }
        } catch (ClassNotFoundException | SQLException e) {
            throw new BusinessException("Internal Error Occurred, Please contact sysAdmin");
        }
        return playerList;
    }
}
