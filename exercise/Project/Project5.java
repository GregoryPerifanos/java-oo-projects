package gr.aueb.cf.exercise.Project;

import java.util.Arrays;

public class Project5 {
    public static boolean[][] seats;

    public static void main(String[] args) {
        initializeSeats();

        book('C', 2);
        book('B', 5);
        book('A', 10);
        book('L', 30);

        printTheater();

        cancel('L', 30);

        printTheater();

    }

    public static void initializeSeats() {
        seats = new boolean[30][12];
        for (int i = 0; i < seats.length; i++) {
            Arrays.fill(seats[i], false);
        }
    }

    public static boolean isValidSeat(int row, int column) {
        return row >= 0 && row < seats.length && column >= 0 && column < seats[0].length;
    }

    public static void book(char column, int row) {
        int columnIndex = column - 'A';
        int rowIndex = row - 1;

        if (isValidSeat(rowIndex, columnIndex) && !seats[rowIndex][columnIndex]) {
            seats[rowIndex][columnIndex] = true;
            System.out.println("Seat " + column + row + " booked successfully.");
        } else {
            System.out.println("Seat " + column + row + " is already booked or invalid.");
        }
    }

    public static void cancel(char column, int row) {
        int columnIndex = column - 'A';
        int rowIndex = row - 1;

        if (isValidSeat(rowIndex, columnIndex) && seats[rowIndex][columnIndex]) {
            seats[rowIndex][columnIndex] = false;
            System.out.println("Reservation canceled for seat " + column + row + ".");
        } else {
            System.out.println("Seat " + column + row + " is not booked or invalid.");
        }
    }

    public static void printTheater() {
        System.out.println("Current Theater Status:");
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                System.out.print(seats[i][j] ? "X " : "O ");
            }
            System.out.println();
        }
        System.out.println("-------------------------");
    }
}