package maps;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

import tri.Ville;


public class MapVilles {

	public static void main(String[] args) {
		//Ville ville1 = new Ville("Montpellier", 277639);
				//Ville ville2 = new Ville("Nantes", 303382);
				//Ville ville3 = new Ville("Marseille", 861635);


				 HashMap<String, Ville> mapVilles = new HashMap<>();
				// mapVilles.put(ville1.getNom(), ville1);
				// mapVilles.put(ville3.getNom(), ville3);
				// mapVilles.put(ville2.getNom(), ville2);

				 Ville villeMin = null;

				 for(Ville valeur : mapVilles.values()) {

					 if (villeMin == null || valeur.getNbHabitant() < villeMin.getNbHabitant()) {
					        villeMin = valeur;
					    }
					}
					System.out.println(mapVilles);

				 	//mapVilles.remove(ville1.getNom());

				 System.out.println(mapVilles);

	}

}
