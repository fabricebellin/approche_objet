package Utils;

public class TestMethodeStatic {

    public static void main(String[] args) {
        // Conversion d'une chaîne en entier (avec gestion d'erreur)
        String chaine = "12";
        int chaineConvertie;
        try {
            chaineConvertie = Integer.parseInt(chaine);
        } catch (NumberFormatException e) {
            System.err.println("Erreur : La chaîne ne peut pas être convertie en entier.");
            return; // Quitte le programme en cas d'erreur
        }

        // Génération de nombres aléatoires (avec constantes pour plus de clarté)
        final int MIN_RANDOM = 1;
        final int MAX_RANDOM = 100;

        int a = (int) (Math.random() * (MAX_RANDOM - MIN_RANDOM + 1) + MIN_RANDOM);
        int b = (int) (Math.random() * (MAX_RANDOM - MIN_RANDOM + 1) + MIN_RANDOM);

        // Utilisation de la méthode statique max() de la classe Integer
        int max = Integer.max(a, b);

        // Affichage du résultat (avec formatage amélioré)
        System.out.printf("Maximum entre %d et %d : %d%n", a, b, max);
    }
}

