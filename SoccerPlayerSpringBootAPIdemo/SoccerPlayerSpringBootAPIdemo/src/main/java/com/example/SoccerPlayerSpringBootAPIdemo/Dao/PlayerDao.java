package com.example.SoccerPlayerSpringBootAPIdemo.Dao;

import com.example.SoccerPlayerSpringBootAPIdemo.Entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerDao extends JpaRepository<Player, Integer> {

}
