/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl7;

import java.util.Scanner;

/**
 *
 * @author Izabela
 */
public class test {
    Scanner scanner = new Scanner(System.in);
    private final double x;
    private final double y;
    private final double z;
    
    private final Punkt3d random3D;
    private final Punkt3d norandom3D;
    private final Punkt2d random2D;
    private final Punkt2d norandom2D;
    
    
    private final Punkt3d[] tab3 = new Punkt3d[100];
    private final Punkt2d[] tab2 = new Punkt2d[100];
            
    public test(){
        System.out.print("X: ");
        x = scanner.nextDouble();
        System.out.print("Y: ");
        y = scanner.nextDouble();
        System.out.print("Z: ");
        z = scanner.nextDouble();
        
        random2D = new Punkt2d();
        random2D.random();
        norandom2D = new Punkt2d(x,y);
        random3D = new Punkt3d();
        random3D.random();
        norandom3D = new Punkt3d(x,y,z);
    }
     public void test3d(){
        System.out.println("3D");
        System.out.println("Losowe współżędne:" + random3D.toString()+ " Współżędne podane przez użytkownika:" + norandom3D.toString());
    }
    
    public void test2d(){
        System.out.println("2D");
        System.out.println("Losowe współżędne:" + random2D.toString() +" Współżędne podane przez użytkownika:" +norandom2D.toString());
    }
    public void tab2(){
        for(int i=0; i<100;i++){
            tab2[i] = new Punkt2d();
            tab2[i].random();
        }
    }
    
    public void tab3(){
        for(int i=0; i<100;i++){
            tab3[i] = new Punkt3d();
            tab3[i].random();
        }
    }
    
    public void testy(){
        for (int i=0; i<100; i++){
            for (int j=0; j<100; j++){
                if((tab2[i].x == tab3[j].x) && (tab2[i].y == tab3[j].y))
                    System.out.println(i+1 + " punkt 2D ma wspolne wspolrzedne z " + j+1 + ". punktem 3D (" + tab2[i].toString() + ")");
            }
        }
    }

} 
