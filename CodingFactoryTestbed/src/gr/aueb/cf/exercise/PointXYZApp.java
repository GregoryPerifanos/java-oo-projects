package gr.aueb.cf.exercise;

public class PointXYZApp {
    public static void main(String[] args) {
        PointXYZ point1 = new PointXYZ(1.0, 4.5, 6.7);
        PointXYZ point2 = new PointXYZ(12.0, 43.5, 62.7);

        System.out.println("Point 1: " + point1.convertToString());
        System.out.println("Point 2: " + point2.convertToString());
    }
}
