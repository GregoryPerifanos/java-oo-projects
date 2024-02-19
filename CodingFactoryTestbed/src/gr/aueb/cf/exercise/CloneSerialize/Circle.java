package gr.aueb.cf.CodingFactoryTestbed.src.gr.aueb.cf.exercise.CloneSerialize;

import gr.aueb.cf.CodingFactoryTestbed.src.gr.aueb.cf.exercise.abstractshape.AbstractShape;

import java.io.Serializable;

public class Circle extends AbstractShape implements ICircle, Serializable, Cloneable {
    private double radius;

    @Override
    public double getDiameter() {
        return 0;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    @Override
    public Circle clone() {
        try {
            return (Circle) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
