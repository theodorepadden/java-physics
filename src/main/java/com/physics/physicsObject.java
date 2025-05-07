package com.physics;
import java.lang.Math;
import java.util.*;

public class physicsObject {

    private double[] position, velocity, acceleration;

    private double magnitudeVelocity, magnitudeAcceleration, Mass;

    private List<Force> appliedForces = new ArrayList<>();

    private double calculateMagnitude(double[] numList) {
        return Math.sqrt(Math.pow(numList[0], 2) + Math.pow(numList[1], 2));
    }

    public void setAcceleration(double[] newAccel) {
        acceleration = newAccel;
        magnitudeAcceleration = calculateMagnitude(acceleration);
    }

    public void setVelocity(double[] newVelocity) {
        velocity = newVelocity;
        magnitudeVelocity = calculateMagnitude(velocity);
    }

    public physicsObject(double[] position, double[] velocity, double[] acceleration, double mass) {
        this.position = position;
        this.velocity = velocity;
        this.acceleration = acceleration;
        this.Mass = mass;
        this.magnitudeVelocity = calculateMagnitude(velocity);
        this.magnitudeAcceleration = calculateMagnitude(acceleration);
    }

    public void applyForce(Force appliedForce) {
        appliedForces.add(appliedForce);
        double[] newAcceleration = new double[] {appliedForce.getMagnitude()[0]/Mass, appliedForce.getMagnitude()[1]/Mass};
        this.setAcceleration(newAcceleration);
    }

    public double getMagnitudeAcceleration() {
        return magnitudeAcceleration;
    }

    public double getMagnitudeVelocity() {
        return magnitudeVelocity;
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