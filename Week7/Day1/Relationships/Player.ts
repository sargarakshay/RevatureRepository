import { Person } from "./Person";
import { Team } from "./Team";

export class Player extends Person {
    private _playerTeam:Team;
    
    constructor() {
        super();
    }

    public get playerTeam():Team {
        return this._playerTeam;
    }

    public set playerTeam(playerTeam:Team) {
        this._playerTeam = playerTeam;
    }

    getPlayerDetails(player:Player):void {
        console.log("Player Details")
        console.log("ID    : " +player.personId)
        console.log("Name  : " +player.personName)
        console.log("Age   : " +player.personAge)
        console.log("City  : " +player.personCity)
        console.log("Team  : " +player.playerTeam.teamName + " (Team ID : "+player.playerTeam.teamId+")")
    }
}
