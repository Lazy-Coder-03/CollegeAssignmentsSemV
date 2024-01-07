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

package assignment5;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("Sayantan", "Chandannagar");
        System.out.println(p);

        Person p1 = new Person("Samaita", "Chandannagar");
        System.out.println(p1);

        Student s = new Student("Shreya", "Kolkata", "B.Tech", "2024", 500000);
        System.out.println(s);

        Staff st = new Staff("Mehuli", "Kolkata", "IIT Kharagpur", 100000);
        System.out.println(st);

    }
}

// Output:
/*
Person[Name=Sayantan, Address=Chandannagar]
Person[Name=Samaita, Address=Chandannagar]
Person[Name=Shreya, Adress=Kolkata, Program=B.Tech, Year=2024, Fees=500000.0]
Person[Name=Mehuli, Adress=Kolkata, School=IIT Kharagpur, Pay=100000.0]
 */
