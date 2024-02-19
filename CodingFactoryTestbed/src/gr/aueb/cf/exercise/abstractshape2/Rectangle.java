package gr.aueb.cf.CodingFactoryTestbed.src.gr.aueb.cf.exercise.abstractshape2;

import gr.aueb.cf.CodingFactoryTestbed.src.gr.aueb.cf.exercise.abstractshape.AbstractShape;
import gr.aueb.cf.CodingFactoryTestbed.src.gr.aueb.cf.exercise.abstractshape.ITwoDimensional;

import java.io.Serializable;

public class Rectangle extends AbstractShape implements IRectangle {
    private double width;
    private double height;

   @Override
    public double getArea() {
        return (width * height) / 2;
    }

    @Override
    public double getCircumference() {
        return 2 * (width + height);
    }


}


