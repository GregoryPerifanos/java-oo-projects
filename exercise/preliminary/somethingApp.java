package gr.aueb.cf.exercise.preliminary;

public class somethingApp {
    public static void main(String[] args) {
        final int  HUNDREDS = 100;
        int num = 1234;

        int a = num / HUNDREDS;
        int b = num % HUNDREDS;

        System.out.println(a + " " + b);
    }
}
