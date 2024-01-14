package gr.aueb.cf.exercise;

import java.util.Scanner;

public class ConvertStringToASCIIAndBackApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s;


        System.out.println("Please insert a string that you need to be converted ");
        s = in.nextLine();
        String convertedString = convertToNextAscII(s);
        String backToOriginal = convertToPreviousAscII(convertedString);

        System.out.println("Your Coded String is: " +  convertedString);
        System.out.println("Your Reverse Coded String is: " + backToOriginal);
    }

    public static String convertToNextAscII(String input) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            char convertedChar = (char) (c + 1);
            result.append(convertedChar);
        }
        return result.toString();

    }
    public static String convertToPreviousAscII(String input) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            char convertedChar = (char) (c - 1);
            result.append(convertedChar);
        }
        return result.toString();

    }
}
