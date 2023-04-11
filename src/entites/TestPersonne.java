package entites;

import entites2.Personne;

public class TestPersonne {
	public static void main(String[] args) {
		AdressePostale adr1 = new AdressePostale();
		adr1.numero = 10;
		adr1.libelle= "du Marché";
		adr1.codePostale = 34000;
		adr1.ville = "Montpellier";
		
		Personne p = new Personne();
		p.nom = "Proust";
		p.prenom = "Marcel";
		p.adresse = adr1;
		System.out.println(p);
		
//		p.adresse = new AdressePostale();
//		p.adresse.numero = 5;
//		p.adresse.libelle = "du Marché";
//		p.adresse.codePostale = 34000;
//		p.adresse.ville = "Montpellier";
	}
	
}
