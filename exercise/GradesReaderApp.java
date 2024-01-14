package gr.aueb.cf.exercise;

import java.io.*;
import java.util.Scanner;



public class GradesReaderApp {
    public static void main(String[] args) {
        String line = "";
        String[] lines = new String[]{};
        String name = "";
        String surname = "";
        float firstGrade = 0;
        float secondGrade = 0;
        float averageGrade = 0;

        File dir = new File("E:/grades.txt");

        if (!dir.exists()) {
            if (!dir.mkdir()) {
                System.err.println("Error in make dri");
                System.exit(1);
            }
        }

        try (BufferedReader bf = new BufferedReader(new FileReader("E:/grades.txt"))) {
            while ((line != null)) {
                line = bf.readLine();
                if (line == null) break;
                lines = line.split(" +");
                name = lines[0];
                surname = lines[1];
                firstGrade = Float.parseFloat(lines[2]);
                secondGrade = Float.parseFloat(lines[3]);
                System.out.print(name + " ");
                System.out.print(surname + " ");
                System.out.print(firstGrade + " ");
                System.out.print(secondGrade + " ");
                averageGrade = (firstGrade + secondGrade) / 2;
                PrintWriter averageWriter = new PrintWriter(new FileWriter("E:/primOut.txt"), true);
                averageWriter.println("The average grade of" + name + " " + surname + "is" + averageGrade);
                averageWriter.close();
                System.out.println("           " + averageGrade);
                PrintWriter logWriter = new PrintWriter(new FileWriter("E:/log.txt", true));
                if ((firstGrade <= 0 || firstGrade >= 10) || (secondGrade <= 0 || secondGrade >= 10)) {
                    logWriter.println("Error: Invalid grade for Student name:" + name + " " + surname);
                }
                logWriter.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
