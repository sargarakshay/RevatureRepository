package search.service;

import dao.exception.BusinessException;
import model.Player;

import java.util.List;

public interface PlayerSearchService {
    public Player searchById(int id) throws BusinessException;
    public Player searchByContact(long contact) throws BusinessException;
    public List<Player> searchByName(String name) throws BusinessException;
    public List<Player> searchByAge(int age) throws BusinessException;
    public List<Player> searchByGender(String gender) throws BusinessException;
    public List<Player> searchByCity(String city) throws BusinessException;
    public List<Player> searchBySportsName(String sportsName) throws BusinessException;
    public List<Player>  searchByTeamName(String teamName)  throws  BusinessException;
}
