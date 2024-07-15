package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        AdressePostale adresse1 = new AdressePostale(120, "Rue de Tulipes", 14500, "Vire");
        AdressePostale adresse2 = new AdressePostale(5, "des Maréchaux", 44100, "Nantes");

        Personne personne1 = new Personne("Dupont", "Jean", adresse1);
        Personne personne2 = new Personne("Martin", "Anne", adresse2);

        System.out.println("Personne 1: " + personne1.nom + " " + personne1.prenom + ", Adresse: " + personne1.adresse.numeroRue + " " + personne1.adresse.libelleRue + ", " + personne1.adresse.codePostal + " " + personne1.adresse.ville);
        System.out.println("Personne 2: " + personne2.nom + " " + personne2.prenom + ", Adresse: " + personne2.adresse.numeroRue + " " + personne2.adresse.libelleRue + ", " + personne2.adresse.codePostal + " " + personne2.adresse.ville);
    }
}