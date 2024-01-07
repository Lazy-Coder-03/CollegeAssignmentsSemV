//JAVA Assigments 6 for CMS-A CC-5 2024 (OOP with Java) by www.github.com/lazy-coder-03 (Sayantan Ghosh, Roll 335)

// Create a base class ‘Square’ having instance variable side:double. Initiate variable using constructor, 
// a method ‘getVolume() : double’ that calculates volume and print it. Create a derived class ‘Cylinder’ 
// having  instance variable height:double. Initiate variables of both classes through constructor, 
// override method ‘getVolume() : double’ to calculate volume of cylinder taking ‘side’ variable of base 
// class as ‘radius’ and print it. 

package assignment6;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius of the Cylinder: ");
        double radius = sc.nextDouble();
        System.out.print("Enter the Height of the Cylinder: ");
        double height = sc.nextDouble();
        Cylinder c = new Cylinder(radius, height);
        System.out.println("Volume of Cylinder is :" + c.getVolume());
        System.out.print("Enter the Side of the Cube: ");
        double side = sc.nextDouble();
        Square s = new Square(side);
        System.out.println("Volume of Cube is :" + s.getVolume());
        sc.close();
    }
    
}
