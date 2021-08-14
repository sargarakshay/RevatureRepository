import dao.exception.BusinessException;
import model.Player;
import org.apache.log4j.Logger;
import search.service.PlayerSearchService;
import search.service.impl.PlayerSearchServiceImpl;

import java.util.List;
import java.util.Scanner;

public class PlayerMain {
    private static final Logger log = Logger.getLogger(PlayerMain.class);

    public static void main(String[] args) {
        PlayerSearchService playerSearchService = new PlayerSearchServiceImpl();

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
                    log.info("Working On It 1");
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
                                        Thread.sleep(2000);
                                        log.info(player);
                                        log.info("\nReturning to Find a Player Menu...");
                                        Thread.sleep(2000);
                                    }
                                } catch (BusinessException | InterruptedException | NumberFormatException e) {
                                    log.error(e);
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
                                    log.error(e);
                                    log.info("\nReturning to Find a Player Menu...");
                                }
                                break;
                            case 3:
                                log.info("Enter player age : ");
                                try {
                                    int age = Integer.parseInt(sc.nextLine());
                                    List<Player> playerList = playerSearchService.searchByAge(age);
                                    if (playerList.size() != 0) {
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
                                    log.error(e);
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
                                    log.error(e);
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
                                    log.error(e);
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
                                    log.error(e);
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
                                    log.error(e);
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
                                    log.error(e);
                                    log.info("\nReturning to Find a Player Menu...");
                                }
                                break;
                            case 9:
                                log.info("See you soon....returning to Main Menu");
                                try {
                                    Thread.sleep(2000);
                                } catch (InterruptedException e) {
                                    log.error(e);
                                }
                                break;
                            default:
                                log.warn("Invalid User Input : Please enter numbers between (1-9)...");
                        }
                    } while (searchOption != 9);
                    break;

                case 6:
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        log.error(e);
                    }
                    log.info("See you soon....Bye Bye!!!");
                    break;
                default:
                    log.warn("Invalid User Input : Please enter numbers between (1-6)...");
            }
        } while (ch != 6);
    }
}
