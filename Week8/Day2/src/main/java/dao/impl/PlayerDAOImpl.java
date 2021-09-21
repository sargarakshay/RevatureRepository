package dao.impl;

import dao.PlayerDAO;
import dao.mapping.PlayerRowMapper;
import model.Player;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class PlayerDAOImpl implements PlayerDAO {
    private JdbcTemplate jdbcTemplate;
    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public Player addPlayer(Player player) {
        String sql = "INSERT INTO player(playerId ,playerName, playerAge, playerGender, playerCity, playerSportsName, playerContact, playerTeamId) VALUES (?,?,?,?,?,?,?,?)";
        jdbcTemplate.update(sql, player.getPlayerId(), player.getPlayerName(), player.getPlayerAge(), player.getPlayerGender(), player.getPlayerCity(), player.getPlayerSportsName(), player.getPlayerContact(), player.getTeam().getPlayerTeamId());
        return player;
    }

    @Override
    public Player updatePlayer(Player player) {
        String sql = "UPDATE player SET playerId = ?, playerName = ?, playerAge = ?, playerGender = ?, playerCity = ?, playerSportsName = ?, playerContact = ?, playerTeamId = ? WHERE playerId = ?";
        jdbcTemplate.update(sql, player.getPlayerId(), player.getPlayerName(), player.getPlayerAge(), player.getPlayerGender(), player.getPlayerCity(), player.getPlayerSportsName(), player.getPlayerContact(), player.getTeam().getPlayerTeamId());
        return player;
    }

    @Override
    public void deletePlayer(int playerId) {
    String sql = "DELETE FROM player WHERE playerId = ?";
    jdbcTemplate.update(sql, playerId);
    }

    @Override
    public List<Player> getAllPlayers() {
        String sql = "SELECT playerId, playerName, playerAge, playerGender, playerCity, playerSportsName, playerContact, t.playerTeamId, t.playerTeamName FROM player JOIN team t on t.playerTeamId = player.playerTeamId";
        return jdbcTemplate.query(sql, new PlayerRowMapper());
    }

    @Override
    public Player getPlayerById(int playerId) {
        String sql = "SELECT playerId, playerName, playerAge, playerGender, playerCity, playerSportsName, playerContact, t.playerTeamId, t.playerTeamName FROM player JOIN team t on t.playerTeamId = player.playerTeamId WHERE playerId = ?";
        return jdbcTemplate.queryForObject(sql, new Object[] {playerId}, new PlayerRowMapper());
    }

    @Override
    public List<Player> getPlayersBySportsName(String playerSportsName) {
        String sql = "SELECT playerId, playerName, playerAge, playerGender, playerCity, playerSportsName, playerContact, t.playerTeamId, t.playerTeamName FROM player JOIN team t on t.playerTeamId = player.playerTeamId WHERE playerSportsName = ?";
        return jdbcTemplate.query(sql, new Object[]{playerSportsName}, new PlayerRowMapper());
    }

    @Override
    public List<Player> getPlayersByCity(String playerCity) {
        String sql = "SELECT playerId, playerName, playerAge, playerGender, playerCity, playerSportsName, playerContact, t.playerTeamId, t.playerTeamName FROM player JOIN team t on t.playerTeamId = player.playerTeamId WHERE playerCity = ?";
        return jdbcTemplate.query(sql, new Object[]{playerCity}, new PlayerRowMapper());
    }

    @Override
    public List<Player> getPlayersByAge(int playerAge) {
        String sql = "SELECT playerId, playerName, playerAge, playerGender, playerCity, playerSportsName, playerContact, t.playerTeamId, t.playerTeamName FROM player JOIN team t on t.playerTeamId = player.playerTeamId WHERE playerAge = ?";
        return jdbcTemplate.query(sql, new Object[] {playerAge}, new PlayerRowMapper());
    }

    @Override
    public List<Player> getPlayersByGender(String playerGender) {
        String sql = "SELECT playerId, playerName, playerAge, playerGender, playerCity, playerSportsName, playerContact, t.playerTeamId, t.playerTeamName FROM player JOIN team t on t.playerTeamId = player.playerTeamId WHERE playerGender = ?";
        return jdbcTemplate.query(sql, new Object[]{playerGender}, new PlayerRowMapper());
    }
}
