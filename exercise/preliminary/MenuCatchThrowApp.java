package gr.aueb.cf.exercise.preliminary;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuCatchThrowApp {
    public static void main(String[] args) {
        int choice = 0;

        do {
            try {
                choice = getChoice();
                printChoice(choice);

            } catch (InputMismatchException e) {
                System.out.println("Please insert a number!");
            } catch (IllegalArgumentException e) {
                System.out.println("insert an integer from 1-4 or 5 for exit! ");
            }
        } while (choice != 5);

    }

    public static int getChoice() {
        Scanner in = new Scanner(System.in);
        int choice = 0;
        boolean userChoice = false;

        System.out.println("Choose one of the following");
        System.out.println("1. Εισαγωγή");
        System.out.println("2. Ενημέρωση");
        System.out.println("3. Διαγραφή");
        System.out.println("4. Αναζήτηση");
        System.out.println("5. Έξοδος");


        if (!in.hasNextInt()) {
            System.out.println("Invalid Input!");
            in.hasNextInt();
        }
        choice = in.nextInt();
        return choice;
    }

    public static void printChoice(int choice) {
        if (choice >= 1 && choice <= 5) {
            System.out.println("done");
        } else {
            throw new IllegalArgumentException("wrong");
        }
    }
}
