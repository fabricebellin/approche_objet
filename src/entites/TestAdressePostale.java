package entites;

public class TestAdressePostale {
	public static void main(String[] args) {
		AdressePostale adr1 = new AdressePostale(20, "rue des Lilas", 44000, "Nantes");
		AdressePostale adr2 = new AdressePostale(15, "rue des Tulipes", 34000, "Montpellier");

		System.out.println(adr1.numero + " " + adr1.libelle + " " + adr1.codePostale + " " + adr1.ville);
		System.out.println(adr2.numero + " " + adr2.libelle + " " + adr2.codePostale + " " + adr2.ville);


	}
}
