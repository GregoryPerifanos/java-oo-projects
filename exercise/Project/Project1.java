package gr.aueb.cf.exercise.Project;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Project1 {
    public static int numLine = 0;
    public static void main(String[] args) {
        try {
            // Διαβάζουμε τους αριθμούς από το αρχείο
            int[] numbers = readNumbersFromFile("E:/input.txt");

            // Ταξινομούμε τον πίνακα
            Arrays.sort(numbers);

            // Αναζητούμε και εκτυπώνουμε τις εξάδες
            findAndPrintCombinations(numbers, "E:/output.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int[] readNumbersFromFile(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line = reader.readLine(); // Read the entire line
        reader.close();

        if (line == null || line.trim().isEmpty()) {
            System.err.println("Empty or invalid input file.");
            System.exit(1);
        }

        // Split the line into an array of strings
        String[] numberStrings = line.trim().split("\\s+");

        // Convert the array of strings to an array of integers
        int[] numbers = new int[numberStrings.length];
        for (int i = 0; i < numberStrings.length; i++) {
            try {
                numbers[i] = Integer.parseInt(numberStrings[i]);
            } catch (NumberFormatException e) {
                System.err.println("Skipping invalid number: " + numberStrings[i]);
            }
        }

        return numbers;
    }

    public static void findAndPrintCombinations(int[] numbers, String outputFileName) throws IOException {
        PrintWriter writer = new PrintWriter(new FileWriter(outputFileName));

        for (int i = 0; i < numbers.length - 5; i++) {
            for (int j = i + 1; j < numbers.length - 4; j++) {
                for (int k = j + 1; k < numbers.length - 3; k++) {
                    for (int l = k + 1; l < numbers.length - 2; l++) {
                        for (int m = l + 1; m < numbers.length - 1; m++) {
                            for (int n = m + 1; n < numbers.length; n++) {
                                int[] combination = {numbers[i], numbers[j], numbers[k], numbers[l], numbers[m], numbers[n]};
                                if (isValidCombination(combination)) {
                                    printCombination(writer, combination);
                                }
                            }
                        }
                    }
                }
            }
        }
        writer.close();
    }

    public static boolean isValidCombination(int[] combination) {
        return isAtMostNEven(combination, 4) &&
                isAtMostNOdd(combination, 4) &&
                hasAtMostNConsecutive(combination, 2) &&
                hasAtMostNSameEnding(combination, 3) &&
                hasAtMostNInSameTen(combination, 3);
    }

    public static boolean isAtMostNEven(int[] combination, int n) {
        int count = 0;
        for (int num : combination) {
            if (num % 2 == 0) {
                count++;
                if (count > n) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isAtMostNOdd(int[] combination, int n) {
        int count = 0;
        for (int num : combination) {
            if (num % 2 != 0) {
                count++;
                if (count > n) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean hasAtMostNConsecutive(int[] combination, int n) {
        Arrays.sort(combination);
        int count = 1;
        for (int i = 1; i < combination.length; i++) {
            if (combination[i] == combination[i - 1] + 1) {
                count++;
                if (count > n) {
                    return false;
                }
            } else {
                count = 1;
            }
        }
        return true;
    }

    public static boolean hasAtMostNSameEnding(int[] combination, int n) {
        int count = 1;
        for (int i = 1; i < combination.length; i++) {
            if (combination[i] % 10 == combination[i - 1] % 10) {
                count++;
                if (count > n) {
                    return false;
                }
            } else {
                count = 1;
            }
        }
        return true;
    }

    public static boolean hasAtMostNInSameTen(int[] combination, int n) {
        Arrays.sort(combination);
        int count = 1;
        for (int i = 1; i < combination.length; i++) {
            if (combination[i] / 10 == combination[i - 1] / 10) {
                count++;
                if (count > n) {
                    return false;
                }
            } else {
                count = 1;
            }
        }
        return true;
    }

    public static void printCombination(PrintWriter writer, int[] combination) {
        numLine++;
        writer.print(numLine+": ");
        for (int num : combination) {
            writer.print(num + " ");
        }
        writer.println();
    }
}
