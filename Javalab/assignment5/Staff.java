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
*/

package assignment5;

public class Staff extends Person{
    private String school;
    private double pay;

    public Staff() {
        this.school = "";
        this.pay = 0.0;
    }

    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.setStaff(school, pay);
    }

    public void setStaff(String school, double pay) {
        this.school = school;
        this.pay = pay;
    }

    public String toString() {
        return "Person[Name=" + super.name + ", Adress="+super.address + ", School=" + this.school
                + ", Pay=" + this.pay + "]";
    }

    // public static void main(String[] args) {
    //     Staff s = new Staff("Sayantan", "Kolkata", "IIT Kharagpur", 100000);
    //     System.out.println(s);
    // }

}
