package fr.diginamic.chaines;

public class ManipulationChaine {

	public static void main(String[] args) {
		String chaine = "Durand;Marcel;2 523.5";
		System.out.println("Premier caractère: " + chaine.charAt(0));
		System.out.println("Longueur de la chaine de caractère : " + chaine.length());
		System.out.println("Afficher l'index du premier ;" + chaine.indexOf(";"));

	}

}
