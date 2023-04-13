package fr.diginamic.essais;
import entites.Cercle;

public class TestCercle {

	public static void main(String[] args) {
		Cercle c1 = new Cercle(4.0);
		Cercle c2 = new Cercle(9.0);
		
		
		System.out.println("Périmètre cercle 1: " + c1.perimetre());
		System.out.println("Surface cercle 1: " + c1.surface());
		System.out.println("----------------------");
		System.out.println("Périmètre cercle 2: " +c2.perimetre());
		System.out.println("Surface cercle 1: " + c2.surface());


	}

}
