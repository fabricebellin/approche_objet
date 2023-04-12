package fr.diginamic.banque;
import fr.diginamic.banque.entites.Compte;

public class TestBanque {

	public static void main(String[] args) {
		Compte cpt = new Compte("A123456", 75500.5);
		System.out.println(cpt);

	}

}
