package entites;

public class AdressePostale {
	public int numero;
	String libelle;
	int codePostale;
	String ville;
	
	public AdressePostale(int nvnum, String nvlib, int nvcode, String nvville){
		numero = nvnum;
		libelle = nvlib;
		codePostale = nvcode;
		ville = nvville;
	}
	@Override
	public String toString() {
		return "AdressePostale [numero=" + numero + ", libelle=" + libelle + ", codePostale=" + codePostale + ", ville="
				+ ville + "]";
	}


}
