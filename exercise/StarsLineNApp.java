package gr.aueb.cf.exercise;

import java.util.Scanner;

public class StarsLineNApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;


        System.out.println("please insert your number of stars: ");
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.print("*");
        }
    }
}
