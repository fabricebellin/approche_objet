package entites;

import entites2.Personne;

public class TestPersonne {
	public static void main(String[] args) {
	Personne c = new Personne();
	c.nom = "toto";
	c.prenom = "titi";
	AdressePostale a = new AdressePostale();
	a.numRue = 3;
	a.label = "Rue Emile Zola";
	a.codePostal = 34000;
	a.ville ="Montpellier";
	c.adresse = a;
	System.out.println(c);
	}
}
