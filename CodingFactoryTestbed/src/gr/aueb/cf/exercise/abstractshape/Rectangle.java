package gr.aueb.cf.CodingFactoryTestbed.src.gr.aueb.cf.exercise.abstractshape;

public class Rectangle extends AbstractShape implements ITwoDimensional{
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (width * height) / 2;
    }
}
