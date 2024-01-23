package com.voiture.voiture.controller;

import com.voiture.voiture.modele.TypeDeVehicule;
import com.voiture.voiture.repository.TypeDeVehiculeRepository;
import com.voiture.voiture.service.TypeDeVehiculeService;

import lombok.AllArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/typeDeVehicules")
@CrossOrigin
public class TypeDeVehiculeController {

    //@Autowired
    private TypeDeVehiculeService typeDeVehiculeService;
    

    @GetMapping
    public List<TypeDeVehicule> getAllTypesDeVehicule() {
        return typeDeVehiculeService.getAllTypesDeVehicules();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TypeDeVehicule> getTypeDeVehiculeById(@PathVariable Integer id) {
        TypeDeVehicule typeDeVehicule = typeDeVehiculeService.getTypeDeVehiculeById(id);
        return new ResponseEntity<>(typeDeVehicule, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<TypeDeVehicule> saveTypeDeVehicule(@RequestBody TypeDeVehicule typeDeVehicule) {
        TypeDeVehicule saveTypeDeVehicule = typeDeVehiculeService.saveTypeDeVehicule(typeDeVehicule);
        return new ResponseEntity<>(saveTypeDeVehicule, HttpStatus.CREATED);
    }

     // Build Update User REST API
    @PutMapping("/{id}")
     // http://localhost:8080/api/typeDeVehicules/1
    public ResponseEntity<TypeDeVehicule> updateTypeDeVehicule(@PathVariable("id") Integer id,@RequestBody TypeDeVehicule typeDeVehicule){
         typeDeVehicule.setIdTypeDeVehicule(id);
         TypeDeVehicule updatedTypeDeVehicule = typeDeVehiculeService.updateTypeDeVehicule(typeDeVehicule);
         return new ResponseEntity<>(updatedTypeDeVehicule, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteTypeDeVehiculeById(@PathVariable Integer id) {
        typeDeVehiculeService.deleteTypeDeVehiculeById(id);
        return new ResponseEntity<>("TypeDeVehicule successfully deleted!", HttpStatus.OK);
    }
}

