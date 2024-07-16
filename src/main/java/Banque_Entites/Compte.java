package Banque_Entites;

public class Compte {
    private final int numeroCompte;
    private int soldeCompte;

    public Compte(int numeroCompte, int soldeCompte) {
        this.numeroCompte = numeroCompte;
        this.soldeCompte = soldeCompte;
    }

    public void debiter(int debit) {
        this.soldeCompte -= debit; // Soustraire le débit du solde
    }

    public void crediter(int credit) {
        this.soldeCompte += credit;
    }

    @Override
    public String toString() {
        return "Solde du compte n°" + this.numeroCompte + " : " + this.soldeCompte + " euros";
    }
}

