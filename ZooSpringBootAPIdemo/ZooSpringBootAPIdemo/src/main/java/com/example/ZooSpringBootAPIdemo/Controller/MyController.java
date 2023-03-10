package com.example.ZooSpringBootAPIdemo.Controller;

import com.example.ZooSpringBootAPIdemo.Entity.Zoo;
import com.example.ZooSpringBootAPIdemo.Service.ZooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {
    @Autowired
    private ZooService zooService;

    @GetMapping("home")
    public String home() {return "<HTML><H1>Welcome to my Zoo API Demo</H1></HTML>";}
    @GetMapping("/zoos")
    public List<Zoo> getZoos() {
        return this.zooService.getAllZoos();
    }
    @GetMapping("/zoo/{animalID}")
    public Zoo getAnimal(@PathVariable String animalID) {
        return this.zooService.getAnimalByID(Integer.parseInt(animalID));
    }
    @PostMapping("/zoo")
    public Zoo addAnimal(@RequestBody Zoo zoo) {
        return this.zooService.addAnimal(zoo);
    }
    @PutMapping("/zoo")
    public Zoo updateAnimal(@RequestBody Zoo zoo) {
        return this.zooService.updateAnimal(zoo);
    }
    @DeleteMapping("/zoo/{animalID}")
    public String deleteAnimal(@PathVariable String animalID){
        return this.zooService.deleteAnimalById(Integer.parseInt(animalID));
    }




}
