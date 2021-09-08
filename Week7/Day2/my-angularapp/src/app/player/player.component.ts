import { Component } from '@angular/core';
import { Player } from '../player';

@Component({
  selector: 'app-player',
  templateUrl: './player.component.html',
  styleUrls: ['./player.component.css']
})
export class PlayerComponent{
  playerList:Player[];
  player:Player;
  flag:boolean;
  deleteId:number;
  playerCount:number;

  constructor(){
    this.playerList = [];
    this.player = new Player();
    this.flag = false;
    this.playerCount = 0;
  }

  savePlayerData() {
    this.player.playerId = ++this.playerCount;
    this.playerList.push(this.player);
    this.player = new Player();
    console.log(this.playerList);
    this.flag = true;
  }

  deletePlayerData() {
    this.playerList.pop();
    if(this.playerList.length==0) {
      this.flag = false;
    }
  }

  removePlayerById() {
    console.log(this.deleteId);
    for(var i = 0; i < this.playerList.length; i++) {
      if(this.playerList[i].playerId == this.deleteId) {
        this.playerList.splice(i,1);
      }
    }
    
    if(this.playerList.length==0) {
      this.flag = false;
    }
  }
}
