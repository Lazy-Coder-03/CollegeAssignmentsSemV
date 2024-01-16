//JAVA Assigments 18 for CMS-A CC-5 2024 (OOP with Java) by https://www.github.com/lazy-coder-03 (Sayantan Ghosh, Roll 335)

// Write a Java method to count all words in a string. 
// Test Data: 
// Input the string: The quick brown fox jumps over the lazy dog. 
//            Expected Output: 
// Number of words in the string: 9

package assignment18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // String str = "The quick brown fox jumps over the lazy dog.";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        str = str.trim();
        str = str.replaceAll("[^a-zA-Z0-9]", " ");// replace all non-alphanumeric characters with space not required in this case but still doing it
        String[] words = str.split("\\s+");
        System.out.print("Input the string after removing white spaces: ");
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i]+" ");
        }
        System.out.println();
        System.out.println("Number of words in the string: " + words.length);
        sc.close();
    }
}
//output
// Enter the string: The quick brown fox jumps over the lazy dog.
// Input the string: The quick brown fox jumps over the lazy dog.
// The quick brown fox jumps over the lazy dog. Number of words in the string: 9