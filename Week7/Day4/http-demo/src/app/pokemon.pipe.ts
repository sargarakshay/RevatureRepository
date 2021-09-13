import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'pokemonName'
})
export class PokemonPipe implements PipeTransform {

  transform(pokemonName:string): string {
    return pokemonName.charAt(0).toUpperCase()+pokemonName.slice(1);
  }

}
