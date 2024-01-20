package gr.aueb.cf.exercise.point;

public class Point {
    private double x;

    public Point() {

    }

    public Point(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

//    public String convertToString() {
//        return "(" + x + ")";
//    }

    public void movePlus10() {
        // x += 10;

        //self use
        for (int i = 1; i<= 10; i++) {
            movePlusOne();
        }
    }

    @Override
    public String toString() {
         return "(" + x + ")";
    }

    protected void movePlusOne (){
        x += 1;
    }

    protected void printTypeOf() {
        System.out.println(this.getClass().getSimpleName());;
    }

    private void reset() {
        x = 0;
    }

    public double getDistanceFromOrigin() {
        return Math.abs(this.x);
    }
}