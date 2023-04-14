package fr.diginamic.essais;
import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {

	public static void main(String[] args) {
		
		
		double[] tab = { 3.0, 7.0, 2.0 };
	        CalculMoyenne c1 = new CalculMoyenne(tab);
	        System.out.println("Moyenne : " + c1.calcul());
	        c1.ajout(6.0);
	        System.out.println("Moyenne : " + c1.calcul());
		

	}

}
