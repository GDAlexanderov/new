package com.company;

public class Tank {

    private static final String MODEL = "T34";
    private static int tankCount = 0;

    private int x, y;
    private int dir;
    private int fuel;
    private int tankNumber;

    public Tank() {
        this(0, 0, 100);
    }

    public Tank(int x, int y) {
        this(x, y, 100);
    }

    public Tank(int x, int y, int fuel) {
        this.x = x;
        this.y = y;
        this.fuel = fuel;
        this.tankNumber = ++tankCount;
    }

    public void goForward(int distance) {
        if (distance > fuel) {
            distance = fuel;
        } else if (distance < -fuel) {
            distance = -fuel;
        }
        fuel -= Math.abs(distance);

        if (dir == 0) {
            x += distance;
        } else if (dir == 1) {
            y += distance;
        } else if (dir == 2) {
            x -= distance;
        } else {
            y -= distance;
        }
    }

    public void printPosition() {
        System.out.println("The Tank " + MODEL + "-" + tankNumber + " is at " + x + ", " + y + " now.");
    }

    public void turnLeft() {
        dir--;
        if (dir == -1) dir = 3;
    }

    public void turnRight() {
        dir++;
        if (dir == 4) dir = 0;
    }

    public void goBackward(int distance) {
        goForward(-distance);
    }
}
