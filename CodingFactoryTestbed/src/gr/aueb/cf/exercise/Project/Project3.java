package gr.aueb.cf.exercise.Project;

public class Project3 {
    public static void main(String[] args) {
        int[] arr = {1, 2};
//        int[] clone1 = shallowCopy(arr);
//        int[] clone = deepCopy(arr);
//        clone[0] = 500;
//        clone1[0] = 400;
        // Shallow Copy
        int[] shallowClone = shallowCopy(arr);
        shallowClone[0] = 500;
        System.out.print("Shallow Copy: ");
        for (int el : arr) {
            System.out.print(el + " ");
        }
        System.out.println();
        // Deep Copy
        int[] deepClone = deepCopy(arr);
        deepClone[0] = 1000;
        System.out.print("Deep Copy: ");
        for (int el : arr) {
            System.out.print(el + " "); // This will print "500 2" since deepCopy does not affect the original array
        }
    }
    public static int[] shallowCopy(int[] arr) {
        return arr;
    }
    public static int[] deepCopy(int[] arr){
        int[]arrayToReturn = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrayToReturn[i] = arr[i];
        }
        return arrayToReturn;
    }
}
