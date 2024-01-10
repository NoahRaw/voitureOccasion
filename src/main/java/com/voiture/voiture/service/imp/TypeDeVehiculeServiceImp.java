package com.voiture.voiture.service.imp;

import com.voiture.voiture.model.TypeDeVehicule;
import com.voiture.voiture.repository.TypeDeVehiculeRepository;
import com.voiture.voiture.service.TypeDeVehiculeService;

import lombok.AllArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class TypeDeVehiculeServiceImp implements TypeDeVehiculeService{

    //@Autowired
    private TypeDeVehiculeRepository typeDeVehiculeRepository;


    @Override
    public List<TypeDeVehicule> getAllTypesDeVehicules() {
        return typeDeVehiculeRepository.findAll();
    }

    ///
    @Override
    public TypeDeVehicule getTypeDeVehiculeById(int id) {
        Optional<TypeDeVehicule> optionaltypeDeVehicule = typeDeVehiculeRepository.findById(id);
        return optionaltypeDeVehicule.get();
    }

    @Override
    public TypeDeVehicule saveTypeDeVehicule(TypeDeVehicule typeDeVehicule) {
        return typeDeVehiculeRepository.save(typeDeVehicule);
    }

    @Override
    public TypeDeVehicule updateTypeDeVehicule(TypeDeVehicule typeDeVehicule){
        TypeDeVehicule existingTypeDeVehicule = typeDeVehiculeRepository.findById(typeDeVehicule.getIdTypeDeVehicule()).get();
        existingTypeDeVehicule.setDescription(typeDeVehicule.getDescription());
        TypeDeVehicule updatedTypeDeVehicule = typeDeVehiculeRepository.save(existingTypeDeVehicule);
        return updatedTypeDeVehicule;
    }

    @Override
    public void deleteTypeDeVehiculeById(int id) {
        typeDeVehiculeRepository.deleteById(id);
    }
}
