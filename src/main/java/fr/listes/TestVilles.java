package fr.listes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestVilles {
    public static void main(String[] args) {
        List<Ville> villes = new ArrayList<>();
        villes.add(new Ville("Nice", 343000,Continent.EUROPE ));
        villes.add(new Ville("Carcassonne", 47800,Continent.EUROPE ));
        villes.add(new Ville("Narbonne", 53400,Continent.EUROPE ));
        villes.add(new Ville("Lyon", 484000,Continent.EUROPE ));
        villes.add(new Ville("Foix", 9700,Continent.EUROPE ));
        villes.add(new Ville("Pau", 77200, Continent.EUROPE));
        villes.add(new Ville("Marseille", 850700,Continent.EUROPE ));
        villes.add(new Ville("Tarbes", 40600,Continent.EUROPE ));

        Ville villaMax = villes.get(0);
        for (ville ville : villes){
            if (ville.getPopulation()>villeMax.getPopulation()){
                villeMax = ville;
            }

            Ville villaMin = villes.get(0);
            for (ville ville : villes){
                if (ville.getPopulation()>villeMin.getPopulation()){
                    villeMin = ville;
                }

            villes.remove(villeMin);

           villes.forEach(ville -> system.out.println(ville));
           System.out.println("------------");

                for (ville ville : villes){
                    if (ville.getPopulation()>=100000){
                        ville.SetNom(ville.getNom().toUpperCase());

                    }


                }



