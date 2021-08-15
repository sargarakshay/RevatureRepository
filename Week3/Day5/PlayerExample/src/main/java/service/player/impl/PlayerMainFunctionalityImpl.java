package service.player.impl;

import dao.PlayerDAO;
import dao.exception.BusinessException;
import dao.impl.PlayerDAOImpl;
import model.Player;
import service.player.PlayerMainFunctionality;

import java.util.List;

public class PlayerMainFunctionalityImpl implements PlayerMainFunctionality {
    PlayerDAO playerDAO = new PlayerDAOImpl();

    @Override
    public int createPlayer(Player player) throws BusinessException {
        int isSuccesfull = 0;
        isSuccesfull = playerDAO.createPlayer(player);

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
