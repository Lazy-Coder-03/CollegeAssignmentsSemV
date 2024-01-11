//JAVA Assigments 6 for CMS-A CC-5 2024 (OOP with Java) by www.github.com/lazy-coder-03 (Sayantan Ghosh, Roll 335)

// Create a base class ‘Square’ having instance variable side:double. Initiate variable using constructor, 
// a method ‘getVolume() : double’ that calculates volume and print it. Create a derived class ‘Cylinder’ 
// having  instance variable height:double. Initiate variables of both classes through constructor, 
// override method ‘getVolume() : double’ to calculate volume of cylinder taking ‘side’ variable of base 
// class as ‘radius’ and print it. 

package assignment06;

public class Cube {
    protected double side;

    public Cube() {
        this.side = 0.0;
    }

    public Cube(double side) {
        this.side = side;
    }

    public double getVolume() {
        return this.side * this.side * this.side;
    }

    // public static void main(String[] args) {
    //     Square s = new Square(10);
    //     System.out.println(s.getVolume());
    // }

}
