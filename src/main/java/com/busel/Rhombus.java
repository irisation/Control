package com.busel;

/**
 * Created by Irko on 03.01.2015.
 */
public class Rhombus extends Tetragon {
    int angle;

    public Rhombus(int lengthSide, int angle) {
        super(lengthSide, lengthSide, lengthSide, lengthSide);
        this.angle = angle;
    }

    public Rhombus(int lengthSide, int angle, String colour) {
        super(lengthSide, lengthSide, lengthSide, lengthSide, colour);
        this.angle = angle;
    }

    public int getAngle() {
        return angle;
    }

    public void setAngle(int angle) {
        this.angle = angle;
    }

    @Override
    public void printInfo() {
        System.out.println("Rhombus is " + getColour() + " with sidelength " + getLengthA() + " and the smallest angles "
                + getAngle() );
    }
}
