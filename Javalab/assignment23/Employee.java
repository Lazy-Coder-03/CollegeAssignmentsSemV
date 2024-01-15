//JAVA Assigments 23 for CMS-A CC-5 2024 (OOP with Java) by www.github.com/lazy-coder-03 (Sayantan Ghosh, Roll 335)

// Create an abstract class employee, having its properties and abstract function for calculating net 
// salary and displaying the information. Derive manager and clerk class from this abstract class and 
// implement the abstract method net salary and override the display method.


package assignment23;

public abstract class Employee {
    String name;
    int id;
    double basicSalary;
    double netSalary;

    Employee(String name, int id, double basicSalary) {
        this.name = name;
        this.id = id;
        this.basicSalary = basicSalary;
    }

    abstract void calculateNetSalary();

    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("ID: " + this.id);
        System.out.println("Basic Salary: " + this.basicSalary);
        System.out.println("Net Salary: " + this.netSalary);
        System.out.println("----------------------------------------------------------------");
    }

    
}
