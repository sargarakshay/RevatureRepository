import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddPlayerComponent } from './add-player/add-player.component';
import { DeletePlayerComponent } from './delete-player/delete-player.component';
import { ViewPlayersComponent } from './view-players/view-players.component';


const routes: Routes = [
  { path: 'addPlayer', component: AddPlayerComponent }, 
  { path : 'deletePlayer', component: DeletePlayerComponent },
  { path:  'viewPlayers', component : ViewPlayersComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
