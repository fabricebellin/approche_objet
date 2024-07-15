package entites;

public class TestAdressePostale {
    public static void main(String[] args) {
        AdressePostale adresse1 = new AdressePostale(120, "Rue de Tulipes", 14500, "Vire");
        AdressePostale adresse2 = new AdressePostale(5, "des Maréchaux", 44100, "Nantes");

        System.out.println("Adresse 1: " + adresse1.numeroRue + " " + adresse1.libelleRue + ", " + adresse1.codePostal + " " + adresse1.ville);
        System.out.println("Adresse 2: " + adresse2.numeroRue + " " + adresse2.libelleRue + ", " + adresse2.codePostal + " " + adresse2.ville);
    }
}