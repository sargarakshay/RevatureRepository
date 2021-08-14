package search.service.impl;

import dao.PlayerSearchDAO;
import dao.exception.BusinessException;
import dao.impl.PlayerSearchDAOImpl;
import model.Player;
import search.service.PlayerSearchService;

import java.util.List;

public class PlayerSearchServiceImpl implements PlayerSearchService {

    PlayerSearchDAO playerSearchDAO = new PlayerSearchDAOImpl();

    @Override
    public Player searchById(int id) throws BusinessException {
        Player player = null;

        if (id < 100 || id > 1000) {
            throw new BusinessException("Please enter a valid ID to search a Player");
        } else {
            player = playerSearchDAO.searchById(id);
        }
        return player;
    }

    @Override
    public Player searchByContact(long contact) throws BusinessException {
        Player player = null;
        if (contact < 1) {
            throw new BusinessException("Please enter a valid contact to search a Player");
        } else {
            player = playerSearchDAO.searchByContact(contact);
        }
        return player;
    }

    @Override
    public List<Player> searchByName(String name) throws BusinessException {
        List<Player> playerList = null;
        if (name.length() == 0 && name.matches("[a-zA-Z]{2,10}")) {
            throw new BusinessException("Please enter a valid name to search a Player");
        } else {
            playerList = playerSearchDAO.searchByName(name);
        }
        return playerList;
    }

    @Override
    public List<Player> searchByAge(int age) throws BusinessException {
        List<Player> playerList = null;
        if (age <= 0 || age >= 100) {
            throw new BusinessException("Please enter a valid Age to search a Player");
        } else {
            playerList = playerSearchDAO.searchByAge(age);
        }
        return playerList;
    }

    @Override
    public List<Player> searchByGender(String gender) throws BusinessException {
        List<Player> playerList = null;
        if (gender.matches("[a-zA-Z]")) {
            playerList = playerSearchDAO.searchByGender(gender);
        } else {
            throw new BusinessException("Please enter a valid Age to search a Player");
        }
        return playerList;
    }

    @Override
    public List<Player> searchByCity(String city) throws BusinessException {
        List<Player> playerList = null;
        if (city.length() != 0 && city.matches("[a-zA-Z]{2,10}")) {
            playerList = playerSearchDAO.searchByCity(city);
        } else {
            throw new BusinessException("Please enter a valid city to search a Player");
        }
        return playerList;
    }

    @Override
    public List<Player> searchBySportsName(String sportsName) throws BusinessException {
        List<Player> playerList;
        if (sportsName.length() != 0 && sportsName.matches("[a-zA-Z]{2,10}")) {
            playerList = playerSearchDAO.searchByTeamName(sportsName);
        } else {
            throw new BusinessException("Please enter a valid Sports Name to search a Player");
        }
        return playerList;
    }

    @Override
    public List<Player> searchByTeamName(String teamName) throws BusinessException {
        List<Player> playerList = null;
        if (teamName.length() != 0 && teamName.matches("[a-zA-Z]{2,10}")) {
            playerList = playerSearchDAO.searchByTeamName(teamName);
        } else {
            throw new BusinessException("Please enter a valid Team Name to search a Player");
        }
        return playerList;
    }

}
