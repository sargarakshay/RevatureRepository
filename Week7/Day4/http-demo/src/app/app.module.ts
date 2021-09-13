import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http'
import { PokemonService } from './pokemon.service';
import { PokemonPipe } from './pokemon.pipe';
import { PokemonIdPipe } from './pokemon-id.pipe';
import { PokemonComponent } from './pokemon/pokemon.component';
import { AppRoutingModule } from './app-routing.module';

@NgModule({
  declarations: [
    AppComponent,
    PokemonPipe,
    PokemonIdPipe,
    PokemonComponent,
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule
  ],
  providers: [PokemonService],
  bootstrap: [AppComponent]
})
export class AppModule { }
