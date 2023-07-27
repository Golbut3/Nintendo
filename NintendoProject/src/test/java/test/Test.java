package test;

import model.Adresse;
import model.Boutique;

public class Test {

	public static void main(String[] args) {
		Adresse adresse = new Adresse(15, "rue de Paris", "Saint-Germain-en-Laye");
		Boutique boutique = new Boutique("Monoprix", adresse);

	}

}
