package gr.aueb.cf.exercise.Project;

import java.util.Scanner;

public class Project4 {
    public static void main(String[] args) {
        int[][] gameBoard = new int[3][3];
        Scanner scanner = new Scanner(System.in);
        int currentPlayer = 1;

        for (int turn = 1; turn <= 9; turn++) {
            printGameBoard(gameBoard);

            int row, col;
            do {
                System.out.println("Player " + currentPlayer + "'s turn. Enter (0-2) and column (0-2) separated by space:");
                while (!scanner.hasNextInt()) {
                    System.out.println("Invalid input. Please enter a number 1 or 2.");
                    scanner.next();
                }
                row = scanner.nextInt();
                while (!scanner.hasNextInt()) {
                    System.out.println("Invalid input. Please enter a number 1 or 2.");
                    scanner.next();
                }
                col = scanner.nextInt();
            } while (!isValidMove(row, col, gameBoard));

            gameBoard[row][col] = currentPlayer;

            if (checkWin(currentPlayer, gameBoard)) {
                System.out.println("Player " + currentPlayer + " wins");
                break;
            }

            currentPlayer = (currentPlayer == 1) ? 2 : 1;
            printGameBoard(gameBoard);


        }
        scanner.close();
    }

    public static void printGameBoard(int[][] gameBoard) {
        System.out.println("Current Game Board is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(gameBoard[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static boolean isValidMove(int row, int col, int[][] gameBoard){
        if (row < 0 || row >= 3 || col < 0 || col >= 3) {
            System.out.println("Invalid move. Row and column must be between 0 and 2.");
            return false;
        }
        if (gameBoard[row][col] != 0) {
            System.out.println("Cell already taken. Choose again.");
            return false;
        }
        return true;

    }
    public static boolean checkWin(int currentPlayer, int[][] gameBoard) {
        // Check rows and columns
        for (int i = 0; i < 3; i++) {
            if ((gameBoard[i][0] == currentPlayer && gameBoard[i][1] == currentPlayer && gameBoard[i][2] == currentPlayer) ||
                    (gameBoard[0][i] == currentPlayer && gameBoard[1][i] == currentPlayer && gameBoard[2][i] == currentPlayer)) {
                return true;
            }
        }

        // Check diagonals
        if ((gameBoard[0][0] == currentPlayer && gameBoard[1][1] == currentPlayer && gameBoard[2][2] == currentPlayer) ||
                (gameBoard[0][2] == currentPlayer && gameBoard[1][1] == currentPlayer && gameBoard[2][0] == currentPlayer)) {
            return true;
        }

        return false;
    }
}