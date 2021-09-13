import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'pokemonId'
})
export class PokemonIdPipe implements PipeTransform {

  transform(pokemonId: number): string {
    return pokemonId.toString().padStart(3,'0');
  }

}
