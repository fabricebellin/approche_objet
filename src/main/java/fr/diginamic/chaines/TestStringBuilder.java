package fr.diginamic.chaines;

public class TestStringBuilder {

    public static void main(String[] args) {
        // Test avec StringBuilder
        long debutStringBuilder = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 100_000; i++) {
            sb.append(i);
        }
        String resultatStringBuilder = sb.toString();
        long finStringBuilder = System.currentTimeMillis();

        System.out.println("Temps écoulé avec StringBuilder : " + (finStringBuilder - debutStringBuilder) + " ms");

        // Test avec String et concaténation
        long debutString = System.currentTimeMillis();
        String resultatString = "";
        for (int i = 1; i <= 100_000; i++) {
            resultatString += i; // Concaténation directe sur un String
        }
        long finString = System.currentTimeMillis();

        System.out.println("Temps écoulé avec String : " + (finString - debutString) + " ms");
    }
}
