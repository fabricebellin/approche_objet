package Banque_Entites;

public class CompteTaux extends Compte{

    private final int tauxRemuneration;

    public CompteTaux(int numeroCompte, int soldeCompte, int tauxRemuneration) {
        super(numeroCompte, soldeCompte);
        this.tauxRemuneration = tauxRemuneration;
    }

    public String toString()
    {
        return super.toString() + " (taux : " + this.tauxRemuneration + "%)";
    }
}