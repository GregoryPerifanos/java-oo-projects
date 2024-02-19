package gr.aueb.cf.CodingFactoryTestbed.src.gr.aueb.cf.exercise.abstractshape2;

import gr.aueb.cf.CodingFactoryTestbed.src.gr.aueb.cf.exercise.abstractshape.AbstractShape;

import java.io.Serializable;

public class Line extends AbstractShape implements ILine {
    private double length;

    public Line(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }


}
