



public class Triangle {
    // declared private data member for side lengths
    // of the triangle
    private double sideALen;
    private double sideBLen;
    private double sideCLen;

    // defined constructor for the Triangle class
    public Triangle(double len1, double len2, double len3) {
        this.sideALen = len1;
        this.sideBLen = len2;
        this.sideCLen = len3;

        // checking if the triangle is a valid triangle or not.
        if (!this.isTriangleValid()) {
            System.out.println("Triangle is not valid");
        }
    }

    // defined a protected member function
    // it checks whether the triangle entered by
    // user is a valid triangle or not.
    protected boolean isTriangleValid() {
        double len1 = this.sideALen;
        double len2 = this.sideBLen;
        double len3 = this.sideCLen;

        // if sum of any two sides is smaller than the third side then the triangle is not valid.
        // otherwise it is a valid triangle
        if (((len1 + len2) <= len3) || ((len2 + len3) <= len1) || ((len3 + len1) <= len2)) {
            return false;
        }
        return true;
    }

    // this function returns the semi perimeter of the triangle
    public double getSemiPerimeter() {
        return 0.5 * this.getPerimeter();
    }

    // this function returns the area of the triangle
    public double getArea() {
        double sp = this.getSemiPerimeter();
        double a = this.sideALen;
        double b = this.sideBLen;
        double c = this.sideCLen;

        // using Heron's formula to compute the area of the circle
        return (Math.sqrt(sp * (sp - a) * (sp - b) * (sp - c)));
    }

    // this function computes the angle A of the triangle
    public double getAngleA() {
        double a = this.sideALen;
        double b = this.sideBLen;
        double c = this.sideCLen;
        // using law of cosines to compute the angle of the triangle
        return (180.0 / Math.PI) * Math.acos(((b * b) + (c * c) - (a * a)) / (2 * b * c));
    }

    // this function computes the angle B of the triangle
    public double getAngleB() {
        double a = this.sideALen;
        double b = this.sideBLen;
        double c = this.sideCLen;

        // using law of cosines to compute the angle of the triangle
        return (180.0 / Math.PI) * Math.acos(((c * c) + (a * a) - (b * b)) / (2 * c * a));
    }

    // this function computes the angle C of the triangle
    public double getAngleC() {
        double a = this.sideALen;
        double b = this.sideBLen;
        double c = this.sideCLen;

        // using law of cosines to compute the angle of the triangle
        return (180.0 / Math.PI) * Math.acos(((a * a) + (b * b) - (c * c)) / (2 * a * b));
    }

    // this function returns the name of the triangle
    public String getName() {
        double a = this.sideALen;
        double b = this.sideBLen;
        double c = this.sideCLen;

        double A = this.getAngleA();
        double B = this.getAngleB();
        double C = this.getAngleC();

        String name = "";

        // if all angles are smaller than 90 degrees then
        // the triangle is acute triangle
        if (A < 90 && B < 90 && C < 90) {
            name += "Acute ";
        }

        // if one of the angles is 90 degrees, then
        // the triangle is right triangle
        else if (A == 90 || B == 90 || C == 90) {
            name += "Right ";
        }

        // if one angle is greater than 90 degrees then
        // the triangle is obtuse triangle
        else if (A > 90 || B > 90 || C > 90) {
            name += "Obtuse ";
        }

        // if all the sides of the triangle are equal
        // then the triangle is Equilateral
        if (a == b && b == c) {
            name += "Equilateral";
        }

        // if only two sides of the triangle are
        // equal, then the triangle is Isoceles
        else if (a == b || b == c || c == a) {
            name += "Isoceles";
        }

        // if none of the sides are equal to each other,
        // then the triangle is Scalene
        else if (a != b && b != c && c != a) {
            name += "Scalene";
        }

        // return name of the triangle
        return name;
    }

    // this function returns the perimeter of the triangle
    public double getPerimeter() {
        return this.sideALen + this.sideBLen + this.sideCLen;
    }
}
