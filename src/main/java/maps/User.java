package maps;

public class User {
	int salaire;
	String nom;
	
	public User(int salaire, String nom) {
		super();
		this.salaire = salaire;
		this.nom = nom;
	}
	
	

	public int getSalaire() {
		return salaire;
	}



	public void setSalaire(int salaire) {
		this.salaire = salaire;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	@Override
	public String toString() {
		return "User [salaire=" + salaire + ", nom=" + nom + "]";
	}
	
	
}
