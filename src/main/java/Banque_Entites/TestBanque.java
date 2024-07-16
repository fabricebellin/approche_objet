package Banque_Entites; // Assurez-vous que le nom du package correspond à l'emplacement du fichier

public class TestBanque { // Correction de la typo dans le nom de la classe
    public static void main(String[] args) {
        Compte unCompte = new Compte(1, 13294);

        System.out.println(unCompte);

        unCompte.debiter(6300);
        System.out.println("Grosse dépense (-6300€)"); // Correction de la chaîne de caractères
        System.out.println(unCompte);

        unCompte.crediter(1800);
        System.out.println("Vous recevez votre salaire (+1800€)"); // Correction de la chaîne de caractères
        System.out.println(unCompte);

        Compte[] tabComptes = new Compte[2];
        Compte compte1 = new Compte(2, 3204); // Correction de la syntaxe du constructeur
        CompteTaux compte2 = new CompteTaux(3, 6495, 4); // Correction de la syntaxe du constructeur

        tabComptes[0] = compte1;
        tabComptes[1] = compte2; // Correction de l'index du tableau

        for (Compte unCompteDansTab : tabComptes) {
            System.out.println(unCompteDansTab.toString());
        }
    }
}


