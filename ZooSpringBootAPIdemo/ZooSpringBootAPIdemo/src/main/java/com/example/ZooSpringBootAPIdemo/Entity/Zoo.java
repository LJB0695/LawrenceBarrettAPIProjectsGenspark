package com.example.ZooSpringBootAPIdemo.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_zoo")
public class Zoo {
    @Id
    @Column(name = "a_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int animalID;
    private String animalSpecies;
    private String animalColor;

    public Zoo(){}

    public Zoo(String animalSpecies, String animalColor) {
        this.animalSpecies = animalSpecies;
        this.animalColor = animalColor;
    }

    public int getAnimalID() {
        return animalID;
    }

    public void setAnimalID(int animalID) {
        this.animalID = animalID;
    }

    public String getAnimalSpecies() {
        return animalSpecies;
    }

    public void setAnimalSpecies(String animalSpecies) {
        this.animalSpecies = animalSpecies;
    }

    public String getAnimalColor() {
        return animalColor;
    }

    public void setAnimalColor(String animalColor) {
        this.animalColor = animalColor;
    }
}
