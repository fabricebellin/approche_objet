class Ville {
    String nom;
    int nbHabitants;

    public Ville(String nom, int nbHabitants) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Même référence
        if (obj == null || getClass() != obj.getClass()) return false; // Types différents
        Ville ville = (Ville) obj;
        return nbHabitants == ville.nbHabitants && nom.equals(ville.nom); // Comparaison des attributs
    }
}

public class TestEquals {
    public static void main(String[] args) {
        Ville ville1 = new Ville("Paris", 2_165_423);
        Ville ville2 = new Ville("Paris", 2_165_423);
        Ville ville3 = new Ville("Lyon", 500_715);

        // Test avec equals
        System.out.println("ville1.equals(ville2): " + ville1.equals(ville2)); // true
        System.out.println("ville1.equals(ville3): " + ville1.equals(ville3)); // false

        // Test avec ==
        System.out.println("ville1 == ville2: " + (ville1 == ville2)); // false
        System.out.println("ville1 == ville1: " + (ville1 == ville1)); // true
    }
}
