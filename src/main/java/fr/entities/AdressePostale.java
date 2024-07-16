package listes;

public class AdressePostale {

    private int numeroDeRue;
    private String libelleRue;
    private int codePostal; // Type int pour le code postal
    private String ville;

    // Constructeur
    public AdressePostale(int numeroDeRue, String libelleRue, int codePostal, String ville) {
        this.numeroDeRue = numeroDeRue;
        this.libelleRue = libelleRue;
        this.codePostal = codePostal;
        this.ville = ville;
    }

    // Getters
    public int getNumeroDeRue() {
        return this.numeroDeRue;
    }

    public String getLibelleRue() {
        return this.libelleRue;
    }

    public int getCodePostal() { // Type de retour int
        return this.codePostal;
    }

    public String getVille() {
        return this.ville;
    }

    // toString() pour afficher l'adresse
    @Override
    public String toString() {
        return numeroDeRue + " " + libelleRue + ", " + codePostal + " " + ville;
    }
}
