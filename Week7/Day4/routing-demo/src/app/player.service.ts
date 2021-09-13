import { Injectable } from '@angular/core';
import { Player } from './player';

@Injectable({
  providedIn: 'root'
})
export class PlayerService {
  playerList:Player[];
  count:number;

  constructor() { 
    this.playerList = [];
    this.count = 0;
  }

  public addPlayerService(player:Player) {
    player.playerId = ++this.count;
    this.playerList.push(player);
    console.log(this.playerList);
  }

  public viewPlayersService():Player[] {
    return this.playerList;
  }

  public deletePlayerById(playerDeleteId:number):Player[] {
    for(let i = 0; i < this.playerList.length; i++) {
      if(this.playerList[i].playerId == playerDeleteId) {
        this.playerList.splice(i, 1);
      }
    }
    return this.playerList;
  }
}
