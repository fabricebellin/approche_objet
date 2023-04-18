package entites;

public class Cercle {
	double rayon;

	public Cercle(double rayon) {
		this.rayon = rayon;
	}
	
	public double perimetre() {
		 double diametre = rayon * 2; 
	     double perimetre = Math.PI * diametre; // calcul du périmètre
	     return perimetre;
	}
	
	public double surface() {
		double surface = Math.PI * rayon * rayon;
	    return surface;
	}

	@Override
	public String toString() {
		return " rayon : " + rayon;
	}
	
	
	
}
