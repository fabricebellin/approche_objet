package entites;

public class AdressePostale {
	public int numero;
	String libelle;
	int codePostale;
	String ville;
	
	AdressePostale(int num, String label, int cp, String v){
		codePostale = cp;
		numero = num;
		libelle = label;
		ville = v;
	}
	@Override
	public String toString() {
		return "AdressePostale [numero=" + numero + ", libelle=" + libelle + ", codePostale=" + codePostale + ", ville="
				+ ville + "]";
	}


}
