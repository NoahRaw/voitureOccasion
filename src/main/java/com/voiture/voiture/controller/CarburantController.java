package com.voiture.voiture.controller;

import com.voiture.voiture.modele.Carburant;
import com.voiture.voiture.service.CarburantService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Carburant")
@CrossOrigin(origins = "http://localhost:3000")
public class CarburantController {
    private final CarburantService carburantService;

    public CarburantController(CarburantService carburantService) {
        this.carburantService = carburantService;
    }

    @PostMapping("/create")
    public Carburant create(@RequestBody Carburant carburant){
        return carburantService.insertCarburant(carburant);
    }

    @PostMapping("/read")
    public List<Carburant> read(){
        return carburantService.getAllCarburant();
    }

    @PostMapping("/read/{idCarburant}")
    public Carburant readById(@PathVariable int idCarburant){
        return carburantService.getCarburantById(idCarburant);
    }

    @PostMapping("/update/{idCarburant}")
    public Carburant update(@PathVariable int idCarburant, @RequestBody Carburant carburant){
        return carburantService.update(idCarburant, carburant);
    }

    @PostMapping("/delete/{idCarburant}")
    public void delete(@PathVariable int idCarburant){
        carburantService.deleteCarburantById(idCarburant);
    }
}
