//JAVA Assigments 7 for CMS-A CC-5 2024 (OOP with Java) by www.github.com/lazy-coder-03 (Sayantan Ghosh, Roll 335)

/*Consider you are designing vehicles engine with ‘speed:int, gear:int’. you can define your engine 
functionalities ‘speedUp(value)’ and ‘changeGear(value) in an interface. The class which is 
implementing the interface should implement all the methods in the interface. */

package assignment07;

public class Main {
    public static void main(String[] args) {
        Vehicle v = new Vehicle(10, 2);
        System.out.println(v);
        v.speedUp(24);
        v.changeGear(3);
        System.out.println("After speedUp(24) and changeGear(3)");
        System.out.println(v);
    }
}
/*
 * Vehicle: Speed: 10 Gear: 2
 * After speedUp(24) and changeGear(3)
 * Vehicle: Speed: 34 Gear: 3
 */