package fr.diginamic.banque.entites;

public class Debit extends Operation{

	public Debit(String date, int montant) {
		super(date, montant);
		// TODO Auto-generated constructor stub
	}

	public String getType() {
		return "debit";
	}
	

}
