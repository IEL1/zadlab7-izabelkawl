/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl7;

import java.util.Random;

/**
 *
 * @author Izabela
 */
public class Punkt3d extends Punkt2d {

    public double z;

    public Punkt3d() {
        x = 0;
        y = 0;
    }
    public Punkt3d(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public void random() {
        Random losowe = new Random();
        x = (-10) + (10 - (-10)) * losowe.nextDouble();
        y = (-10) + (10 - (-10)) * losowe.nextDouble();
        z = (-10) + (10 - (-10)) * losowe.nextDouble();
    }

    @Override
    public String toString() {

        return "X: " + Double.toString(x) + " Y: " + Double.toString(y) + " Z: " + Double.toString(z);
    }

}
