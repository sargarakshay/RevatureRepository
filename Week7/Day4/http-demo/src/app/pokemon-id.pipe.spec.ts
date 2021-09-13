import { PokemonIdPipe } from './pokemon-id.pipe';

describe('PokemonIdPipe', () => {
  it('create an instance', () => {
    const pipe = new PokemonIdPipe();
    expect(pipe).toBeTruthy();
  });
});
