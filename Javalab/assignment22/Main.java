//JAVA Assigments 22 for CMS-A CC-5 2024 (OOP with Java) by https://www.github.com/lazy-coder-03 (Sayantan Ghosh, Roll 335)

// Create a class Student with following operations  
// a) create parameterized constructor to initialize the objects. 
// b) create a function isEqual() to check whether the two objects are equal or not which returns the 
// Boolean value and gets two objects. 
// c) print the result in main method if objects are equals or not (take variables as your assumption)

package assignment22;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("John", 101);
        Student student2 = new Student("Jane", 102);
        Student student3 = new Student("John", 101);

        System.out.println("Student 1: " + student1);
        System.out.println("Student 2: " + student2);
        System.out.println("Student 3: " + student3);

        System.out.println("Is Student 1 equal to Student 2: " + student1.isEquals(student2));
        System.out.println("Is Student 1 equal to Student 3: " + student1.isEquals(student3));

    }

}
// Output:
// Student 1: Name: John, Roll: 101
// Student 2: Name: Jane, Roll: 102
// Student 3: Name: John, Roll: 101
// Is Student 1 equal to Student 2: false
// Is Student 1 equal to Student 3: true