/*
* This program is the main
*
* @author  Ahmad El-khawaldeh
* @version 1.0
* @since   2021-12-28
*/


import java.util.Scanner;

public class Main {

    // main function
    public static void main(String[] args) {


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

            // created object of class Triangle and calling different member
            // functions
            Triangle T = new Triangle(sideA, sideB, sideC);
            // calling GetArea()
            System.out.println("The area is: " + T.getArea());

            // calling GetAngleA()
            System.out.println("Angle A is: " + T.getAngleA());

            // calling GetAngleB()
            System.out.println("Angle B is: " +  T.getAngleB());

            // calling GetAngleC()
            System.out.println("Angle C is: " + T.getAngleC());

            // calling GetName()
            System.out.println("The name is: " + T.getName());

            // calling GetPerimeter()
            System.out.println("The perimeter is: " + T.getPerimeter());
        catch (Exception e) {
            System.out.println();
            System.out.println("ERROR: Invalid Input");
        }
    }
}
