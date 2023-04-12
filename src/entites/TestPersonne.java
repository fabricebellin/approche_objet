package entites;

import entites2.Personne;

public class TestPersonne {
	public static void main(String[] args) {
		AdressePostale adr1 = new AdressePostale(20, "rue des Lilas", 44000, "Nantes");
		AdressePostale adr2 = new AdressePostale(15, "rue des Tulipes", 34000, "Montpellier");

		
		Personne p1 = new Personne("Proust", "Marcel", adr2);
		Personne p2 = new Personne("Verne", "Jules", adr2);


		p1.afficherNom();
		
		System.out.println(p1);
		
		p1.modifierAdresse(adr1);
		
		p1.variableInstance("Verne");
		
		System.out.println(p1);
		System.out.println(p2);
		
	}
	
}
