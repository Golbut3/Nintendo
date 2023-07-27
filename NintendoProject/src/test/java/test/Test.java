package test;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.Achat;
import model.Adresse;
import model.Boutique;
import model.Client;
import model.Console;
import model.Jeu;
import model.Salon;

public class Test {

	public static void main(String[] args) {

		Adresse adresse = new Adresse(15, "rue de Paris", "Saint-Germain-en-Laye");
		Boutique boutique = new Boutique("Monoprix", adresse);
		// TODO Auto-generated method stub
		Salon ps2 = new Salon("ps2", 150, LocalDate.parse("2018-10-05"));
		Jeu j1 = new Jeu("marioBros", ps2, boutique);
		Achat a1 = new Achat(j1, LocalDate.parse("2015-10-05"), 50);
		List<Achat> listeAchat1 = new ArrayList();
		Collections.addAll(listeAchat1, a1);
		Client c1 = new Client("Charlet", "Lucas",listeAchat1);
		Client c2 = new Client("Doe", "John",listeAchat1);

		
		
		
		
	}

}
