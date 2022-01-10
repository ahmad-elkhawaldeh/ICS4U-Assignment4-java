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
final class Triangle {
    /**
    * Length A.
    */
    private static double sideALen;
    /**
    * Length B.
    */
    private static double sideBLen;
    /**
    * Length C.
    */
    private static double sideCLen;

    /**
    * This is the constructor.
    *
    * @param len1 the inputted length A
    * @param len2 the inputted length B
    * @param len3 the inputted length C
    */
    final Triangle(final double len1, final double len2, final double len3) {
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
        final double len1 = this.sideALen;
        final double len2 = this.sideBLen;
        final double len3 = this.sideCLen;
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
        final double semiPer = this.getSemiPerimeter();
        final double aSide = this.sideALen;
        final double bSide = this.sideBLen;
        final double cSide = this.sideCLen;

        // using Heron's formula to compute the area of the circle
        return (Math.sqrt(semiPer * (semiPer - aSide) * (semiPer - bSide)
            * (semiPer - cSide)));
    }

    /**
    * Gets the Angle A.
    *
    * @return returns Angle A
    */
    public double getAngleA() {
        final double aSide = this.sideALen;
        final double bSide = this.sideBLen;
        final double cSide = this.sideCLen;
        // using law of cosines to compute the angle of the triangle
        return (oneEighty / Math.PI) * Math.acos(((bSide * bSide)
            + (cSide * cSide) - (aSide * aSide)) / (2 * bSide * cSide));
    }

    /**
    * Gets the Angle B.
    *
    * @return returns Angle B
    */
    public double getAngleB() {
        final double aSide = this.sideALen;
        final double bSide = this.sideBLen;
        final double cSide = this.sideCLen;

        // using law of cosines to compute the angle of the triangle
        return (oneEighty / Math.PI) * Math.acos(((cSide * cSide)
                + (aSide * aSide) - (bSide * bSide)) / (2 * cSide * aSide));
    }

    /**
    * Gets the Angle C.
    *
    * @return returns Angle C
    */
    public double getAngleC() {
        final double aSide = this.sideALen;
        final double bSide = this.sideBLen;
        final double cSide = this.sideCLen;

        // using law of cosines to compute the angle of the triangle
        return (oneEighty / Math.PI) * Math.acos(((aSide * aSide)
                + (bSide * bSide) - (cSide * cSide)) / (2 * aSide * bSide));
    }

    /**
    * Gets the name.
    *
    * @return returns the name
    */
    public String getName() {
        final double aSide = this.sideALen;
        final double bSide = this.sideBLen;
        final double cSide = this.sideCLen;

        final double aSide = this.getAngleA();
        bSide = this.getAngleB();
        final double cSide = this.getAngleC();

        String name = "";

        // if all angles are smaller than 90 degrees then
        // the triangle is acute triangle
        if (aSide < ninetyDegrees && bSide < ninetyDegrees
             && cSide < ninetyDegrees) {
            name += "Acute ";
        // if one of the angles is 90 degrees, then
        // the triangle is right triangle
        } else if (aSide == ninetyDegrees || bSide == ninetyDegrees
             || cSide == ninetyDegrees) {
            name += "Right ";
        // if one angle is greater than 90 degrees then
        // the triangle is obtuse triangle
        } else if (aSide > ninetyDegrees || bSide > ninetyDegrees
             || cSide > ninetyDegrees) {
            name += "Obtuse ";
        }
        // if all the sides of the triangle are equal
        // then the triangle is Equilateral
        if (aSide == bSide && bSide == cSide) {
            name += "Equilateral";
        // if only two sides of the triangle are
        // equal, then the triangle is Isoceles
        } else if (aSide == bSide || bSide == cSide || cSide == aSide) {
            name += "Isoceles";
        // if none of the sides are equal to each other,
        // then the triangle is Scalene
        } else if (aSide != bSide && bSide != cSide && cSide != aSide) {
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
