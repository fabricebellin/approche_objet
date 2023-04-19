package fichier;

public class Ville {
	String nom;
	String code;
	String nomRegion;
	Integer population;
	
	
	public Ville(String nom, String code, String nomRegion, Integer population) {
		super();
		this.nom = nom;
		this.code = code;
		this.nomRegion = nomRegion;
		this.population = population;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getNomRegion() {
		return nomRegion;
	}
	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}
	public Integer getPopulation() {
		return population;
	}
	public void setPopulation(Integer population) {
		this.population = population;
	}
	@Override
	public String toString() {
		return "Ville [nom=" + nom + ", code=" + code + ", nomRegion=" + nomRegion + ", population=" + population + "]";
	}
	
	
	
}
