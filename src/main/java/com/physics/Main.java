package com.physics;

public class Main {
    public static void main(String args[]) {

        int[] pos = { 0,  0};
        int[] vel = { 0,  10};
        int[] acc = { 0,  -10};

        physicsObject ball = new physicsObject(pos, vel, acc);


        System.out.println(ball.getAcceleration()[0]);
        System.out.println(ball.getVelocity());
        System.out.println(ball.getPosition());

    }
}