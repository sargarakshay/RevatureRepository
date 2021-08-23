package dao.impl;

import dao.PlayerSearchDAO;
import dao.dbutil.MySQLDBConnection;
import dao.exception.BusinessException;
import model.Player;
import model.Team;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PlayerSearchDAOImpl implements PlayerSearchDAO {
    private static final Logger log = Logger.getLogger(PlayerSearchDAOImpl.class);

    @Override
    public Player searchById(int id) throws BusinessException {
        Player player;
        try (Connection connection = MySQLDBConnection.getConnection()) {

            String sql = "SELECT p.id, name, age, gender, sportsName, city, contact, t.teamName FROM player p JOIN team t ON p.teamId = t.teamId WHERE p.id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                player = new Player();
                player.setId(id);
                player.setName(resultSet.getString("name"));
                player.setGender(resultSet.getString("gender"));
                player.setAge(resultSet.getInt("age"));
                player.setCity(resultSet.getString("city"));
                player.setSportsName(resultSet.getString("sportsName"));
                player.setContact(resultSet.getLong("contact"));
                Team team = new Team();
                team.setTeamName(resultSet.getString("teamName"));
                player.setTeam(team);
            } else {
                throw new BusinessException("We couldn't find any matches for " + id + ".\nDouble check your search for any typos or spelling errors or try a different search term.");
            }
        } catch (SQLException | ClassNotFoundException e) {
            log.error(e);
            throw new BusinessException("Internal error occurred contact ");
        }
        return player;
    }

    @Override
    public Player searchByContact(long contact) throws BusinessException {
        Player player;
        try (Connection connection = MySQLDBConnection.getConnection()) {
            String sql = "SELECT p.id, name, age, gender, sportsName, city, contact, t.teamName FROM player p JOIN team t ON p.teamId = t.teamId WHERE p.contact = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, contact);

            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                player = new Player();
                player.setId(resultSet.getInt("id"));
                player.setName(resultSet.getString("name"));
                player.setAge(resultSet.getInt("age"));
                player.setGender(resultSet.getString("gender"));
                player.setSportsName(resultSet.getString("sportsName"));
                player.setCity(resultSet.getString("city"));
                player.setContact(contact);
                Team team = new Team();
                team.setTeamName(resultSet.getString("teamName"));
                player.setTeam(team);
            } else {
                throw new BusinessException("We couldn't find any matches for " + contact + "\nDouble check your search for any typos or spelling errors or try a different search term.");
            }
        } catch (ClassNotFoundException | SQLException e) {
            log.error(e);
            throw new BusinessException("Internal error occurred contact ");
        }
        return player;
    }

    @Override
    public List<Player> searchByName(String name) throws BusinessException {
        List<Player> playerList = new ArrayList<>();
        try (Connection connection = MySQLDBConnection.getConnection()) {

            String sql = "SELECT p.id, name, age, gender, sportsName, city, contact, t.teamName FROM player p JOIN team t ON p.teamId = t.teamId WHERE p.name = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, name);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Player player = new Player();
                Team team = new Team();

                player.setId(resultSet.getInt("id"));
                player.setName(name);
                player.setAge(resultSet.getInt("age"));
                player.setGender(resultSet.getString("gender"));
                player.setSportsName(resultSet.getString("sportsName"));
                player.setCity(resultSet.getString("city"));
                player.setContact(resultSet.getLong("contact"));
                team.setTeamName(resultSet.getString("teamName"));
                player.setTeam(team);

                playerList.add(player);
            }
            if (playerList.size() == 0) {
                throw new BusinessException("We couldn't find any matches for " + name + "\nDouble check your search for any typos or spelling errors or try a different search term.");
            }
        } catch (ClassNotFoundException | SQLException e) {
            log.error(e);
            throw new BusinessException("Internal error occurred contact ");
        }
        return playerList;
    }

    @Override
    public List<Player> searchByAge(int age) throws BusinessException {
        List<Player> playerList = new ArrayList<>();
        try (Connection connection = MySQLDBConnection.getConnection()) {
            String sql = "SELECT p.id, name, age, gender, sportsName, city, contact, t.teamName FROM player p JOIN team t ON p.teamId = t.teamId WHERE p.age = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, age);

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Player player = new Player();
                Team team = new Team();
                player.setId(resultSet.getInt("id"));
                player.setName(resultSet.getString("name"));
                player.setAge(resultSet.getInt("age"));
                player.setSportsName(resultSet.getString("sportsName"));
                player.setCity(resultSet.getString("city"));
                player.setContact(resultSet.getLong("contact"));
                team.setTeamName(resultSet.getString("teamName"));
                player.setGender(resultSet.getString("gender"));
                player.setTeam(team);

                playerList.add(player);
            }

            if (playerList.size() == 0) {
                throw new BusinessException("We couldn't find any matches for " + age + "\nDouble check your search for any typos or spelling errors or try a different search term.");
            }
        } catch (ClassNotFoundException | SQLException e) {
            log.error(e);
            throw new BusinessException("Internal error occurred contact ");
        }
        return playerList;
    }

    @Override
    public List<Player> searchByGender(String gender) throws BusinessException {
        List<Player> playerList = new ArrayList<>();
        try (Connection connection = MySQLDBConnection.getConnection()) {
            String sql = "SELECT p.id, name, age, gender, sportsName, city, contact, t.teamName FROM player p JOIN team t ON p.teamId = t.teamId WHERE p.gender = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, gender);

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Player player = new Player();
                player.setId(resultSet.getInt("id"));
                player.setName(resultSet.getString("name"));
                player.setGender("gender");
                player.setAge(resultSet.getInt("age"));
                player.setContact(resultSet.getLong("contact"));
                player.setCity(resultSet.getString("city"));
                player.setSportsName(resultSet.getString("sportsName"));
                Team team = new Team();
                team.setTeamName(resultSet.getString("teamName"));
                player.setTeam(team);
                playerList.add(player);
            }

            if (playerList.size() == 0) {
                throw new BusinessException("We couldn't find any matches for " + gender + "\nDouble check your search for any typos or spelling errors or try a different search term.");
            }
        } catch (ClassNotFoundException | SQLException e) {
            log.error(e);
            throw new BusinessException("Internal error occurred contact ");
        }
        return playerList;
    }

    @Override
    public List<Player> searchByCity(String city) throws BusinessException {
        List<Player> playerList = new ArrayList<>();
        try (Connection connection = MySQLDBConnection.getConnection()) {
            String sql = "SELECT p.id, name, age, gender, sportsName, city, contact, t.teamName FROM player p JOIN team t ON p.teamId = t.teamId WHERE p.city = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, city);

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Player player = new Player();
                player.setId(resultSet.getInt("id"));
                player.setName(resultSet.getString("name"));
                player.setAge(resultSet.getInt("age"));
                player.setGender(resultSet.getString("gender"));
                player.setContact(resultSet.getLong("contact"));
                player.setCity("city");
                player.setSportsName(resultSet.getString("sportsName"));
                Team team = new Team();
                team.setTeamName(resultSet.getString("teamName"));
                player.setTeam(team);
                playerList.add(player);
            }

            if (playerList.size() == 0) {
                throw new BusinessException("We couldn't find any matches for " + city + "\nDouble check your search for any typos or spelling errors or try a different search term.");
            }
        } catch (ClassNotFoundException | SQLException e) {
            log.error(e);
            throw new BusinessException("Internal error occurred contact ");
        }
        return playerList;
    }

    @Override
    public List<Player> searchBySportsName(String sportsName) throws BusinessException {
        List<Player> playerList = new ArrayList<>();
        try (Connection connection = MySQLDBConnection.getConnection()) {
            String sql = "SELECT p.id, name, age, gender, sportsName, city, contact, t.teamName FROM player p JOIN team t ON p.teamId = t.teamId WHERE p.sportsName = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, sportsName);

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Player player = new Player();
                player.setId(resultSet.getInt("id"));
                player.setName(resultSet.getString("name"));
                player.setAge(resultSet.getInt("age"));
                player.setGender(resultSet.getString("gender"));
                player.setContact(resultSet.getLong("contact"));
                player.setCity(resultSet.getString("city"));
                player.setSportsName("sportsName");
                Team team = new Team();
                team.setTeamName(resultSet.getString("teamName"));
                player.setTeam(team);
                playerList.add(player);
            }

            if (playerList.size() == 0) {
                throw new BusinessException("We couldn't find any matches for " + sportsName + "\nDouble check your search for any typos or spelling errors or try a different search term.");
            }
        } catch (ClassNotFoundException | SQLException e) {
            log.error(e);
            throw new BusinessException("Internal error occurred contact ");
        }
        return playerList;
    }

    @Override
    public List<Player> searchByTeamName(String teamName) throws BusinessException {
        List<Player> playerList = new ArrayList<>();
        try (Connection connection = MySQLDBConnection.getConnection()) {
            String sql = "SELECT p.id, name, age, gender, sportsName, city, contact, t.teamName FROM player p JOIN team t ON p.teamId = t.teamId WHERE t.teamName = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, teamName);

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Player player = new Player();
                Team team = new Team();
                player.setId(resultSet.getInt("id"));
                player.setName(resultSet.getString("name"));
                player.setAge(resultSet.getInt("age"));
                player.setGender(resultSet.getString("gender"));
                player.setSportsName(resultSet.getString("sportsName"));
                player.setCity(resultSet.getString("city"));
                player.setContact(resultSet.getLong("contact"));
                team.setTeamName(teamName);
                player.setTeam(team);

                playerList.add(player);
            }

            if (playerList.size() == 0) {
                throw new BusinessException("We couldn't find any matches for " + teamName + "\nDouble check your search for any typos or spelling errors or try a different search term.");
            }
        } catch (ClassNotFoundException | SQLException e) {
            log.error(e);
            throw new BusinessException("Internal error occurred contact ");
        }
        return playerList;
    }
}
