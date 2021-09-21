package dao.mapping;

import model.Player;
import model.Team;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PlayerRowMapper implements RowMapper<Player> {
    @Override
    public Player mapRow(ResultSet resultSet, int i) throws SQLException {
        Player player = new Player();
        player.setPlayerId(resultSet.getInt("playerId"));
        player.setPlayerName(resultSet.getString("playerName"));
        player.setPlayerAge(resultSet.getInt("playerAge"));
        player.setPlayerGender(resultSet.getString("playerGender"));
        player.setPlayerCity(resultSet.getString("playerCity"));
        player.setPlayerContact(resultSet.getLong("playerContact"));
        player.setPlayerSportsName(resultSet.getString("playerSportsName"));
        Team team = new Team();
        team.setPlayerTeamId(resultSet.getInt("playerTeamId"));
        team.setPlayerTeamName(resultSet.getString("playerTeamName"));
        player.setTeam(team);
        return player;
    }
}
