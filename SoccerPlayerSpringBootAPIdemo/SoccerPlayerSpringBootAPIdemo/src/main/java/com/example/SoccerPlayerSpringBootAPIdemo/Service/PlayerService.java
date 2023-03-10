package com.example.SoccerPlayerSpringBootAPIdemo.Service;

import com.example.SoccerPlayerSpringBootAPIdemo.Entity.Player;

import java.util.List;

public interface PlayerService {

    List<Player> getAllPlayers();

    Player getPlayerByNumber(int playerNumber);

    Player addAPlayer(Player player);

    Player updateAPlayer(Player player);

    String deleteAPlayer(int playerNumber);
}
