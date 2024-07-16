package listes;

import java.util.Comparator;

public class ComparatorHabitant implements Comparator<Ville> {
    @Override
    public int compare(Ville ville1, Ville ville2) {
        return Integer.compare(ville1.getNbHabitants(), ville2.getNbHabitants());
    }
}
