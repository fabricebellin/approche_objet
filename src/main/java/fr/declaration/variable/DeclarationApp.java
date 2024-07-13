package fr.declaration.variable; // Création du package

public class DeclarationApp {
    public static void main(String[] args) {

        // Déclaration et initialisation des variables de types primitifs
        byte monByte = 10;
        short monShort = 2000;
        int monInt = 100000;
        long monLong = 1234567890L; // 'L' indique un long
        float monFloat = 3.14f; // 'f' indique un float
        double monDouble = 2.71828;
        char monChar = 'Z';
        boolean monBoolean = false;

        // Déclaration et initialisation d'une variable de type String
        String maChaine = "Bonjour le monde!";

        // Affichage des valeurs des variables
        System.out.println("byte : " + monByte);
        System.out.println("short : " + monShort);
        System.out.println("int : " + monInt);
        System.out.println("long : " + monLong);
        System.out.println("float : " + monFloat);
        System.out.println("double : " + monDouble);
        System.out.println("char : " + monChar);
        System.out.println("boolean : " + monBoolean);
        System.out.println("String : " + maChaine);

        // Utilisation de System.out.println() pour afficher un littéral
        System.out.println("Ceci est un exemple de littéral affiché directement.");

        // Déclaration et affichage d'une chaîne avec retour à la ligne
        String randomString = "Voici le résultat d'un calcul: 1 + 5 =\n6"; // \n pour le retour à la ligne
        System.out.println(randomString);
    }
}





