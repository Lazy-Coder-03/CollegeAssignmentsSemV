//JAVA Assigments 21 for CMS-A CC-5 2024 (OOP with Java) by https://https://www.github.com/lazy-coder-03 (Sayantan Ghosh, Roll 335)


// Write a program to create your own exception as NegativeSizeException whenever negative values 
// are put in an array.


package assignment21b;

public class NegativeSizeException extends Exception{
    NegativeSizeException(String s){
        super(s);
    }
       
}
