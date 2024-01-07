//JAVA Assigments 6 for CMS-A CC-5 2024 (OOP with Java) by www.github.com/lazy-coder-03 (Sayantan Ghosh, Roll 335)

// Create a base class ‘Square’ having instance variable side:double. Initiate variable using constructor, 
// a method ‘getVolume() : double’ that calculates volume and print it. Create a derived class ‘Cylinder’ 
// having  instance variable height:double. Initiate variables of both classes through constructor, 
// override method ‘getVolume() : double’ to calculate volume of cylinder taking ‘side’ variable of base 
// class as ‘radius’ and print it. 


package assignment6;

public class Cylinder extends Square {
    private double height;

    public Cylinder() {
        super();
        this.height = 0.0;
    }

    public Cylinder(double side, double height) {
        super(side);
        this.height = height;
    }

    public double getVolume() {
        return super.side*super.side * this.height * Math.PI;
    }

    // public static void main(String[] args) {
    //     Cylinder c = new Cylinder(10, 10);
    //     System.out.println(c.getVolume());
    // }

    
}
