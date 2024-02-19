package gr.aueb.cf.CodingFactoryTestbed.src.gr.aueb.cf.exercise.CloneSerialize;

import gr.aueb.cf.CodingFactoryTestbed.src.gr.aueb.cf.exercise.abstractshape.AbstractShape;

import java.io.Serializable;

public class Line extends AbstractShape implements ILine,Cloneable, Serializable {
    private double length;

    public Line(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    @Override
    public Line clone() {
        try {
            return (Line) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

}
