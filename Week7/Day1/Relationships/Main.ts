import { Player } from "./Player";
import { Team } from "./Team";

let player = new Player();
let team = new Team();

team.teamId = 1;
team.teamName = "INDIA";

player.personId = 1;
player.personName = "Sachin";
player.personAge = 44;
player.personCity = "Mumbai";
player.playerTeam = team;

player.getPlayerDetails(player);