package com.voiture.voiture.controller;

import com.voiture.voiture.modele.Comission;
import com.voiture.voiture.service.ComissionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Commission")
@CrossOrigin
public class ComissionController {
    private final ComissionService comissionService;

    public ComissionController(ComissionService comissionService) {
        this.comissionService = comissionService;
    }

    @PostMapping
    public Comission create(@RequestBody Comission comission){
        return comissionService.insertCommission(comission);
    }

    @GetMapping
    public List<Comission> read(){
        return comissionService.getAllCommission();
    }

    @PostMapping("/read/{idCommission}")
    public Comission readById(@PathVariable Integer idCommission){
        return comissionService.getCommissionById(idCommission);
    }

    @PutMapping("/{Id}")
    public Comission update(@PathVariable Integer Id, @RequestBody Comission comission){
        return comissionService.update(Id, comission);
    }

    @DeleteMapping("/{Id}")
    public void delete(@PathVariable Integer Id){
        comissionService.deleteCommissionById(Id);
    }
}
