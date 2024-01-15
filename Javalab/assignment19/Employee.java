//JAVA Assigments 19 for CMS-A CC-5 2024 (OOP with Java) by www.github.com/lazy-coder-03 (Sayantan Ghosh, Roll 335)


// 20.  Write a program in java with class Employee and do the following operations on it 
// a) Create two constructor default and with Object as parameter to initialize class variables. 
// b) Create a function Calculate which calculates the pf and allowances on the salary of employee and 
// return the all values as an object.


package assignment19;

public class Employee {
    private String ename;
    private int eid;
    private double salary;
    private double pf=0.0;
    private double allowance=0.0;
    private double totalSalary=0.0;

    Employee(){
        this.ename = "";
        this.eid = 0;
        this.salary = 0.0;
    }
    
    Employee(Employee emp){
        this.ename = emp.ename;
        this.eid = emp.eid;
        this.salary = emp.salary;
        this.pf = emp.pf;
        this.allowance = emp.allowance;
        this.totalSalary = emp.totalSalary;
    }

    Employee(String ename, int eid, double salary){
        this.ename = ename;
        this.eid = eid;
        this.salary = salary;
    }

    Employee calculate(){
        this.pf = this.salary * 0.12;
        this.allowance = this.salary * 0.4;
        this.totalSalary = this.salary + this.allowance - this.pf;
        return this;
    }
    
    @Override
    public String toString(){
        return this.eid+"\t"+this.ename+"\t\t"+this.salary+"\t\t"+this.pf+"\t\t"+this.allowance+"\t\t"+this.totalSalary;
    }




}
