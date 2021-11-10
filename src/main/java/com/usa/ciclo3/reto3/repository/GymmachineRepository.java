package com.usa.ciclo3.reto3.repository;

import com.usa.ciclo3.reto3.crudrepository.GymmachineCrudRepository;
import com.usa.ciclo3.reto3.model.Gymmachine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class GymmachineRepository {
    @Autowired
    private GymmachineCrudRepository gymmachineCrudRepository;

    public List<Gymmachine> getAll(){
        return(List<Gymmachine>) gymmachineCrudRepository.findAll();
    }
    public Optional<Gymmachine> getGymmachine(int id){
        return gymmachineCrudRepository.findById(id);
    }
    public Gymmachine save(Gymmachine gymmachine){
        return gymmachineCrudRepository.save(gymmachine);
    }
    public void delete(Gymmachine gymmachine){
        gymmachineCrudRepository.delete(gymmachine);
    }
}
