//JAVA Assigments 4 for CMS-A CC-5 2024 (OOP with Java) by https://www.github.com/lazy-coder-03 (Sayantan Ghosh, Roll 335)

// A class called MyPoint, which models a 2D point with x and y coordinates. It contains: 
// • Two instance variables x (int) and y (int). 
// • A default (or "no-argument" or "no-arg") constructor that construct a point at the default location 
// of (0, 0). 
// • A overloaded constructor that constructs a point with the given x and y coordinates. 
// • A method setXY() to set both x and y. 
// • A method getXY() which returns the x and y in a 2-element int array. 
// • A toString() method that returns a string description of the instance in the format "(x, y)". 
// • A method called distance(int x, int y) that returns the distance from this point to other point at the 
// given (x, y) coordinates, Write the MyPoint class. Also write a test driver (called TestMyPoint) to test 
// all the public methods defined in the class. 

package assignment04;

public class MyPoint {
    private int x;
    private int y;

    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(int x, int y) {
        this.setXY(x, y);
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int[] getXY() {
        int[] arr = { this.x, this.y };
        return arr;
    }

    public double distance(int x, int y) {
        return Math.sqrt(Math.pow((this.x - x), 2) + Math.pow((this.y - y), 2));
    }
    //not needed for assignment but added for fun
    
    // public double distance(MyPoint other) {
    //     return Math.sqrt(Math.pow((this.x - other.x), 2) + Math.pow((this.y - other.y), 2));
    // }

    // public double distance() {
    //     return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    // }

    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }
    
}
