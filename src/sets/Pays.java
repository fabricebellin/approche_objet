package sets;

public class Pays {
	String nom;
	int nbHabitant;
	double pibParHabitant;
	
	public Pays(String nom, int nbHabitant, double pibParHabitant) {
		super();
		this.nom = nom;
		this.nbHabitant = nbHabitant;
		this.pibParHabitant = pibParHabitant;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbHabitant() {
		return nbHabitant;
	}

	public void setNbHabitant(int nbHabitant) {
		this.nbHabitant = nbHabitant;
	}

	public double getPibParHabitant() {
		return pibParHabitant;
	}

	public void setPibParHabitant(double pibParHabitant) {
		this.pibParHabitant = pibParHabitant;
	}
	
	public double getPIBtotal() {
        return nbHabitant * pibParHabitant;
    }
	@Override
	public String toString() {
		return "nom=" + nom + ", nbHabitant=" + nbHabitant + ", pibParHabitant=" + pibParHabitant;
	}
	
	
	
	
}
