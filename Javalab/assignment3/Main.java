//JAVA Assigments 3 for CMS-A CC-5 2024 (OOP with Java) by www.github.com/lazy-coder-03 (Sayantan Ghosh, Roll 335)

// write a program to accept a string from the user and remove all the consonants from the string and print the string without consonants.

package assignment3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        System.out.println("The string after removing consonants: " + removeConsonants(str));
        sc.close();
    }
    //using the method toCharArray() of String class
    public static String removeConsonants(String str) {
        String vowels = "aeiouAEIOU";
        char[] strArr = str.toCharArray();
        String newStr = "";
        for (int i = 0; i < strArr.length; i++) {
            if (vowels.indexOf(strArr[i]) != -1) { // check if the character is a vowel
                newStr += strArr[i];
            }
        }
        return newStr;
    }

    // using the method replaceAll() of String class
    /*
     * public static String removeConsonants(String str) {
     * return str.replaceAll("[^aeiouAEIOU]", "");
     * }
     */
}
