package com.example.ZooSpringBootAPIdemo.Service;

import com.example.ZooSpringBootAPIdemo.Entity.Zoo;

import java.util.List;

public interface ZooService {
    List<Zoo> getAllZoos();

    Zoo getAnimalByID(int animalID);

    Zoo addAnimal(Zoo zoo);

    Zoo updateAnimal(Zoo zoo);

    String deleteAnimalById(int animalID);


}
