package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        //Personne1
        Personne personne1 = new Personne("Bellin", "Fabrice", new AdressePostale(175,"chemin de bois mesnil", "82290", "montebton"));
        //Personne2
        Personne personne2 = new Personne("Bellin", "Mireille", new AdressePostale(176,"chemin de bois mesnil", "82290", "montebton"));
        affichagePersonne(personne1);
        affichagePersonne(personne2);
    }
    public static void affichagePersonne(Personne personne){
        System.out.println(personne.getNom() + " " + personne.getPrenom() + ", " + personne.getAdressePostale().getNumeroRue() + " " + personne.getAdressePostale().getLibelleRue() + ", " + personne.getAdressePostale().getCodepostal() + ", " + personne.getAdressePostale().getVille() + ".");

    }

}
