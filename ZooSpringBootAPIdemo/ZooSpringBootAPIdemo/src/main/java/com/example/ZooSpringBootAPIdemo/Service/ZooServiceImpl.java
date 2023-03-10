package com.example.ZooSpringBootAPIdemo.Service;

import com.example.ZooSpringBootAPIdemo.Dao.ZooDao;
import com.example.ZooSpringBootAPIdemo.Entity.Zoo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ZooServiceImpl implements ZooService {
    @Autowired
    private ZooDao zooDao;
    @Override
    public List<Zoo> getAllZoos() {
        return this.zooDao.findAll();
    }

    @Override
    public Zoo getAnimalByID(int animalID) {
        Optional<Zoo> z = this.zooDao.findById(animalID);
        Zoo zoo = null;
        if(z.isPresent()){
            zoo = z.get();
        }else {
            throw new RuntimeException(" Animal not found for this id: " + animalID);
        }
        return zoo;
    }

    @Override
    public Zoo addAnimal(Zoo zoo) {
        return this.zooDao.save(zoo);
    }

    @Override
    public Zoo updateAnimal(Zoo zoo) {
        return this.zooDao.save(zoo);
    }

    @Override
    public String deleteAnimalById(int animalID) {
        this.zooDao.deleteById(animalID);
        return "Animal deleted successfully";
    }
}
