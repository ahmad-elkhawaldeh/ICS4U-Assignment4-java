/*
* This program is the main
*
* @author  Ahmad El-khawaldeh
* @version 1.0
* @since   2021-12-28
*/

import java.util.Scanner;

/**
* This program uses a custom class.
*/
public class Main {

    /**
    * This is the main function.
    *
    * @param args this will not be used
    */
    public static void main(String[] final args) {
        try {
            final Scanner input = new Scanner(System.in);
            // asking user to input values for sideA,
            // sideB and sideC
            System.out.println("Side A:");
            final double sideA = input.nextDouble();
            System.out.println("\nSide B:");
            final double sideB = input.nextDouble();
            System.out.println("\nSide C:");
            final double sideC = input.nextDouble();

            final Triangle tR = new Triangle(sideA, sideB, sideC);
            // calling GetArea()
            System.out.println("The area is: " + tR.getArea());
            // calling GetAngleA()
            System.out.println("Angle A is: " + tR.getAngleA());
            // calling GetAngleB()
            System.out.println("Angle B is: " + tR.getAngleB());
            // calling GetAngleC()
            System.out.println("Angle C is: " + tR.getAngleC());
            // calling GetName()
            System.out.println("The name is: " + tR.getName());
            // calling GetPerimeter()
            System.out.println("The perimeter is: " + tR.getPerimeter());
        } catch (Exception IllegalStateException) {
            System.out.println();
            System.out.println("ERROR: Invalid Input");
        }
    }
}
