package com.voiture.voiture;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.voiture.voiture.modele.VoitureDefiniStatView;

import com.voiture.voiture.model.view.V_vente;

@SpringBootApplication
// @EnableJpaRepositories(basePackages = "com.voiture.voiture.repository")
public class VoitureAppApplication {

	public static void main(String[] args) throws Exception {
		VoitureDefiniStatView v = new VoitureDefiniStatView();
		List<VoitureDefiniStatView> liste = v.getVentetolal(null, "2023-11-01", "2023-11-11");
		for (VoitureDefiniStatView voitureDefiniStatView : liste) {
			System.out.println(voitureDefiniStatView.getNomMarque());
		}
		SpringApplication.run(VoitureAppApplication.class, args);
	}

}
