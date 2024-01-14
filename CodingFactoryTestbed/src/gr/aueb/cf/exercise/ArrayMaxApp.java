package gr.aueb.cf.exercise;

public class ArrayMaxApp {
    public static void main(String[] args) {
        int[] arr ={6, 8, 2, 67, 3};

        int maxPosition = 0;
        int maxValue = arr[maxPosition];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxPosition = i;
                maxValue = arr[maxPosition];
            }
        }

        System.out.printf("Max value = %d, max position = %d", maxValue, maxPosition + 1);
    }
}

