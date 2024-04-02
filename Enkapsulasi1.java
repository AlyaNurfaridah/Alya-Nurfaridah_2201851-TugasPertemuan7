/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.enkapsulasi1;

/**
 *
 * @author HP
 */
import java.util.Scanner;

public class Enkapsulasi1 {
    private double a, b, c, d, e, f;

    public double getA() { return a; }
    public double getB() { return b; }
    public double getC() { return c; }
    public double getD() { return d; }
    public double getE() { return e; }
    public double getF() { return f; }

    public boolean isSolvable() { return (a * d - b * c) != 0; }

    public double getX() { return (e * d - b * f) / (a * d - b * c); }
    public double getY() { return (a * f - e * c) / (a * d - b * c); }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan nilai a:");
        double a = scanner.nextDouble();
        System.out.println("Masukkan nilai b:");
        double b = scanner.nextDouble();
        System.out.println("Masukkan nilai c:");
        double c = scanner.nextDouble();
        System.out.println("Masukkan nilai d:");
        double d = scanner.nextDouble();
        System.out.println("Masukkan nilai e:");
        double e = scanner.nextDouble();
        System.out.println("Masukkan nilai f:");
        double f = scanner.nextDouble();

        Enkapsulasi1 equation = new Enkapsulasi1();
        equation.a = a;
        equation.b = b;
        equation.c = c;
        equation.d = d;
        equation.e = e;
        equation.f = f;

        if (equation.isSolvable()) {
            System.out.println("Solusi untuk sistem persamaan tersebut adalah:");
            System.out.println("x = " + equation.getX());
            System.out.println("y = " + equation.getY());
        } else {
            System.out.println("Persamaan tidak memiliki solusi.");
        }
    }
}

