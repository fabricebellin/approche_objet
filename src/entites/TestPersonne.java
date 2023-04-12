package entites;

import entites2.Personne;

public class TestPersonne {
	public static void main(String[] args) {
		AdressePostale adr1 = new AdressePostale(20, "rue des Lilas", 44000, "Nantes");
		AdressePostale adr2 = new AdressePostale(15, "rue des Tulipes", 34000, "Montpellier");

		
		Personne p1 = new Personne("Proust", "Marcel");
		p1.setAdresse(adr1);
		Personne p2 = new Personne("Verne", "Jules");
		p1.setAdresse(adr2);
		
		p1.afficher();
		p2.afficher();
		
		p1.setNom("Prouste");
		p1.setPrenom("Alphonse");
		p1.setAdresse(adr2); //ou recréer une adresse postale
		
		System.out.println(p1.getNom());
		AdressePostale adr = p1.getAdresse(); //pensez toujours de droite à gauche
		System.out.println(adr);

		
		System.out.println(p1);
		System.out.println(p2);
		
	}
	
}
