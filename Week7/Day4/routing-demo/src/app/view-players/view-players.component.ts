import { Component, OnInit } from '@angular/core';
import { Player } from '../player';
import { PlayerService } from '../player.service';

@Component({
  selector: 'app-view-players',
  templateUrl: './view-players.component.html',
  styleUrls: ['./view-players.component.css']
})
export class ViewPlayersComponent implements OnInit {

  flag:boolean;
  playerList:Player[];

  constructor(private playerService: PlayerService) {
    this.flag = false;
   }

  ngOnInit() {
    this.playerList = this.playerService.viewPlayersService();
    if(this.playerList.length > 0) {
      this.flag = true;
    }
  }

}
