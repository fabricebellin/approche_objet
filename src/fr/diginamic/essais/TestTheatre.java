package fr.diginamic.essais;

import entites.Theatre;

public class TestTheatre {

	public static void main(String[] args) {
		Theatre t1 = new Theatre("Le theatre", 200, 150, 1500);
		System.out.println(t1);
		
		System.out.println("-------------");
		t1.inscrire(50, 10);
		System.out.println(t1);
		System.out.println("-------------");
		t1.inscrire(50, 10);
		System.out.println(t1.getTotalClients());
		System.out.println(t1.getRecette());




	}

}
