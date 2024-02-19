package gr.aueb.cf.CodingFactoryTestbed.src.gr.aueb.cf.exercise.abstractshape2;

import gr.aueb.cf.CodingFactoryTestbed.src.gr.aueb.cf.exercise.abstractshape.AbstractShape;
import gr.aueb.cf.CodingFactoryTestbed.src.gr.aueb.cf.exercise.abstractshape.ITwoDimensional;

import java.io.Serializable;

public class Circle extends AbstractShape implements ICircle {
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


}
