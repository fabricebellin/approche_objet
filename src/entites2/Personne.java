package entites2;

import entites.AdressePostale;

public class Personne {
	
	//Variable d'instance
	public String nom;
	public String prenom;
	public AdressePostale adresse;
	
	//Constructeur
	public Personne(String nom, String prenom, AdressePostale adresse) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}
	
	
	public void afficherNom() {
	    String[] partNom = this.nom.split(" ");
	    String nomFam = partNom[partNom.length - 1].toUpperCase();
	    System.out.println(nomFam + " " + prenom);
	}

	
	public void variableInstance(String nouvNom) {
		 this.nom = nouvNom;
	}
	
	public void modifierPrenom(String nouvPren) {
		 this.prenom = nouvPren;
	}
	

	public void modifierAdresse(AdressePostale nouvAdress){
		this.adresse =  nouvAdress;
	}
	
	public String returnNom() {
		
		return this.nom;
	}
	
	public String returnPren() {
		
		return this.prenom;
	}
	
	public AdressePostale returnAdresse() {
		
		return this.adresse;
	}
	
	
	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + "]";
	}



	
}
