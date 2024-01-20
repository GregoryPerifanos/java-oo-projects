package gr.aueb.cf.exercise.point;

public class PointUtil{
    public static double distanceFromOrigin(Point point) {
        return point.getDistanceFromOrigin();
    }

    public static double distanceFromOrigin(Point2D point) {
        return point.getDistanceFromOrigin2D();
    }

    public static double distanceFromOrigin(Point3D point){
        return point.getDistanceFormOrigin3D();
    }

}
