package fr.diginamic.essais;
import entites.Cercle;
import fr.diginamic.utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {
		Cercle c1 = new Cercle(4.0);
		Cercle c2 = new Cercle(9.0);
		
		
		System.out.println("Périmètre cercle 1: " + c1.perimetre());
		System.out.println("Surface cercle 1: " + c1.surface());
		System.out.println("----------------------");
		System.out.println("Périmètre cercle 2: " +c2.perimetre());
		System.out.println("Surface cercle 1: " + c2.surface());
		System.out.println("----------------------");

		
	    Cercle cercle = CercleFactory.createCercle(4.0);
		System.out.println("Cercle 3 créer avec un" + cercle);
		System.out.println("Cercle 3 créer avec un périmètre de : " + cercle.perimetre());
		System.out.println("Cercle 3 créer avec une surface de : " + cercle.perimetre());



	}

}
