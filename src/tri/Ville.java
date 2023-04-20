package tri;


public class Ville{
	String nom;
	Integer nbHabitant;
	Continent continent;

	public Ville(String nom, Integer nbHabitant, Continent continent) {
		super();
		this.nom = nom;
		this.nbHabitant = nbHabitant;
		this.continent = continent;
	}

	
	public Continent getContinent() {
		return continent;
	}



	public void setContinent(Continent continent) {
		this.continent = continent;
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
    	 if (this == obj) { 
             return true;
         }
         if (obj == null) { 
             return false;
         }
         if (getClass() != obj.getClass()) { 
             return false;
         }
         Ville other = (Ville) obj; 
         if (nbHabitant == null) { 
             if (other.nbHabitant != null) {
                 return false;
             }
         } else if (!nbHabitant.equals(other.nbHabitant)) { 
             return false;
         }
         if (nom == null) { 
             if (other.nom != null) {
                 return false;
             }
         } else if (!nom.equals(other.nom)) { 
             return false;
         }
         return true;
    }



	@Override
	public String toString() {
		return " nom=" + nom + ", nbHabitant=" + nbHabitant +"  " + continent.getLibelle();
	}
	
	
	


	
	
}
