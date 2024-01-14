package gr.aueb.cf.exercise;

import java.util.Scanner;

/**
 * Prompt the user for a year and then
 * checking if it is a leap year
 */
public class LeapYearApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = 0;

        System.out.println("Please enter Year:");
        year = scanner.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println("The year is leap");
        } else {
            System.out.println("The year is not leap");
        }


    }

}
