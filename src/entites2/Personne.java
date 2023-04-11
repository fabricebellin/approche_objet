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
	
	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + "]";
	}



	
}
