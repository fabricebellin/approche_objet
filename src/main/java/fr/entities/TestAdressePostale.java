package entites;

public class TestAdressePostale {
    public static void main(String[] args) {
        AdressePostale adresse1 = new AdressePostale(175, "chemin de bois mesnil", 82290, "Montbeton");
        AdressePostale adresse2 = new AdressePostale(180, "chemin des bois mesnil", 82290, "Montbeton");

        System.out.println("Adresse 1: " + adresse1.numeroRue + " " + adresse1.libelleRue + ", " + adresse1.codePostal + " " + adresse1.ville);
        System.out.println("Adresse 2: " + adresse2.numeroRue + " " + adresse2.libelleRue + ", " + adresse2.codePostal + " " + adresse2.ville);
    }
}