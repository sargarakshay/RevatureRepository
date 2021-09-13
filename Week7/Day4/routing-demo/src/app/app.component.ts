import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  constructor(private router:Router) {
  }

  goToAddPlayer() {
    this.router.navigate(['/addPlayer'])
  }

  goTodeletePlayer() {
    this.router.navigate(['/deletePlayer'])
  }

  goToviewPlayers() {
    this.router.navigate(['/viewPlayers'])
  }
}
