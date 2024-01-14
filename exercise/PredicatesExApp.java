package gr.aueb.cf.exercise;

import java.util.Scanner;

public class PredicatesExApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[6];

        System.out.println("Enter your six elements: ");
        for (int i = 0; i < 6; i++) {
            if (in.hasNextInt()) {
                arr[i] = in.nextInt();
            }
        }

    }
    public static boolean noMoreThanThreeSameEndings(int[] arr) {
        if (arr == null) return false;
        int[] endings = new int[6];
        boolean hasEndings = true;

        for (int item : arr) {
            endings[item % 6]++;
        }
        for (int item : endings) {
            if (item >= 3) {
                hasEndings = false;
                break;
            }
        }
        return hasEndings;
    }



}
