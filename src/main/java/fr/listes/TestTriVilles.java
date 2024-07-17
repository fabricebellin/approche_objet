package fr.listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestTriVilles {
    public static void main(String[] args) {
        List<Ville> villes = new ArrayList<>();
        villes.add(new Ville("Nice", 343000,Continent.EUROPE ));
        villes.add(new Ville("Carcassonne", 47800,Continent.EUROPE ));
        villes.add(new Ville("Narbonne", 53400,Continent.EUROPE ));
        villes.add(new Ville("Lyon", 484000,Continent.EUROPE ));
        villes.add(new Ville("Foix", 9700,Continent.EUROPE ));
        villes.add(new Ville("Pau", 77200,Continent.EUROPE ));
        villes.add(new Ville("Marseille", 850700,Continent.EUROPE ));
        villes.add(new Ville("Tarbes", 40600,Continent.EUROPE ));
        Collections.sort(villes, new ComparatorHabitant());

        System.out.println("Villes triées par nombre d'habitants:");
        for (Ville ville : villes) {
            System.out.println(ville);
        }
    }
}

