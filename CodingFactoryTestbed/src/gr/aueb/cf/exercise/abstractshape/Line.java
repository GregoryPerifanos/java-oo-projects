package gr.aueb.cf.CodingFactoryTestbed.src.gr.aueb.cf.exercise.abstractshape;

public class Line extends AbstractShape {
    private double length;

    public Line(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }
}
