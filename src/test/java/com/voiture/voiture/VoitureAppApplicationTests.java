package com.voiture.voiture;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.voiture.voiture.modele.Voituredefini_view;
import com.voiture.voiture.modele.Voitureutilisateur_view;

@SpringBootTest
class VoitureAppApplicationTests {

	@Test
	void contextLoads() throws Exception {
		Voituredefini_view vv = new Voituredefini_view(1);
		vv.get_voiture_defini(null);
	}

}
