//JAVA Assigments 22 for CMS-A CC-5 2024 (OOP with Java) by www.github.com/lazy-coder-03 (Sayantan Ghosh, Roll 335)


// Create a class Student with following operations  
// a) create parameterized constructor to initialize the objects. 
// b) create a function isEqual() to check whether the two objects are equal or not which returns the 
// Boolean value and gets two objects. 
// c) print the result in main method if objects are equals or not (take variables as your assumption)


package assignment22;

public class Student {
    private String name;
    private int roll;

    Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    String getName() {
        return this.name;
    }

    int getRoll() {
        return this.roll;
    }

    public String toString() {
        return "Name: " + this.name + ", Roll: " + this.roll;
    }

    boolean isEquals(Student s) {
        this.name = this.name.toLowerCase();
        s.name = s.name.toLowerCase();
        this.name = this.name.trim();
        s.name = s.name.trim();
        this.name = this.name.replaceAll("\\s+", " ");
        s.name = s.name.replaceAll("\\s+", " ");
        return (this.name.equals(s.name) && this.roll == s.roll) ? true : false;//use of ternary operator to return boolean value directly without using if-else block 
    }
}
