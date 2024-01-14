package gr.aueb.cf.exercise;

public class HighLowApp {
    public static void main(String[] args) {
        // Given array
        int[] arr = new int[]{0, 1, 4, 4, 4, 6, 7, 8, 8, 8, 8, 8};

        // Find and print the highest and lowest values
        findHighAndLow(arr);
    }

    /**
     * find and checks the highest and lowest
     * of an array and the prints
     * the result.
     * @param arr   the source array.
     */
    public static void findHighAndLow(int[] arr) {
        // Check if the array is not empty
        if (arr.length == 0) {
            System.out.println("Array is empty");
            return;
        }

        // Initialize variables to hold high and low values
        int highest = arr[0];
        int lowest = arr[0];

        // Iterate through the array to find high and low values
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > highest) {
                highest = arr[i];
            } else if (arr[i] < lowest) {
                lowest = arr[i];
            }
        }

        // Print the results
        System.out.println("Highest value: " + highest);
        System.out.println("Lowest value: " + lowest);
    }
}
