package gr.aueb.cf.exercise;

import java.util.Scanner;

public class StarsOneToNApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;


        System.out.println("please insert your number of stars: ");
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
