import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Pokemon } from './pokemon';

@Injectable({
  providedIn: 'root'
})
export class PokemonService {
  pokemonAPI : string;

  constructor(private http:HttpClient) {
    this.pokemonAPI = "https://pokeapi.co/api/v2/pokemon/";
   }

  public getAllPokemons():Observable<Pokemon[]> {
    return this.http.get<Pokemon[]>(this.pokemonAPI+'?limit=100');
  }

  public getPokemonData(name:string) {
    return this.http.get(this.pokemonAPI+name);
  }
}
