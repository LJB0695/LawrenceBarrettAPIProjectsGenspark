package com.example.SoccerPlayerSpringBootAPIdemo.Service;

import com.example.SoccerPlayerSpringBootAPIdemo.Dao.PlayerDao;
import com.example.SoccerPlayerSpringBootAPIdemo.Entity.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerServiceImpl implements PlayerService{
    @Autowired
    private PlayerDao playerDao;

    @Override
    public List<Player> getAllPlayers() {
        return this.playerDao.findAll();
    }

    @Override
    public Player getPlayerByNumber(int playerNumber) {
        Optional<Player> p = this.playerDao.findById(playerNumber);
        Player player = null;
        if(p.isPresent()){
            player = p.get();
        }else {
            throw new RuntimeException(" This number does not exist: " + playerNumber);
        }
        return player;


    }

    @Override
    public Player addAPlayer(Player player) {
        return this.playerDao.save(player);
    }

    @Override
    public Player updateAPlayer(Player player) {
        return this.playerDao.save(player);
    }

    @Override
    public String deleteAPlayer(int playerNumber) {
        this.playerDao.deleteById(playerNumber);
        return "Player successfully removed form Database";
    }
}
