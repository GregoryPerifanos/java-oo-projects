package gr.aueb.cf.exercise;

public class CarApp {
    static class Seira {
        int first;
        boolean second;

        Seira(int first, boolean second) {
            this.first = first;
            this.second = second;
        }
    }

    static void maxCars(int[][] arr, int n) {
        Seira[] a = new Seira[2 * n];

        for (int i = 0; i < n; i++) {
            a[2 * i] = new Seira(arr[i][0], true);
            a[2 * i + 1] = new Seira(arr[i][1], false);
        }

        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * n - i - 1; j++) {
                if (a[j].first > a[j + 1].first) {
                    Seira temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        int curMax = 0;
        int maxFinal = 0;

        for (int i = 0; i < 2 * n; ++i) {
            if (a[i].second) {
                curMax++;
            } else {
                if (curMax > maxFinal) {
                    maxFinal = curMax;
                }
                curMax--;
            }
        }

        System.out.println(maxFinal);
    }

    public static void main(String[] args) {
        int[][] arr = { { 1012, 1136 }, { 1317, 1412 }, { 1015, 1020 } };
        int N = arr.length;
        maxCars(arr, N);
    }
}

