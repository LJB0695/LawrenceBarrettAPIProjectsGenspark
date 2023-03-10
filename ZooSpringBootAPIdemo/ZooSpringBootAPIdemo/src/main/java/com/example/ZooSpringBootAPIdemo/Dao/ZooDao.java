package com.example.ZooSpringBootAPIdemo.Dao;

import com.example.ZooSpringBootAPIdemo.Entity.Zoo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZooDao extends JpaRepository<Zoo, Integer> {
}
