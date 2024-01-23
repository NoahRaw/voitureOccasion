package com.voiture.voiture;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.voiture.voiture.modele.Voitureutilisateur_view;

@SpringBootTest
class VoitureAppApplicationTests {

	@Test
	void contextLoads() throws Exception {
		Voitureutilisateur_view v =  new Voitureutilisateur_view();
		List<Voitureutilisateur_view> liste = v.get_liste_de_ces_annonces(null, 1);

		System.out.println("tailleeeeeeee : "+liste.size());
		for(Voitureutilisateur_view vo : liste){
			System.out.println("voitureeeee : "+vo.getMatricule());
		}
	}

}
