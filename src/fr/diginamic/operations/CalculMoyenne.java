package fr.diginamic.operations;


public class CalculMoyenne {
	private double [] tab;
	private int taille;
	
    
    public CalculMoyenne(double[] tab) {
        this.tab = tab;
        this.taille = tab.length;
    }
    
    public void ajout(double nombre) {
        double[] tab2 = new double[taille + 1];
        for (int i = 0; i < taille; i++) {
        	tab2[i] = tab[i];
        }
        tab2[taille] = nombre;
        tab = tab2;
        taille++;
    }
    
    public double calcul() {
        double somme = 0;
        for (int i = 0; i < taille; i++) {
            somme += tab[i];
        }
        return somme / taille;
    }
	
}
