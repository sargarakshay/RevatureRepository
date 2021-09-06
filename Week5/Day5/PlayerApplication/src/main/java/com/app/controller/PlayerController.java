package com.app.controller;

import com.app.exception.BusinessException;
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
    public Player createPlayer(Player player) throws BusinessException {
        return playerService.createPlayer(player);
    }

    @GET
    @Path("/{playerId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Player getPlayerId(@PathParam("playerId") int playerId) throws BusinessException {
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
    public List<Player> getAllPlayers() throws BusinessException {
        return playerService.getAllPlayers();
    }
}
