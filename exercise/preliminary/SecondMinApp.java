package gr.aueb.cf.exercise.preliminary;

public class SecondMinApp {

    public static void main(String[] args){


        int[] arr = {12, 3, 1, 10, 34, 9};
        int n = arr.length;
        System.out.print(secSmallest(arr, n));
    }
    
    
    
    
    public static int secSmallest(int[] arr, int n)
    {
        // assigning first element as smallest temporarily
        int smallest = arr[0];

        // we find the smallest element here
        for (int i = 0; i < n; i++){
            if(arr[i] < smallest)
                smallest = arr[i];
        }

        // temporarily assinging large max value
        int secSmall = Integer.MAX_VALUE;


        // finding second smallest here
        for (int i = 0; i < n; i++){
            if(arr[i] != smallest && arr[i] < secSmall)
                secSmall = arr[i];
        }

        return secSmall;

    }
   
}
