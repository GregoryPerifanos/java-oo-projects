package gr.aueb.cf.exercise;

import java.util.Scanner;

public class FahrenhitConverterApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int Fahrenheit;
        int Celcius;


        System.out.println("Insert Fahrenheit:");
        Fahrenheit = in.nextInt();

        Celcius = 5 * (Fahrenheit-32) / 9;


        System.out.println("Celcius is: " + Celcius );




    }
}