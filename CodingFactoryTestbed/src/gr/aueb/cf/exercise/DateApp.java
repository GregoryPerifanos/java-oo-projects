package gr.aueb.cf.exercise;

import java.util.Scanner;

public class DateApp {
    public static void main(String[] args) {
        // Declare date
        Scanner in = new Scanner(System.in);
        // Ask for date
        System.out.println("Please insert day:");
        int day = in.nextInt();
        System.out.println("Please insert month:");
        int month = in.nextInt();
        System.out.println("Please insert year:");
        int year = in.nextInt();
        // Print the date
        System.out.printf("%02d/%02d/%02d",day, month, year );
    }
}
