package com.physics;

public class Force {

    private double[] Magnitude;

    public void setMagnitude(double x, double y) {
        Magnitude = new double[] {x, y};
    }

    public double[] getMagnitude() {
        return Magnitude;
    }

    public Force(double MagX, double MagY) {
        this.setMagnitude(MagX, MagY);
    }
    //this is a test to make sure things are workingawdawdaw rgrg
    //ap calc test was easy
}
