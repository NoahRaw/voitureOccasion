package com.voiture.voiture.service;

import com.voiture.voiture.modele.Carburant;
import com.voiture.voiture.repository.CarburantRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class CarburantService {
    private final CarburantRepository CarburantRepository;

    public CarburantService(CarburantRepository carburantRepository) {
        CarburantRepository = carburantRepository;
    }

    public List<Carburant> getAllCarburant(){

        return CarburantRepository.findAll();
    }

    public Carburant insertCarburant(Carburant vehicule){
        return CarburantRepository.save(vehicule);
    }

    public Carburant getCarburantById(int idCarburant) {
        Optional<Carburant> optionalCarburant = CarburantRepository.findById(idCarburant);
        return optionalCarburant.orElseThrow(() -> new NoSuchElementException("Carburant non trouvé pour l'ID : " + idCarburant));
    }

    public Carburant update(int idCarburant, Carburant carburant){
        return this.CarburantRepository.findById(idCarburant).map(
                newCarburant ->{
                    newCarburant.setId_carburant(carburant.getId_carburant());
                    newCarburant.setDescription(carburant.getDescription());
                    return CarburantRepository.save(newCarburant);
                }
        ).orElseThrow(() -> new RuntimeException("carburant pas trouver"));
    }

    public void deleteCarburantById(int idvehicule){
        CarburantRepository.deleteById(idvehicule);
    }

}
