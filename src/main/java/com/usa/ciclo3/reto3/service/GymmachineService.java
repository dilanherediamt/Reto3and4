package com.usa.ciclo3.reto3.service;

import com.usa.ciclo3.reto3.model.Gymmachine;
import com.usa.ciclo3.reto3.model.Message;
import com.usa.ciclo3.reto3.repository.GymmachineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GymmachineService {

    @Autowired
    private GymmachineRepository gymmachineRepository;

    public List<Gymmachine> getAll() {
        return gymmachineRepository.getAll();
    }

    public Optional<Gymmachine> getGymmachine(int idGymmachine) {
        return gymmachineRepository.getGymmachine(idGymmachine);
    }

    public Gymmachine save(Gymmachine gymmachine) {
        if (gymmachine.getId() == null) {
            return gymmachineRepository.save(gymmachine);
        } else {
            Optional<Gymmachine> tmpGymmachine = gymmachineRepository.getGymmachine(gymmachine.getId());
            if (tmpGymmachine.isEmpty()) {
                return gymmachineRepository.save(gymmachine);
            } else {
                return gymmachine;
            }
        }
    }

    public Gymmachine update(Gymmachine gymmachine) {
        if (gymmachine.getId() != null) {
            Optional<Gymmachine> tmpGymmachine = gymmachineRepository.getGymmachine(gymmachine. getId());
            if (!tmpGymmachine.isEmpty()) {
                return gymmachineRepository.save(gymmachine);
            }
        }
        return gymmachine;
    }

    public boolean deleteGymmachine(int id) {
        Boolean result = getGymmachine(id).map(gymmachine -> {
            gymmachineRepository.delete(gymmachine);
            return true;
        }).orElse(false);
        return result;
    }
}

