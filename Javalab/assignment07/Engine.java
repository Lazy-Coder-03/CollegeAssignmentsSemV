//JAVA Assigments 7 for CMS-A CC-5 2024 (OOP with Java) by www.github.com/lazy-coder-03 (Sayantan Ghosh, Roll 335)

/*Consider you are designing vehicles engine with ‘speed:int, gear:int’. you can define your engine 
functionalities ‘speedUp(value)’ and ‘changeGear(value) in an interface. The class which is 
implementing the interface should implement all the methods in the interface. */

package assignment07;

public interface Engine {
    void speedUp(int speed);
    void changeGear(int gear);
}
