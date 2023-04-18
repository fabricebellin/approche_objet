package maps;

import java.util.HashMap;

public class CreationMap {

	public static void main(String[] args) {
		User u1 = new User(1750, "Paul");
		User u2 = new User(1825, "Hicham");
		User u3 = new User(2250, "Yu");
		User u4 = new User(2015, "Ingrid");
		User u5 = new User(2418, "Chantal");

		 HashMap<String, Integer> mapSalaires = new HashMap<String, Integer>();
	        mapSalaires.put(u1.getNom(), u1.getSalaire());
	        mapSalaires.put(u2.getNom(), u2.getSalaire());
	        mapSalaires.put(u3.getNom(), u3.getSalaire());
	        mapSalaires.put(u4.getNom(), u4.getSalaire());
	        mapSalaires.put(u5.getNom(), u5.getSalaire());
	        
	        System.out.println(mapSalaires.size());

		
		
		
		
	}

}
