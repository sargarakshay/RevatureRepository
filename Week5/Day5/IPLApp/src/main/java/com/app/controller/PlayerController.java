package com.app.controller;

import com.app.model.Player;
import com.app.service.PlayerService;
import com.app.service.impl.PlayerServiceImpl;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/players")
public class PlayerController {
    PlayerService playerService = new PlayerServiceImpl();
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Player createPlayer(Player player) {
        return playerService.createPlayer(player);
    }

    @Path("/{playerId}")
    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Player getPlayerId(@PathParam("playerId") int playerId) {
        return playerService.getPlayerId(playerId);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Player updatePlayer(Player player) {
        return playerService.updatePlayer(player);
    }

    @DELETE
    @Path("/{playerId}")
    public void deletePlayer(@PathParam("playerId") int playerId) {
        playerService.deletePlayer(playerId);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Player> getAllPlayers() {
        return playerService.getAllPlayers();
    }


}
