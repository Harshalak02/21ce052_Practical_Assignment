package Handwritten_Assignment;

// Design a class named Triangle that extends GeometricObject.
//  The class contains: Three double data fields named side1, side2, and side3
// with default values 1.0 to denote three sides of a triangle.
//  A no-arg constructor that creates a default triangle.
//  A constructor that creates a triangle with the specified side1, side2, and side3.
//  The accessor methods for all three data fields.
//  A method named getArea() that returns the area of this triangle.
//  A method named getPerimeter() that returns the perimeter of this triangle.
//  A method named toString() that returns a string description for the triangle.
// return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " +
// side3.
// import java.util.*;
class GeometricObject {
    double s1 = 1, s2 = 1, s3 = 1;
    double Perimeter = 1 + 2 + 3;
    double P = Perimeter / 2.00;

    double Area = Math.sqrt(P * (P - s1) * (P - s2) * (P - s3));

}

class Triangle extends GeometricObject {

    Triangle() {
        System.out.println("The Default Triangle : ");
        System.out.println("Side1 : " + s1);
        System.out.println("Side2 : " + s2);
        System.out.println("Side3 : " + s3);
        System.out.println("Area of Triange Is : " + Area);
        System.out.println("Perimeter of Triange Is : " + Perimeter);
    }

    // Accessor
    public void setside1(double s1) {
        this.s1 = s1;
    }

    public double getside1() {
        return s1;
    }

    public void setside2(double s2) {
        this.s2 = s2;
    }

    public double getside2() {
        return s2;
    }

    public void setside3(double s3) {
        this.s3 = s3;
    }

    public double getside3() {
        return s3;
    }

    public void getArea(double Area) {
        this.Area = Area;
    }

    public double setArea() {
        return Area;
    }

    public void getPerimeter(double Perimeter) {
        this.Perimeter = Perimeter;
    }

    public double setPerimeter() {
        return Perimeter;
    }

    void tostring() {
        System.out.println("The Triangle Having 3 Sides : ");
        System.out.println("Side1 : " + s1);
        System.out.println("Side2 : " + s2);
        System.out.println("Side3 : " + s3);
        System.out.println("Area of Triange Is : " + Area);
        System.out.println("Perimeter of Triange Is : " + Perimeter);
    }

    Triangle(double a, double b, double c) {
        s1 = a;
        s2 = b;
        s3 = c;
        double Perimeter = (a + b + c);
        double P = Perimeter / 2.00;
        double Area = Math.sqrt(P * (P - a) * (P - b) * (P - c));
        System.out.println("The Specific Triangle : ");
        System.out.println("The Triangle Having 3 Sides : ");
        System.out.println("Side1 : " + a);
        System.out.println("Side2 : " + b);
        System.out.println("Side3 : " + c);
        System.out.println("Area of Triange Is : " + Area);
        System.out.println("Perimeter of Triange Is : " + Perimeter);
    }

}

class pr6 extends Triangle {
    public static void main(String[] args) {
        new Triangle();
        new Triangle(15, 20, 25);

    }
}
