package fr.diginamic.chaines;

public class TestStringBuilder {

	public static void main(String[] args) {
        long debut = System.currentTimeMillis();

        StringBuilder s = new StringBuilder();
        for (int i = 1; i <= 100000; i++) {
            s.append(i);
        }

        long fin = System.currentTimeMillis();
        long duration = fin - debut;
        System.out.println("Time taken: " + duration + " milliseconds");
        
        
        long startTime = System.currentTimeMillis();

        String sb = "";
        for (int i = 1; i <= 100000; i++) {
            sb += i;
        }

        long endTime = System.currentTimeMillis();
        long dure = endTime - startTime;
        System.out.println("Time taken: " + dure + " milliseconds");
    }
}
