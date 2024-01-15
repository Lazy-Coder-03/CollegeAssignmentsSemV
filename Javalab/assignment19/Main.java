//JAVA Assigments 19 for CMS-A CC-5 2024 (OOP with Java) by https://www.github.com/lazy-coder-03 (Sayantan Ghosh, Roll 335)

// 20.  Write a program in java with class Employee and do the following operations on it 
// a) Create two constructor default and with Object as parameter to initialize class variables. 
// b) Create a function Calculate which calculates the pf and allowances on the salary of employee and 
// return the all values as an object.

package assignment19;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of employees:");
        int n = sc.nextInt();
        Employee[] employees = new Employee[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details of employee " + (i + 1));
            System.out.print("Enter name: ");
            String name = sc.next();
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            System.out.print("Enter salary: ");
            double salary = sc.nextDouble();
            employees[i] = new Employee(name, id, salary);
            employees[i] = employees[i].calculate();
        }
        System.out.println("Employee Details");
        printEmpTable(employees);
        sc.close();
    }

    static void printEmpTable(Employee[] employees) {
        System.out.println("ID\tName\t\tSalary\t\tPF\t\tAllowance\tTotal Salary");
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }
}

//OUTPUT
// Enter number of employees:5
// Enter details of employee 1
// Enter name: Ram
// Enter ID: 01
// Enter salary: 12000
// Enter details of employee 2
// Enter name: Shyam
// Enter ID: 02
// Enter salary: 14000
// Enter details of employee 3
// Enter name: Ajay
// Enter ID: 03
// Enter salary: 17000
// Enter details of employee 4
// Enter name: Bijoy
// Enter ID: 4 
// Enter salary: 13000
// Enter details of employee 5
// Enter name: Sujai  
// Enter ID: 05
// Enter salary: 25000 
// Employee Details
// ID      Name            Salary          PF              Allowance       Total Salary
// 1       Ram             12000.0         1440.0          4800.0          15360.0
// 2       Shyam           14000.0         1680.0          5600.0          17920.0
// 3       Ajay            17000.0         2040.0          6800.0          21760.0
// 4       Bijoy           13000.0         1560.0          5200.0          16640.0
// 5       Sujai           25000.0         3000.0          10000.0         32000.0