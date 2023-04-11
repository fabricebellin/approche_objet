package entites2;

import entites.AdressePostale;

public class Personne {
	public String nom;
	public String prenom;
	public AdressePostale adresse;
	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + "]";
	}
}
