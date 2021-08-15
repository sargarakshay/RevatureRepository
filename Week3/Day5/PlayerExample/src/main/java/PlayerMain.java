import dao.exception.BusinessException;
import model.Player;
import model.Team;
import org.apache.log4j.Logger;
import service.player.PlayerMainFunctionality;
import service.player.impl.PlayerMainFunctionalityImpl;
import service.search.PlayerSearchService;
import service.search.impl.PlayerSearchServiceImpl;

import java.util.List;
import java.util.Scanner;

public class PlayerMain {
    private static final Logger log = Logger.getLogger(PlayerMain.class);

    public static void main(String[] args) {
        PlayerSearchService playerSearchService = new PlayerSearchServiceImpl();
        PlayerMainFunctionality playerMainFunctionality = new PlayerMainFunctionalityImpl();

        Scanner sc = new Scanner(System.in);
        int ch = 0;
        int searchOption;
        do {
            log.info("");
            log.info("-----------------------------");
            log.info("    Welcome To Main Menu");
            log.info("-----------------------------");
            log.info("Select Any 1 option...");
            log.info("1) Create Player");
            log.info("2) Update Player");
            log.info("3) Delete Player");
            log.info("4) Get All Player");
            log.info("5) Search Player");
            log.info("6) Exit");
            log.info("-----------------------------");
            log.info("Enter your choice : ");
            try {
                ch = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                log.warn(e);
            }

            switch (ch) {
                case 1:
                    try {
                        Player player = new Player();
                        log.info("Enter Player details one-by-one...");
                        log.info("Enter Player ID : ");
                        player.setId(Integer.parseInt(sc.nextLine()));
                        log.info("Enter Player name : ");
                        player.setName(sc.nextLine());
                        log.info("Enter Player age : ");
                        player.setAge(Integer.parseInt(sc.nextLine()));
                        log.info("Enter Player gender : ");
                        player.setGender(sc.nextLine());
                        log.info("Enter Player city : ");
                        player.setCity(sc.nextLine());
                        log.info("Enter Player sports name : ");
                        player.setSportsName(sc.nextLine());
                        log.info("Enter Player contact : ");
                        player.setContact(Long.parseLong(sc.nextLine()));
                        int teamMenuOption;
                        Team team = new Team();

                        log.info("Enter Team Id : ");
                        log.info("-----------------------------");
                        log.info("       IPL Team's List");
                        log.info("-----------------------------");
                        log.info("1) MI");
                        log.info("2) RCB");
                        log.info("3) SRH");
                        log.info("4) KKR");
                        log.info("5) CSK");
                        log.info("-----------------------------");
                        log.info("Select player team : ");
                        teamMenuOption = Integer.parseInt(sc.nextLine());
                        switch (teamMenuOption) {
                            case 1:
                                team.setTeamId(1);
                                team.setTeamName("MI");
                                break;
                            case 2:
                                team.setTeamId(2);
                                team.setTeamName("RCB");
                                break;
                            case 3:
                                team.setTeamId(3);
                                team.setTeamName("SRH");
                                break;
                            case 4:
                                team.setTeamId(4);
                                team.setTeamName("KKR");
                                break;
                            case 5:
                                team.setTeamId(5);
                                team.setTeamName("CSK");
                            default:
                                log.info("Invalid Team Id...");
                                break;
                        }
                        player.setTeam(team);

                        int isSucessfull = playerMainFunctionality.createPlayer(player);
                        if (isSucessfull == 1) {
                            log.info("Player created successfully!!!");
                            log.info("fetching data....please wait.....");
                            Thread.sleep(2000);
                            log.info(player);
                            log.info("\nReturning to Main Menu...");
                            Thread.sleep(2000);
                        }
                    } catch (BusinessException | InterruptedException e) {
                        log.warn(e.getMessage());
                        log.info("\nReturning to Main Menu...");
                    }
                    break;
                case 2:
                    log.info("Working On It 2");
                    break;
                case 3:
                    log.info("Working On It 3");
                    break;
                case 4:
                    log.info("Working On It 4");
                    break;
                case 5:
                    do {
                        log.info("");
                        log.info("-----------------------------");
                        log.info("       Find a Player");
                        log.info("-----------------------------");
                        log.info("1) Search by their Id");
                        log.info("2) Search by their Name");
                        log.info("3) Search by their Age");
                        log.info("4) Search by their Gender");
                        log.info("5) Search by their City");
                        log.info("6) Search by their SportsName");
                        log.info("7) Search by their Contact");
                        log.info("8) Search by their Team");
                        log.info("9) Return to Main Menu");
                        log.info("-----------------------------");
                        log.info("Enter your choice : ");

                        searchOption = Integer.parseInt(sc.nextLine());
                        switch (searchOption) {
                            case 1:
                                log.info("Enter player ID  : ");
                                try {
                                    int id = Integer.parseInt(sc.nextLine());
                                    Player player = playerSearchService.searchById(id);
                                    if (player != null) {
                                        log.info("Player with " + id + " found successfully");
                                        log.info("fetching data....please wait.....");
                                        Thread.sleep(2000);
                                        log.info(player);
                                        log.info("\nReturning to Find a Player Menu...");
                                        Thread.sleep(2000);
                                    }
                                } catch (NumberFormatException ex) {
                                    log.warn("Player Id should be digit only... Try Again");
                                } catch (BusinessException | InterruptedException e) {
                                    log.warn(e.getMessage());
                                    log.info("\nReturning to Find a Player Menu...");
                                }
                                break;
                            case 2:
                                log.info("Enter player name : ");
                                try {
                                    String name = sc.nextLine();
                                    List<Player> playerList = playerSearchService.searchByName(name);
                                    if (playerList.size() != 0) {
                                        log.info("Player name : " + name + "  is present database...");
                                        log.info("fetching data....please wait.....");
                                        for (Player player : playerList) {
                                            Thread.sleep(2000);
                                            log.info(player);
                                        }
                                        log.info("\nReturning to Find a Player Menu...");
                                        Thread.sleep(2000);
                                    }
                                } catch (BusinessException | InterruptedException e) {
                                    log.warn(e.getMessage());
                                    log.info("\nReturning to Find a Player Menu...");
                                }
                                break;
                            case 3:
                                log.info("Enter player age : ");
                                try {
                                    int age = Integer.parseInt(sc.nextLine());
                                    List<Player> playerList = playerSearchService.searchByAge(age);
                                    if (playerList != null) {
                                        log.info("Player age : " + age + "  is present database...");
                                        log.info("fetching data....please wait.....");
                                        for (Player player : playerList) {
                                            Thread.sleep(2000);
                                            log.info(player);
                                        }
                                        log.info("\nReturning to Find a Player Menu...");
                                        Thread.sleep(2000);
                                    }
                                } catch (BusinessException | InterruptedException e) {
                                    log.warn(e.getMessage());
                                    log.info("\nReturning to Find a Player Menu...");
                                }
                                break;
                            case 4:
                                log.info("Enter player gender : ");
                                try {
                                    String gender = sc.nextLine();
                                    List<Player> playerList = playerSearchService.searchByGender(gender);
                                    if (playerList != null) {
                                        log.info("Player gender " + gender + " is present in database");
                                        log.info("fetching data....please wait.....");
                                        for (Player player : playerList) {
                                            log.info(player);
                                            Thread.sleep(2000);
                                        }
                                        log.info("\nReturning to Find a Player Menu...");
                                        Thread.sleep(2000);
                                    }
                                } catch (BusinessException | InterruptedException e) {
                                    log.warn(e.getMessage());
                                    log.info("\nReturning to Find a Player Menu...");
                                }
                                break;
                            case 5:
                                log.info("Enter player city : ");
                                try {
                                    String city = sc.nextLine();
                                    List<Player> playerList = playerSearchService.searchByCity(city);
                                    if (playerList != null) {
                                        log.info("Player city " + city + " is present in database");
                                        log.info("fetching data....please wait.....");
                                        for (Player player : playerList) {
                                            log.info(player);
                                            Thread.sleep(2000);
                                        }
                                        log.info("\nReturning to Find a Player Menu...");
                                        Thread.sleep(2000);
                                    }
                                } catch (BusinessException | InterruptedException e) {
                                    log.warn(e.getMessage());
                                    log.info("\nReturning to Find a Player Menu...");
                                }
                                break;
                            case 6:
                                log.info("Enter sports name : ");
                                try {
                                    String sportsName = sc.nextLine();
                                    List<Player> playerList = playerSearchService.searchBySportsName(sportsName);
                                    if (playerList != null) {
                                        log.info("Player Sports Name " + sportsName + " is present in database");
                                        log.info("fetching data....please wait.....");
                                        for (Player player : playerList) {
                                            log.info(player);
                                            Thread.sleep(2000);
                                        }
                                        log.info("\nReturning to Find a Player Menu...");
                                        Thread.sleep(2000);
                                    }
                                } catch (BusinessException | InterruptedException e) {
                                    log.warn(e.getMessage());
                                    log.info("\nReturning to Find a Player Menu...");
                                }
                                break;
                            case 7:
                                log.info("Enter player contact : ");
                                try {
                                    long contact = Long.parseLong(sc.nextLine());
                                    Player player = playerSearchService.searchByContact(contact);
                                    if (player != null) {
                                        log.info("Player with " + contact + " found successfully");
                                        log.info("fetching data....please wait.....");
                                        Thread.sleep(2000);
                                        log.info(player);
                                        log.info("\nReturning to Find a Player Menu...");
                                        Thread.sleep(2000);
                                    }
                                } catch (BusinessException | InterruptedException e) {
                                    log.warn(e.getMessage());
                                    log.info("\nReturning to Find a Player Menu...");
                                }
                                break;
                            case 8:
                                log.info("Enter team to search : ");
                                try {
                                    String teamName = sc.nextLine();
                                    List<Player> playerList = playerSearchService.searchByTeamName(teamName);
                                    if (playerList.size() != 0) {
                                        log.info("Player Team Name : " + teamName + "  is present database...");
                                        log.info("fetching data....please wait.....");
                                        for (Player player : playerList) {
                                            Thread.sleep(2000);
                                            log.info(player);
                                        }
                                        log.info("\nReturning to Find a Player Menu...");
                                        Thread.sleep(2000);
                                    }
                                } catch (BusinessException | InterruptedException e) {
                                    log.warn(e.getMessage());
                                    log.info("\nReturning to Find a Player Menu...");
                                }
                                break;
                            case 9:
                                log.info("See you soon....returning to Main Menu");
                                try {
                                    Thread.sleep(2000);
                                } catch (InterruptedException e) {
                                    log.warn(e.getMessage());
                                }
                                break;
                            default:
                                log.warn("Invalid User Input : Please enter numbers between (1-9)...");
                        }
                    } while (searchOption != 9);
                    break;

                case 6:
                    try {
                        log.info("Saving Data....");
                        Thread.sleep(1500);
                        log.info("Data saved successfully....");
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        log.error(e.getMessage());
                    }
                    log.info("See you soon....Bye Bye!!!");
                    break;
                default:
                    log.warn("Invalid User Input : Please enter numbers between (1-6)...");
            }
        } while (ch != 6);
    }
}
