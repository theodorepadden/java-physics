package com.physics;

public class physicsObject {

    private double[] position, velocity, acceleration;

    private double magnitudeVelocity, magnitudeAcceleration;

    private double calculateMagnitude(double[] numList) {
        return 
    }



    public physicsObject(double[] position, double[] velocity, double[] acceleration) {
        this.position = position;
        this.velocity = velocity;
        this.acceleration = acceleration;
    }



    public double[] getAcceleration() {
        return acceleration;
    }

    public double[] getPosition() {
        return position;
    }

    public double[] getVelocity() {
        return velocity;
    }
}