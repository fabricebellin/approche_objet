package entites;

public class TestAdressePostale {
	public static void main(String[] args) {
		AdressePostale a = new AdressePostale();
		a.numRue = 3;
		a.label = "Rue Emile Zola";
		a.codePostal = 34000;
		a.ville ="Montpellier";
		System.out.println(a);
		
		AdressePostale b = new AdressePostale();
		b.numRue = 5;
		b.label = "Rue andre auguste";
		b.codePostal = 34400;
		b.ville ="Lunel-Viel";
		System.out.println(b);

	}
}
