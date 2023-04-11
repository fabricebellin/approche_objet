package entites;

import entites2.Personne;

public class TestPersonne {
	public static void main(String[] args) {
		AdressePostale adr1 = new AdressePostale(3, "Rue du marché", 34000, "Montpellier");

		
		Personne p = new Personne("Proust", "Marcel");
		Personne n = new Personne("Proust", "Marcel", adr1);


		System.out.println(p);
		System.out.println(n);
		
	}
	
}
