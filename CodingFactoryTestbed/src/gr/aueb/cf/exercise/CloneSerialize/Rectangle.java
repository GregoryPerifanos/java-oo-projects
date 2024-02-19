package gr.aueb.cf.CodingFactoryTestbed.src.gr.aueb.cf.exercise.CloneSerialize;

import gr.aueb.cf.CodingFactoryTestbed.src.gr.aueb.cf.exercise.abstractshape.AbstractShape;

import java.io.Serializable;

public class Rectangle extends AbstractShape implements IRectangle, Cloneable, Serializable {
    private double width;
    private double height;

   @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getCircumference() {
        return 2 * (width + height);
    }

    @Override
    public Rectangle clone() {
        try {
            return (Rectangle) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}


