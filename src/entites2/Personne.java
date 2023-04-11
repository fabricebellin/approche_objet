package entites2;

import entites.AdressePostale;

public class Personne {
	public String nom;
	public String prenom;
	public AdressePostale adresse;
	
	public Personne(String name, String firstname){
		nom = name;
		prenom = firstname;
	}
	
	public Personne(String name, String firstname, AdressePostale adr){
		nom = name;
		prenom = firstname;
		adresse = adr;
	}
		
	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + "]";
	}
}
