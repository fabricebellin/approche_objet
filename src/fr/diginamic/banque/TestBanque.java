package fr.diginamic.banque;
import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;


public class TestBanque {

	public static void main(String[] args) {
		Compte cpt = new Compte("A123456", 75500.5);
		CompteTaux cpt2 = new CompteTaux("B123456", 7500.5,5);

		
		Compte [] cpts = {cpt,cpt2};
		
		for (int i=0; i < cpts.length;i++) {
			   System.out.println(cpts[i]);
			}
	}

}
