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
final class Main {

    /**
    * This is the main function.
    *
    * @param args this will not be used
    */
    public static void main(String[] final args) {
        try {
            Scanner input = new Scanner(System.in);
            // asking user to input values for sideA,
            // sideB and sideC
            System.out.println("Side A:");
            double sideA = input.nextDouble();
            System.out.println("\nSide B:");
            double sideB = input.nextDouble();
            System.out.println("\nSide C:");
            double sideC = input.nextDouble();

            Triangle tr = new Triangle(sideA, sideB, sideC);
            // calling GetArea()
            System.out.println("The area is: " + tr.getArea());
            // calling GetAngleA()
            System.out.println("Angle A is: " + tr.getAngleA());
            // calling GetAngleB()
            System.out.println("Angle B is: " +  tr.getAngleB());
            // calling GetAngleC()
            System.out.println("Angle C is: " + tr.getAngleC());
            // calling GetName()
            System.out.println("The name is: " + tr.getName());
            // calling GetPerimeter()
            System.out.println("The perimeter is: " + tr.getPerimeter());
        } catch (Exception e) {
            System.out.println();
            System.out.println("ERROR: Invalid Input");
        }
    }
}
