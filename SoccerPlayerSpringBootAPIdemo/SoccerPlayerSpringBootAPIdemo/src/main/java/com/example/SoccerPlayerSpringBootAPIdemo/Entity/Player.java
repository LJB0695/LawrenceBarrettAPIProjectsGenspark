package com.example.SoccerPlayerSpringBootAPIdemo.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_player")
public class Player {
    @Id
    @Column(name = "p_num")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int playerNumber;
    private String playerName;
    private String playerTeam;
    private String playerLeague;

    private String playerPosition;

    private int actualNumber;

    public Player(){}

    public Player(String playerName, String playerTeam, String playerLeague, String playerPosition, int actualNumber) {
        this.playerName = playerName;
        this.playerTeam = playerTeam;
        this.playerLeague = playerLeague;
        this.playerPosition = playerPosition;
        this.actualNumber = actualNumber;
    }


    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerTeam() {
        return playerTeam;
    }

    public void setPlayerTeam(String playerTeam) {
        this.playerTeam = playerTeam;
    }

    public String getPlayerLeague() {
        return playerLeague;
    }

    public void setPlayerLeague(String playerLeague) {
        this.playerLeague = playerLeague;
    }

    public String getPlayerPosition() {
        return playerPosition;
    }

    public void setPlayerPosition(String playerPosition) {
        this.playerPosition = playerPosition;
    }

    public int getActualNumber() {
        return actualNumber;
    }

    public void setActualNumber(int actualNumber) {
        this.actualNumber = actualNumber;
    }
}
