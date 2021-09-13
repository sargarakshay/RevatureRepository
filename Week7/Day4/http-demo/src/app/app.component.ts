import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  flag:boolean;
  
  constructor(private router:Router) {
    this.flag = true;
  }

  getAllPokemons() {
    this.router.navigate(['/pokemons']);
    this.flag = false;
  }
}
