package gr.aueb.cf.exercise.Project;

public class Project2 {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = maxSubarraySum(arr);
        System.out.println("Maximum Sum Subarray: " + result); // Output: 6
    }
    public static int maxSubarraySum(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        int currentMax = arr[0];
        int globalMax = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentMax = Math.max(arr[i], currentMax + arr[i]);
            globalMax = Math.max(globalMax, currentMax);
        }

        return globalMax;
    }
}

