package tri;


public class Ville{
	String nom;
	Integer nbHabitant;
	
	
	public Ville(String nom, Integer nbHabitant) {
		this.nom = nom;
		this.nbHabitant = nbHabitant;
	}
	
	
	
	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public Integer getNbHabitant() {
		return nbHabitant;
	}



	public void setNbHabitant(Integer nbHabitant) {
		this.nbHabitant = nbHabitant;
	}

    @Override
    public boolean equals(Object obj) {
    	 if (this == obj) { // Vérifier si l'objet est le même
             return true;
         }
         if (obj == null) { // Vérifier si l'objet est null
             return false;
         }
         if (getClass() != obj.getClass()) { // Vérifier si les classes sont différentes
             return false;
         }
         Ville other = (Ville) obj; // Cast l'objet en Ville
         if (nbHabitant == null) { // Vérifier si les nombres d'habitants sont nulls
             if (other.nbHabitant != null) {
                 return false;
             }
         } else if (!nbHabitant.equals(other.nbHabitant)) { // Vérifier si les nombres d'habitants sont différents
             return false;
         }
         if (nom == null) { // Vérifier si les noms sont nulls
             if (other.nom != null) {
                 return false;
             }
         } else if (!nom.equals(other.nom)) { // Vérifier si les noms sont différents
             return false;
         }
         return true;
    }



	@Override
	public String toString() {
		return " nom=" + nom + ", nbHabitant=" + nbHabitant;
	}
	
	
	


	
	
}
