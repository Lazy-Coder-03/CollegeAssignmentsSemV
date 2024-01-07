//JAVA Assigments 5 for CMS-A CC-5 2024 (OOP with Java) by www.github.com/lazy-coder-03 (Sayantan Ghosh, Roll 335)

/*Create a superclass ‘Person’ and two subclasses ‘Student’ and ‘Staff’. The following are the instance 
variables and methods: 
    a. For ‘Person’ instance variables: name:String, address:String. Initiate variable through 
        constructor, incorporate one method setPerson() that updates Person variables , another 
        method tostring() that shows Person details as “Person[name=?,address=?”. 
    b. For ‘Student’ sub class instance variables: program:String, year:String, fees:double. Initiate 
        both ‘Student’ and ‘Person’ variables through constructor, incorporate one method 
        setStudent() that updates both student and ‘Person’ data, another method tostring() that shows 
        ‘Person-Student’ details as “Person[name=?,address=?,Program=?,Year=?,Fees=?”. 
    c. For ‘Staff’ subclass instance variables: school:String, pay:double. Initiate both ‘Staff’ and 
        ‘Person’ variables through constructor, incorporate one method setStaff() that updates both 
        ‘staff’ and ‘Person’ data, another method tostring() that shows ‘Person-Staff’ details as 
        “Person[name=?,address=?,School=?,Pays=?”. 

Write the classes and a test driver main class to test all functions mentioned above.  */

package assignment05;

public class Person {
    protected String name;
    protected String address;

    public Person() {
        this.name = "";
        this.address = "";
    }

    public Person(String name, String address) {
        this.setPerson(name, address);
    }

    public void setPerson(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String toString() {
        return "Person[Name=" + this.name + ", Address=" + this.address + "]";
    }

    // public static void main(String[] args) {
    //     Person p = new Person("Sayantan", "Kolkata");
    //     System.out.println(p);
    // }
}
