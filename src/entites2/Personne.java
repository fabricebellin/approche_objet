package entites2;

import entites.AdressePostale;

public class Personne {
	
	//Variable d'instance
	public String nom;
	public String prenom;
	public AdressePostale adresse;
	
	//Constructeur
	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	
//	public Personne(String nom, String prenom, AdressePostale adresse) {
//		this.nom = nom;
//		this.prenom = prenom;
//		this.adresse = adresse
//	}
	
	
	public void afficher() {
	    System.out.println(nom.toUpperCase()+ " " + prenom);
	}
	
	//on appelle ce type de méthode un setter
	public void setNom(String nvnom) {
		nom = nvnom;
	}
	
	public void setPrenom(String nvprenom) {
		prenom = nvprenom;
	}
	
	public void setAdresse(AdressePostale nvadresse) {
		adresse = nvadresse;
	}
	
	//on appelle ce type de méthode un getter
	public String getNom() {
		return this.nom;
	}
	
	public String getPrenom() {
		return this.prenom;
	}
	
	public AdressePostale getAdresse() {
		return this.adresse;
	}
	
	
	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + "]";
	}



	
}
