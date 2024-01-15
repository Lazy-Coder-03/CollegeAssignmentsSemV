//JAVA Assigments 4 for CMS-A CC-5 2024 (OOP with Java) by https://www.github.com/lazy-coder-03 (Sayantan Ghosh, Roll 335)

// A class called MyPoint, which models a 2D point with x and y coordinates. It contains: 
// • Two instance variables x (int) and y (int). 
// • A default (or "no-argument" or "no-arg") constructor that construct a point at the default location 
// of (0, 0). 
// • A overloaded constructor that constructs a point with the given x and y coordinates. 
// • A method setXY() to set both x and y. 
// • A method getXY() which returns the x and y in a 2-element int array. 
// • A toString() method that returns a string description of the instance in the format "(x, y)". 
// • A method called distance(int x, int y) that returns the distance from this point to another point at the 
// given (x, y) coordinates, Write the MyPoint class. Also write a test driver (called TestMyPoint) to test 
// all the public methods defined in the class. 


package assignment04;

public class TestMyPoint {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint();
        System.out.println("p1: " + p1);
        p1.setXY(3, 4);
        System.out.println("p1: " + p1);
        //System.out.printf("Distance of p1 from (5,6) : %.2f\n", p1.distance(5, 6));
        System.out.println("Distance of p1 from (5,6) : " + p1.distance(5, 6));
        MyPoint p2 = new MyPoint(8, 6);
        System.out.println("p2: " + p2);
        System.out.println("Distance of p2 from point (2,3) : " + p2.distance(2, 3));
        System.out.println("Distance of P2 from origin (0,0) : " + p2.distance(0, 0));
    }

}

// output:

// p1: (0, 0)
// p1: (3, 4)
// Distance of p1 from (5,6) : 2.8284271247461903
// p2: (8, 6)
// Distance of p2 from point (2,3) : 6.708203932499369
// Distance of P2 from origin (0,0) : 10.0

