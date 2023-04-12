package fr.diginamic.banque.entites;

public class Compte {
	private int numeroCompte;
	private int soldeCompte;
	
	public Compte(int numeroCompte, int soldeCompte) {
	    this.numeroCompte = numeroCompte;
	    this.soldeCompte = soldeCompte;
	}
	
	public int getNumero() {
		return numeroCompte;
	}
	
	public void setNumero(int nvnumero) {
		this.numeroCompte = nvnumero;
	}
	
	public int getSolde() {
		return soldeCompte;
	}
	
	public void setSolde(int nvsolde) {
		this.soldeCompte = nvsolde;
	}
}

//public class Compte {
//    private String numero;
//    private double solde;
//    
//    // Constructeur avec le numéro de compte et le solde
//    public Compte(String numero, double solde) {
//        this.numero = numero;
//        this.solde = solde;
//    }
//    
//    // Getters et setters pour les attributs numero et solde
//    public String getNumero() {
//        return numero;
//    }
//    
//    public void setNumero(String numero) {
//        this.numero = numero;
//    }
//    
//    public double getSolde() {
//        return solde;
//    }
//    
//    public void setSolde(double solde) {
//        this.solde = solde;
//    }
//}
