package com.example.SoccerPlayerSpringBootAPIdemo.Controller;

import com.example.SoccerPlayerSpringBootAPIdemo.Entity.Player;
import com.example.SoccerPlayerSpringBootAPIdemo.Service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlayerController {
    @Autowired
    private PlayerService playerService;
    @GetMapping("home")
    public String home(){return "<HTML><H1> Welcome to my Soccer player database API</H1></HTML";}
    @GetMapping("/players")
    public List<Player> getAllPlayers(){
        return this.playerService.getAllPlayers();
    }
    @GetMapping("/players/{playerNumber}")
    public Player getPlayerByNumber(@PathVariable String playerNumber) {
        return this.playerService.getPlayerByNumber(Integer.parseInt(playerNumber));

    }
    @PostMapping("/players")
    public Player addAPlayer(@RequestBody Player player){
        return this.playerService.addAPlayer(player);
    }
    @PutMapping("/players")
    public Player updateAPlayer(@RequestBody Player player){
        return this.playerService.updateAPlayer(player);
    }
    @DeleteMapping("/players/{playerNumber}")
    public String deleteAPlayer(@PathVariable String playerNumber){
        return this.playerService.deleteAPlayer(Integer.parseInt(playerNumber));

    }

}
