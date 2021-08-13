package dao;

import exception.BusinessException;
import model.Player;

import java.sql.SQLException;
import java.util.List;

public interface PlayerDAO {
    public List<Player> getPlayers() throws BusinessException;
    public int createPlayer(Player player) throws BusinessException;
    public int updatePlayer(int id, long contact) throws BusinessException;
    public int deletePlayer(int i) throws BusinessException;
}
