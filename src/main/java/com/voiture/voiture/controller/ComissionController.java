package com.voiture.voiture.controller;

import com.voiture.voiture.modele.Comission;
import com.voiture.voiture.service.ComissionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Commission")
@CrossOrigin(origins = "http://localhost:3000")
public class ComissionController {
    private final ComissionService comissionService;

    public ComissionController(ComissionService comissionService) {
        this.comissionService = comissionService;
    }

    @PostMapping("/create")
    public Comission create(@RequestBody Comission comission){
        return comissionService.insertCommission(comission);
    }

    @PostMapping("/read")
    public List<Comission> read(){
        return comissionService.getAllCommission();
    }

    @PostMapping("/read/{idCommission}")
    public Comission readById(@PathVariable int idCommission){
        return comissionService.getCommissionById(idCommission);
    }

    @PostMapping("/update/{idCommission}")
    public Comission update(@PathVariable int idCommission, @RequestBody Comission comission){
        return comissionService.update(idCommission, comission);
    }

    @PostMapping("/delete/{idCommission}")
    public void delete(@PathVariable int idCommission){
        comissionService.deleteCommissionById(idCommission);
    }
}
