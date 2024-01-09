package com.voiture.voiture;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.voiture.voiture.modele.VoitureDefiniStatView;

@SpringBootApplication
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
