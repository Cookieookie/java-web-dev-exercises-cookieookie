package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

import static java.lang.Double.isNaN;

public class Area {
    public static void main(String[] args) {
        double radius;
        double area;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a radius:");
        radius = input.nextDouble();
        input.close(); // this closes the scanner or input source
//        area = 3.14 * radius * radius;
        area = Circle.getArea(radius);

        // bonus mission 1
        if (radius < 0) {
            System.err.println("That is a negative number. Please try again.");
        } else if (Double.toString(radius) == null) {
            System.err.println("This is not a number. Please try again.");
        } else {
                System.out.println("The area of a circle of radius " + radius + " is: " + area);
            }
        }
    }
