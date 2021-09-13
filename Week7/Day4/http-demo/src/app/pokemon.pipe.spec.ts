import { PokemonPipe } from './pokemon.pipe';

describe('PokemonPipe', () => {
  it('create an instance', () => {
    const pipe = new PokemonPipe();
    expect(pipe).toBeTruthy();
  });
});
