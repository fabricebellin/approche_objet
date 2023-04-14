package entites;

public class Theatre {
	String nom;
	int capacite;
	int totalClients;
	int recette;
	
	public Theatre(String nom, int capacite, int totalClients, int recette) {
		this.nom = nom;
		this.capacite = capacite;
		this.totalClients = totalClients;
		this.recette = recette;
	}
	
	
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getCapacite() {
		return capacite;
	}

	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}



	public int getTotalClients() {
		return totalClients;
	}



	public void setTotalClients(int totalClients) {
		this.totalClients = totalClients;
	}



	public int getRecette() {
		return recette;
	}



	public void setRecette(int recette) {
		this.recette = recette;
	}



	public void inscrire(int clients, int prix) {
		if(totalClients + clients <= capacite) {
			totalClients+= clients;
			recette += clients * prix;
		}else {
			System.out.println("Erreur: capacité atteinte.");
		}
		
	}

	@Override
	public String toString() {
		return "Theatre nom=" + nom + ", capacite=" + capacite + ", totalClients=" + totalClients + ", recette="
				+ recette ;
	}
	
	
	
	

}
