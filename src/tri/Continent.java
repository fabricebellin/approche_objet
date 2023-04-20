package tri;

public enum Continent {
	ASIE("Asie"),
	EUROPE("Europe"),
	AMERIQUE("Amérique"),
	OCEANIE("Océanie"),
	AFRIQUE("Afrique");
	
	private String libelle;

	private Continent(String libelle) {
		this.libelle = libelle;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	
}
