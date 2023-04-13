package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {

	public static void main(String[] args) {
		
		double addition = Operations.calcul(20.0, 4.0, '+'); 
		double soustraction = Operations.calcul(20.0, 4.0, '-'); 
		double multiplication = Operations.calcul(20.0, 4.0, '*'); 
		double division = Operations.calcul(20.0, 4.0, '/'); 
		
		System.out.println("addition: "  +addition);
		System.out.println("soustraction: "  +soustraction);
		System.out.println("addition: "  +multiplication);

		System.out.println("division: "  +division);

		
	}

}
