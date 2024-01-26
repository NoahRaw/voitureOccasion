package com.voiture.voiture.controller;

import com.voiture.voiture.modele.Carburant;
import com.voiture.voiture.service.CarburantService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Carburant")
@CrossOrigin
public class CarburantController {
    private final CarburantService carburantService;

    public CarburantController(CarburantService carburantService) {
        this.carburantService = carburantService;
    }

    @PostMapping
    public Carburant create(@RequestBody Carburant carburant){
        return carburantService.insertCarburant(carburant);
    }

    @GetMapping
    public List<Carburant> read(){
        return carburantService.getAllCarburant();
    }

    @PostMapping("/read/{idCarburant}")
    public Carburant readById(@PathVariable Integer idCarburant){
        return carburantService.getCarburantById(idCarburant);
    }

    @PutMapping("/{Id}")
    public Carburant update(@PathVariable Integer Id, @RequestBody Carburant carburant){
        return carburantService.update(Id, carburant);
    }

    @DeleteMapping("/{Id}")
    public void delete(@PathVariable Integer Id){
        carburantService.deleteCarburantById(Id);
    }
}
