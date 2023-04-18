package fr.diginamic.banque;
import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;


public class TestOperation {

	public static void main(String[] args) {
		Credit cred1 = new Credit("5 avril", 4);
		Credit cred2 = new Credit("2 avril", 2);
		
		Debit deb1 = new Debit("2 décembre", 39);
		Debit deb2 = new Debit("34 février", 232);
		
		Operation [] op1 = {cred1, cred2, deb1, deb2};

		for (int i=0; i < op1.length;i++) {
			   System.out.println(op1[i].getType()+ " : " + op1[i]);
			}
		
		int total = 0;

		for (int i=0; i < op1.length; i++) {
		    if (op1[i] instanceof Credit) {
		        total += op1[i].getMontant();
		    } else if (op1[i] instanceof Debit) {
		        total -= op1[i].getMontant();
		    }
		}

		System.out.println("Le montant total  est de: " + total);
	}
	
	

}
