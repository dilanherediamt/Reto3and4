package com.usa.ciclo3.reto3.controller;

import com.usa.ciclo3.reto3.model.Gymmachine;
import com.usa.ciclo3.reto3.service.GymmachineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Gymmachine")
public class GymmachineController {

    @Autowired
    private GymmachineService gymmachineService;

    @GetMapping("/all")
    public List<Gymmachine> getAll(){
        return gymmachineService.getAll();
    }
    @GetMapping("/{idGymmachine}")
    public Optional<Gymmachine> getGymmachine(@PathVariable("idGymmachine")int idGymmachine){
        return gymmachineService.getGymmachine(idGymmachine);
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Gymmachine save(@RequestBody Gymmachine gymmachine){
        return gymmachineService.save(gymmachine);
    }
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Gymmachine update(@RequestBody Gymmachine gymmachine){
        return gymmachineService.update(gymmachine);
    }
    @DeleteMapping("/{idGymmachine}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("idGymmachine") int idGymmachine){
        return gymmachineService.deleteGymmachine(idGymmachine);
    }
}

