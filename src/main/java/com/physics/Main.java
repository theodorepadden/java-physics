package com.physics;

public class Main {
    public static void main(String[] args) {

        Force Gravity = new Force(0, -9.81);

        physicsObject Ball = new physicsObject(new double[] {0,0}, new double[] {0,0}, new double[] {0,0}, 1);

        Ball.applyForce(Gravity);
        System.out.println(Ball.getPosition());
        System.out.println(Ball.getMagnitudeVelocity());
        System.out.println(Ball.getMagnitudeAcceleration());
    }
}