package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        AdressePostale adresse1 = new AdressePostale(175, "chemin de bois mesnil", 82290, "Montbeton");
        AdressePostale adresse2 = new AdressePostale(180, "chemin du bois mesnil", 82290, "Montbeton");

        Personne personne1 = new Personne("Bellin", "Fabrice", adresse1);
        Personne personne2 = new Personne("Bellin", "Elise", adresse2);

        System.out.println("Personne 1: " + personne1.nom + " " + personne1.prenom + ", Adresse: " + personne1.adresse.numeroRue + " " + personne1.adresse.libelleRue + ", " + personne1.adresse.codePostal + " " + personne1.adresse.ville);
        System.out.println("Personne 2: " + personne2.nom + " " + personne2.prenom + ", Adresse: " + personne2.adresse.numeroRue + " " + personne2.adresse.libelleRue + ", " + personne2.adresse.codePostal + " " + personne2.adresse.ville);
    }
}
