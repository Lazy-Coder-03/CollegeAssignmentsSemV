//JAVA Assigments 23 for CMS-A CC-5 2024 (OOP with Java) by https://www.github.com/lazy-coder-03 (Sayantan Ghosh, Roll 335)

// Create an abstract class employee, having its properties and abstract function for calculating net 
// salary and displaying the information. Derive manager and clerk class from this abstract class and 
// implement the abstract method net salary and override the display method.

package assignment23;

public class Clerk extends Employee {

    String department;

    Clerk(String name, int id, double basicSalary, String department) {
        super(name, id, basicSalary);
        this.department = department;
    }

    void calculateNetSalary() {
        this.netSalary = this.basicSalary + (this.basicSalary * 0.08) + (this.basicSalary * 0.03);// 8% HRA and 3% DA
    }

    @Override
    void display() {
        System.out.println("Clerk of Department: " + this.department);
        super.display();
    }

}
