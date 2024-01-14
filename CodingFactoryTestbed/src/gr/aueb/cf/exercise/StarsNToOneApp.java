package gr.aueb.cf.exercise;

import java.util.Scanner;

public class StarsNToOneApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;


        System.out.println("please insert your number of stars: ");
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++){
            for (int j = n; j >= i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
