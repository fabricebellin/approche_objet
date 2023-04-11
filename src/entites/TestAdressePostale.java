package entites;

public class TestAdressePostale {
	public static void main(String[] args) {
		AdressePostale adr1 = new AdressePostale();
		adr1.numero = 10;
		adr1.libelle= "du Marché";
		adr1.codePostale = 34000;
		adr1.ville = "Montpellier";
		System.out.println(adr1);

	}
}
