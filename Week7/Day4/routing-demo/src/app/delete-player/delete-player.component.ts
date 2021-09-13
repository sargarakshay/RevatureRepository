import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Player } from '../player';
import { PlayerService } from '../player.service';

@Component({
  selector: 'app-delete-player',
  templateUrl: './delete-player.component.html',
  styleUrls: ['./delete-player.component.css']
})
export class DeletePlayerComponent implements OnInit {
  playerDeleteId:number;
  playerList:Player[];
  flag:boolean;

  constructor(private playerService:PlayerService, private router:Router) {
    this.flag = false;
  }
  
  ngOnInit() {
    this.playerList = this.playerService.viewPlayersService();
    if(this.playerList.length == 0) {
      this.flag = false;
    } else {
      this.flag = true;
    }
  }

  public deletePlayerById() {
    this.playerList = this.playerService.deletePlayerById(this.playerDeleteId);
    if(this.playerList.length == 0) {
      this.flag = false;
    }
    this.router.navigate(['/viewPlayers']);
  }
}
