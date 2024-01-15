//JAVA Assigments 7 for CMS-A CC-5 2024 (OOP with Java) by https://www.github.com/lazy-coder-03 (Sayantan Ghosh, Roll 335)

/*Consider you are designing vehicles engine with ‘speed:int, gear:int’. you can define your engine 
functionalities ‘speedUp(value)’ and ‘changeGear(value) in an interface. The class which is 
implementing the interface should implement all the methods in the interface. */

package assignment07;

public class Vehicle implements Engine {
    private int speed;
    private int gear;

    public Vehicle() {
        this.speed = 0;
        this.gear = 0;
    }

    public Vehicle(int speed, int gear) {
        this.speed = speed;
        this.gear = gear;
    }

    public void speedUp(int speed) {
        this.speed += speed;
    }

    public void changeGear(int gear) {
        this.gear = gear;
    }

    public String toString() {
        return ("Vehicle: Speed: " + this.speed + " Gear: " + this.gear);
    }

    // public static void main(String[] args) {
    // Vehicle v = new Vehicle(10, 2);
    // v.print();
    // v.speedUp(10);
    // v.changeGear(3);
    // v.print();
    // }

}
