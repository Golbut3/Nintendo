package test;


import model.Adresse;
import model.Boutique;
=======
import model.Client;


public class Test {

	public static void main(String[] args) {

		Adresse adresse = new Adresse(15, "rue de Paris", "Saint-Germain-en-Laye");
		Boutique boutique = new Boutique("Monoprix", adresse);

		// TODO Auto-generated method stub
		Client c1 = new Client("Charlet", "Lucas");
		Client c2 = new Client("Doe", "John");

	}

}
