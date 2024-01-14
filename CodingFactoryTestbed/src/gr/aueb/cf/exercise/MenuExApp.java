package gr.aueb.cf.exercise;

import java.util.Scanner;

public class MenuExApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choise = 0;

        do {
            System.out.println("Διάλεξε μια απο τις παρακάτω επιλογές ή 5. γισ έξοδο");
            System.out.println("1. Εισαγωγή");
            System.out.println("2. Διαγραφή");
            System.out.println("3. Ενημέρωση");
            System.out.println("4. Αναζήτηση");
            System.out.println("5. Έξοδος");
            choise = scanner.nextInt();

            if (choise == 1) {
                System.out.println("Επιτυχεις Εισαγωγή");
            } else if (choise == 2){
                System.out.println("Επιτυχεις Διαγραφή");
            } else if (choise == 3) {
                System.out.println("Επιτυχεις Ενημέρωση");
            } else if (choise == 4) {
                System.out.println("Επιτυχεις Αναζήτηση");
            } else if (choise == 5) {
                System.out.println("Επιλέξατε Έξοδο");
            } else {
                System.out.println("Λάθος Επιλογή");
            }
        } while (choise != 5);

        System.out.println("Αντίο");

    }

}
