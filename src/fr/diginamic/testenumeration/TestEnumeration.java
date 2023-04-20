package fr.diginamic.testenumeration;

public class TestEnumeration {

	public static void main(String[] args) {
		Saison[] saisons = Saison.values();
		System.out.println("Afficher toute les saisons:");
		for(Saison saison: saisons) {
			System.out.println(saison.getLibelle());
		}
		
		Saison saisons2 = Saison.valueOf("ETE");
		System.out.println("Afficher le libellé pour la string ETE: " + saisons2.getLibelle());
		
		
		Saison saison3 = Saison.getInstancelibel("Hiver");
		System.out.println(saison3);
		
	}

}
