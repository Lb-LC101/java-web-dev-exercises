package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;



public class Area {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        try {
             boolean loopAgain = true;
             while (loopAgain) {
                System.out.println("Please enter the radius of the circle: ");
                double radius = input.nextDouble();
                 if (radius < 0) {
                    System.out.println("Please enter a number greater than 0");
                } else {
                     double area = Circle.getArea(radius);
                     System.out.println("The area of a circle of radius " + radius + " is: " + area);
                     loopAgain = false;
               }
            }
        } catch (Exception error) {
          System.out.println("Numeric input required.");
        }
      input.close();
    }
}

