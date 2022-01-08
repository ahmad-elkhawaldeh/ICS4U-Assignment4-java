/*
* This is the class file
*
* @author  Ahmad El-khawaldeh
* @version 1.0
* @since   2022-1-5
*/


/**
* This is the class that contains many functions.
*/
public class Triangle {
    /**
    * Length A.
    */
    private static  double sideALen;
    /**
    * Length B.
    */
    private static double sideBLen;
    /**
    * Length \C.
    */
    private static double sideCLen;

    /**
    * This is the constructor.
    *
    * @param len1 the inputted length A
    * @param len2 the inputted length B
    * @param len3 the inputted length C
    */
    public Triangle(final double len1, final double len2, final double len3) {

        final int ninetyDegrees = 90;
        final int oneEighty = 180;
        final int half = 0.5;

        this.sideALen = len1;
        this.sideBLen = len2;
        this.sideCLen = len3;
        // checking if the triangle is a valid triangle or not.
        if (!this.isTriangleValid()) {
            System.out.println("Triangle is not valid");
        }
    }

    /**
    * Gets the Triangle.
    *
    * @return returns if its true
    */
    protected boolean isTriangleValid() {
        double len1 = this.sideALen;
        double len2 = this.sideBLen;
        double len3 = this.sideCLen;
        // if sum of any two sides is smaller than the
        // third side then the triangle is not valid
        // otherwise it is a valid triangle
        if (((len1 + len2) <= len3) || ((len2 + len3) <= len1)
             || ((len3 + len1) <= len2)) {
            return false;
        }
        return true;
    }

    /**
    * Gets the Perimeter.
    *
    * @return returns the Perimeter
    */
    public double getSemiPerimeter() {
        return half * this.getPerimeter();
    }

    /**
    * Gets the Area.
    *
    * @return returns the area
    */
    public double getArea() {
        double sp = this.getSemiPerimeter();
        double a = this.sideALen;
        double b = this.sideBLen;
        double c = this.sideCLen;

        // using Heron's formula to compute the area of the circle
        return (Math.sqrt(sp * (sp - a) * (sp - b) * (sp - c)));
    }

    /**
    * Gets the Angle A.
    *
    * @return returns Angle A
    */
    public double getAngleA() {
        double a = this.sideALen;
        double b = this.sideBLen;
        double c = this.sideCLen;
        // using law of cosines to compute the angle of the triangle
        return (oneEighty / Math.PI) * Math.acos(((b * b) + (c * c)
             - (a * a)) / (2 * b * c));
    }

    /**
    * Gets the Angle B.
    *
    * @return returns Angle B
    */
    public double getAngleB() {
        double a = this.sideALen;
        double b = this.sideBLen;
        double c = this.sideCLen;

        // using law of cosines to compute the angle of the triangle
        return (oneEighty / Math.PI) * Math.acos(((c * c) + (a * a)
             - (b * b)) / (2 * c * a));
    }

    /**
    * Gets the Angle C.
    *
    * @return returns Angle C
    */
    public double getAngleC() {
        double a = this.sideALen;
        double b = this.sideBLen;
        double c = this.sideCLen;

        // using law of cosines to compute the angle of the triangle
        return (oneEighty / Math.PI) * Math.acos(((a * a) + (b * b)
             - (c * c)) / (2 * a * b));
    }

    /**
    * Gets the name.
    *
    * @return returns the name
    */
    public String getName() {
        double a1 = this.sideALen;
        double b1 = this.sideBLen;
        double c1 = this.sideCLen;

        double a2 = this.getAngleA();
        double b2 = this.getAngleB();
        double c2 = this.getAngleC();

        String name = "";

        // if all angles are smaller than 90 degrees then
        // the triangle is acute triangle
        if (a2 < ninetyDegrees && b2 < ninetyDegrees && c2 < ninetyDegrees) {
            name += "Acute ";
        // if one of the angles is 90 degrees, then
        // the triangle is right triangle
        } else if (a2 == ninetyDegrees || b2 == ninetyDegrees
             || c2 == ninetyDegrees) {
            name += "Right ";
        // if one angle is greater than 90 degrees then
        // the triangle is obtuse triangle
        } else if (a2 > ninetyDegrees || b2 > ninetyDegrees
             || c2 > ninetyDegrees) {
            name += "Obtuse ";
        }
        // if all the sides of the triangle are equal
        // then the triangle is Equilateral
        if (a1 == b1 && b1 == c1) {
            name += "Equilateral";
        // if only two sides of the triangle are
        // equal, then the triangle is Isoceles
        } else if (a1 == b1 || b1 == c1 || c1 == a1) {
            name += "Isoceles";
        // if none of the sides are equal to each other,
        // then the triangle is Scalene
        } else if (a1 != b1 && b1 != c1 && c1 != a1) {
            name += "Scalene";
        }

        // return name of the triangle
        return name;
    }

    /**
    * Gets the Perimeter.
    *
    * @return returns the Perimeter
    */
    public double getPerimeter() {
        return this.sideALen + this.sideBLen + this.sideCLen;
    }
}
