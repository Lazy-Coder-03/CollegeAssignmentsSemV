//JAVA Assigments 23 for CMS-A CC-5 2024 (OOP with Java) by https://www.github.com/lazy-coder-03 (Sayantan Ghosh, Roll 335)

// Create an abstract class employee, having its properties and abstract function for calculating net 
// salary and displaying the information. Derive manager and clerk class from this abstract class and 
// implement the abstract method net salary and override the display method.


package assignment23;

public class Main {
    public static void main(String[] args) {
        //sales dept
        Manager manager1 = new Manager("John", 101, 10000, "Sales");
        Clerk clerk1 = new Clerk("Jane", 102, 5500, "Sales");
        Clerk clerk2 = new Clerk("Jack", 103, 7000, "Sales");
        Clerk clerk3 = new Clerk("Jill", 104, 7500, "Sales");

        //marketing dept
        Manager manager2 = new Manager("James", 105, 10000, "Marketing");
        Clerk clerk4 = new Clerk("Jenny", 106, 6000, "Marketing");
        Clerk clerk5 = new Clerk("Jared", 107, 65000, "Marketing");
        Clerk clerk6 = new Clerk("Jasmine", 108, 8000, "Marketing");

        //finance dept
        Manager manager3 = new Manager("Jasper", 109, 10000, "Finance");
        Clerk clerk7 = new Clerk("Jade", 110, 9000, "Finance");
        Clerk clerk8 = new Clerk("Jasper", 111, 5500, "Finance");   




        Employee[] employees = {manager1, clerk1, clerk2, clerk3, manager2, clerk4, clerk5, clerk6, manager3, clerk7, clerk8};

        for (Employee employee : employees) {
            employee.calculateNetSalary();
            employee.display();
        }
    }
}
//output
// Manager of Department: Sales
// Name: John
// ID: 101
// Basic Salary: 10000.0
// Net Salary: 11500.0
// ----------------------------------------------------------------
// Clerk of Department: Sales
// Name: Jane
// ID: 102
// Basic Salary: 5500.0
// Net Salary: 6105.0
// ----------------------------------------------------------------
// Clerk of Department: Sales
// Name: Jack
// ID: 103
// Basic Salary: 7000.0
// Net Salary: 7770.0
// ----------------------------------------------------------------
// Clerk of Department: Sales
// Name: Jill
// ID: 104
// Basic Salary: 7500.0
// Net Salary: 8325.0
// ----------------------------------------------------------------
// Manager of Department: Marketing
// Name: James
// ID: 105
// Basic Salary: 10000.0
// Net Salary: 11500.0
// ----------------------------------------------------------------
// Clerk of Department: Marketing
// Name: Jenny
// ID: 106
// Basic Salary: 6000.0
// Net Salary: 6660.0
// ----------------------------------------------------------------
// Clerk of Department: Marketing
// Name: Jared
// ID: 107
// Basic Salary: 65000.0
// Net Salary: 72150.0
// ----------------------------------------------------------------
// Clerk of Department: Marketing
// Name: Jasmine
// ID: 108
// Basic Salary: 8000.0
// Net Salary: 8880.0
// ----------------------------------------------------------------
// Manager of Department: Finance
// Name: Jasper
// ID: 109
// Basic Salary: 10000.0
// Net Salary: 11500.0
// ----------------------------------------------------------------
// Clerk of Department: Finance
// Name: Jade
// ID: 110
// Basic Salary: 9000.0
// Net Salary: 9990.0
// ----------------------------------------------------------------
// Clerk of Department: Finance
// Name: Jasper
// ID: 111
// Basic Salary: 5500.0
// Net Salary: 6105.0
// ----------------------------------------------------------------
// Clerk of Department: Finance
// Name: Jasmine
// ID: 112
// Basic Salary: 6300.0
// Net Salary: 6993.0
// ----------------------------------------------------------------