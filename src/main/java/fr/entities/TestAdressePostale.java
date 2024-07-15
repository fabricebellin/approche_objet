package entites;

public class TestAdressePostale {
    public static void main(String[] args) {
        //première adresse
        AdressePostale adressePostale1 = new AdressePostale(175,"chemin de bois mesnil", "82290", "Montbeton");
        //première adresse
        AdressePostale adressePostale2 = new AdressePostale(175,"chemin de bois mesnil", "82290", "Montbeton");

        affichageAdresse(adressePostale1);
        affichageAdresse(adressePostale2);
    }

    public static void affichageAdresse(AdressePostale adressePostale) {
        System.out.println("adresse :\n " + adressePostale.getNumeroRue() + ", " + adressePostale.getLibelleRue() + ", " + adressePostale.getCodepostal() + ", " + adressePostale.getVille() + ".");
    }
}
