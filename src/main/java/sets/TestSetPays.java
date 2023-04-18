package sets;

import java.util.HashSet;
import java.util.Iterator;

public class TestSetPays {

	public static void main(String[] args) {
		
		HashSet<Pays> set = new HashSet<>();
		set.add(new Pays("USA", 328239_523, 62_606));
        set.add(new Pays("France", 67_413_000, 44_552));
        set.add(new Pays("Allemagne", 83_166_711, 50_206));
        set.add(new Pays("UK", 66_440_700, 42_559));
        set.add(new Pays("Italie", 60_462_375, 33_296));
        set.add(new Pays("Japon", 126_264_931, 39_290));
        set.add(new Pays("Chine", 1_439_323_776, 10_100));
        set.add(new Pays("Russie", 145_912_025, 11_615));
        set.add(new Pays("Inde", 1_366_417_754, 2_171));


		double maxPibHabitant = 0;
        Pays paysMax = null;
        Iterator<Pays> iterator = set.iterator();
        while (iterator.hasNext()) {
            Pays pays = iterator.next();
            if (pays.getPibParHabitant() > maxPibHabitant) {
                maxPibHabitant = pays.getPibParHabitant();
                paysMax = pays;
            }
        }
		
        System.out.println(paysMax);

        Pays pibTotalMax = null;
        double PIBtotalMax = Double.MIN_VALUE;
        for (Pays p : set) {
            if (p.getPIBtotal() > PIBtotalMax) {
                PIBtotalMax = p.getPIBtotal();
                pibTotalMax = p;
            }
        }
        System.out.println(pibTotalMax);
        
        Pays paysPIBtotalMin = null;
        double PIBtotalMin = Double.MAX_VALUE;
        for (Pays p : set) {
            if (p.getPIBtotal() < PIBtotalMin) {
                PIBtotalMin = p.getPIBtotal();
                paysPIBtotalMin = p;
            }
        }

        if (paysPIBtotalMin != null) {
            paysPIBtotalMin.nom = paysPIBtotalMin.nom.toUpperCase();
        }

        System.out.println(set);
        System.out.println(paysPIBtotalMin);
        set.remove(paysPIBtotalMin);
        System.out.println(set);

        for (Pays p : set) {
            System.out.println("Nom: " + p.getNom());
            System.out.println("Nombre d'habitants: " + p.getNbHabitant());
            System.out.println("Pib total:  " + p.getPIBtotal());
        }
	}

}
