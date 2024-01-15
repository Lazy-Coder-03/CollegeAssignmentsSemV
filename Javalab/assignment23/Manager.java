//JAVA Assigments 23 for CMS-A CC-5 2024 (OOP with Java) by www.github.com/lazy-coder-03 (Sayantan Ghosh, Roll 335)

// Create an abstract class employee, having its properties and abstract function for calculating net 
// salary and displaying the information. Derive manager and clerk class from this abstract class and 
// implement the abstract method net salary and override the display method.

package assignment23;

public class Manager extends Employee {
    String department;


    Manager(String name, int id, double basicSalary, String department) {
        super(name, id, basicSalary);
        this.department = department;
    }

    void calculateNetSalary() {
        this.netSalary = this.basicSalary + (this.basicSalary * 0.1) + (this.basicSalary * 0.05);// 10% HRA and 5% DA
    }

    @Override
    void display() {
        System.out.println("Manager of Department: " + this.department);
        super.display();
    }

}
