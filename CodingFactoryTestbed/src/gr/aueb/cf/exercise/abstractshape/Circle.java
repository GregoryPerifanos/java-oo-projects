package gr.aueb.cf.CodingFactoryTestbed.src.gr.aueb.cf.exercise.abstractshape;

public class Circle extends AbstractShape implements ITwoDimensional{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
