package gr.aueb.cf.exercise.preliminary;

import java.util.Scanner;

public class StarCountApp {
    public static void main(String[] args) {
        int[] arr = new int[2];

        while (arr[1] !=6){
            arr = printMenu();
            getChoice(arr);
            System.out.println();
        }
    }

    public static int[] printMenu() {
        int[] array = new int[2];
        Scanner in = new Scanner(System.in);
        System.out.println("Give number of Stars: ");
        array[0] = in.nextInt();
        System.out.println(" ");
        System.out.println("Choose the way you like to see the stars");
        System.out.println("1. Horizontal");
        System.out.println("2. Downwards");
        System.out.println("3. N x N Layout");
        System.out.println("4. Ascending");
        System.out.println("5. Descending");
        System.out.println("6. Exit");
        System.out.println("Give me your choice: ");
        array[1] = in.nextInt();
        return array;
    }

    public static void starsH(int a) {

        for (int i = 1; i <= a; i++) {
            System.out.print(" *");
        }
        return;
    }
    public static void starsV(int a) {
        for(int i = 1; i <= a; i++) {
            System.out.println(" *");
        }
        return;
    }

    public static int[] getChoice(int[] array) {
        int a;
        switch (array[1]) {
            case 1:
                starsH(array[0]);
                break;
            case 2:
                starsV(array[0]);
                break;
            case 3:
               for (int i =1; i <= array[0]; i++) {
                   starsH(array[0]);
                   System.out.println();
               }
               break;
            case 4:
               for (int i  =1; i <= array[0]; i++) {
                   a = 1;
                   for (int j = 1; j <= i; j++) {
                       starsH(a);
                   }
                   System.out.println();
               }
               break;
            case 5:
                for (int i = array[0]; i >= 1; i--) {
                    starsH(array[0]);
                    array[0] = array [0] - 1;
                    System.out.println();
                }
                break;
            case 6:
                System.out.println("Exiting.... Please do not turn off your computer!!");
                break;
            default:
                System.out.println("Wrong number! Correct numbers are 1-6");
                break;
        }
        return array;
    }
}
