package Listes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestVilles {

    public static void main(String[] args) {
        List<Ville> villes = new ArrayList<>();
        villes.add(new Ville("Nice", 343_000));
        villes.add(new Ville("Carcassonne", 47_800));
        villes.add(new Ville("Narbonne", 55_100)); // Correction : "Narbonne" au lieu de " Narbonne"
        villes.add(new Ville("Lyon", 516_092)); // Correction : Nombre d'habitants mis à jour
        villes.add(new Ville("Foix", 9_700)); // Correction : Nombre d'habitants mis à jour
        villes.add(new Ville("Pau", 77_200));
        villes.add(new Ville("Marseille", 850_700));
        villes.add(new Ville("Tarbes", 40_600));

        System.out.println("Liste des villes : " + villes);

        // Recherche de la ville la plus peuplée
        Ville villePlusPeuplee = villes.stream()
                .max(Comparator.comparingInt(Ville::getNbHabitants))
                .orElse(null); // Correction : Gestion du cas où la liste est vide
        System.out.println("La ville la plus peuplée est : " + villePlusPeuplee);

        // Suppression de la ville la moins peuplée
        Ville villeMoinsPeuplee = villes.stream()
                .min(Comparator.comparingInt(Ville::getNbHabitants))
                .orElse(null); // Correction : Gestion du cas où la liste est vide
        if (villeMoinsPeuplee != null) { // Vérification avant suppression
            villes.remove(villeMoinsPeuplee);
        }
        System.out.println("La ville la moins peuplée (supprimée) est : " + villeMoinsPeuplee);

        // Modification des villes de plus de 100 000 habitants
        villes.forEach(ville -> {
            if (ville.getNbHabitants() > 100_000) {
                ville.setNom(ville.getNom().toUpperCase());
            }
        });

        // Affichage de la liste résultante
        System.out.println("\nListe des villes après modifications :");
        villes.forEach(System.out::println);
    }
}
