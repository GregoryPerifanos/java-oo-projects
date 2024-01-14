package gr.aueb.cf.exercise;

public class PointXYZ {
    private double x;
    private double y;
    private double z;


    public PointXYZ(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public String convertToString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}
