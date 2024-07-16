package fr.entities.listes;

public class FusionListe {

    public static void main(String args[]) {
        // ... (initialisation de liste1 et liste2, inchangée) ...

        List<String> liste3 = new ArrayList<String>(); // Création de liste3

        // Ajout des éléments de liste1 à liste3 (avec boucle for-each)
        for (String couleur : liste1) {
            liste3.add(couleur);
        }

        // Ajout des éléments de liste2 à liste3 (avec boucle for-each)
        for (String couleur : liste2) {
            liste3.add(couleur);
        }

        // Affichage du résultat
        System.out.println("Liste fusionnée (liste3): " + liste3);
    }
}

