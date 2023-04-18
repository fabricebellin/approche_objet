package sets;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class TestSetString {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("USA");
		set.add("France");
		set.add("Allemagne");
		set.add("UK");
		set.add("Italie");
		set.add("Japon");
		set.add("Chine");
		set.add("Russie");
		set.add("Inde");
		
		String paysMax = "";
        int lettresMax = 0;
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String p = iterator.next();
            int nbLettres = p.length();
            if (nbLettres > lettresMax) {
                paysMax = p;
                lettresMax = nbLettres;
            }
        }
        System.out.println(set);

        System.out.println(paysMax);
        set.remove(paysMax);
        System.out.println(set);


	}

}
