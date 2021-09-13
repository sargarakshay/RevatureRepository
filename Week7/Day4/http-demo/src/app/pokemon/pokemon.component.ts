import { Component, OnInit } from '@angular/core';
import { PokemonService } from '../pokemon.service';

@Component({
  selector: 'app-pokemon',
  templateUrl: './pokemon.component.html',
  styleUrls: ['./pokemon.component.css']
})
export class PokemonComponent implements OnInit{

  pokemonList:any[] = [];

  constructor(private pokemonService:PokemonService) {

  }
  
  ngOnInit(): void {
    this.pokemonService.getAllPokemons()
      .subscribe((pokemons:any) => {
        pokemons.results.forEach(result => {
          this.pokemonService.getPokemonData(result.name)
            .subscribe((poke:any) => {
              this.pokemonList.push(poke);
        })
      });
    });
    console.log(this.pokemonList)
  }
}
