package tri;

import java.util.ArrayList;
import java.util.List;

public class TestContinentAvecEnum {

	public static void main(String[] args) {
		Ville ville1 = new Ville("New-York", 8468000, Continent.AMERIQUE);
		Ville ville2 = new Ville("Paris", 2161000, Continent.EUROPE);
		Ville ville3 = new Ville("Pékin", 21054000, Continent.ASIE);
		Ville ville4 = new Ville("Moscou", 11098000, Continent.ASIE);
		Ville ville5 = new Ville("Berlin", 2645000, Continent.EUROPE);
		Ville ville6 = new Ville("Sidney", 5312000, Continent.OCEANIE);
		Ville ville7 = new Ville("Sao Paulo", 12033000, Continent.AMERIQUE);
		Ville ville8 = new Ville("Dakar", 1146000, Continent.AFRIQUE);
		
		List<Ville> list = new ArrayList<>();
		list.add(ville1);
		list.add(ville2);
		list.add(ville3);
		list.add(ville4);
		list.add(ville5);
		list.add(ville6);
		list.add(ville7);
		list.add(ville8);
		
		 for (Ville ville : list) {
		        System.out.println(ville);
		    }

		
	}

}
