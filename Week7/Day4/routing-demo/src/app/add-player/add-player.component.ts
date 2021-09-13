import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Player } from '../player';
import { PlayerService } from '../player.service';

@Component({
  selector: 'app-add-player',
  templateUrl: './add-player.component.html',
  styleUrls: ['./add-player.component.css']
})

export class AddPlayerComponent {
  private player:Player;

  constructor(private playerService:PlayerService, private router:Router) { 
    this.player = new Player();
  }

  addPlayer() {
    this.playerService.addPlayerService(this.player);
    this.router.navigate(['/viewPlayers']);
  }

}
