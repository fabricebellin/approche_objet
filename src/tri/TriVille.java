package tri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TriVille {

	public static void main(String[] args) {
		Ville ville1 = new Ville("Nice", 343000);
		Ville ville2 = new Ville("Carcassonne", 47800);
		Ville ville3 = new Ville("Narbonne", 53400);
		Ville ville4 = new Ville("Lyon", 484000);
		Ville ville5 = new Ville("Foix", 9700);
		Ville ville6 = new Ville("Pau", 77200);
		Ville ville7 = new Ville("Marseille", 850700);
		Ville ville8 = new Ville("Tarbes", 40600);
		
		List<Ville> list = new ArrayList<>();
		list.add(ville1);
		list.add(ville2);
		list.add(ville3);
		list.add(ville4);
		list.add(ville5);
		list.add(ville6);
		list.add(ville7);
		list.add(ville8);
		
		System.out.println(list);
		Collections.sort(list, new ComparatorHabitant());
		System.out.println(list);

		Collections.sort(list, new ComparatorNom());
		System.out.println(list);
		

	}

}
