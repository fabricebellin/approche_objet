package fr.diginamic.banque.entites;

public class CompteTaux extends Compte{

	private int taux;

	public CompteTaux(String numero, double solde, int taux) {
		super(numero, solde);
		this.taux = taux;
	}
	

	public int getTaux() {
		return taux;
	}


	public void setTaux(int taux) {
		this.taux = taux;
	}
	
	@Override
	public String toString() {
	    return super.toString() + ", taux=" + taux ;
	}

}
