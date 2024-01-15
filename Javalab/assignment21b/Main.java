//JAVA Assigments 21 for CMS-A CC-5 2024 (OOP with Java) by https://www.github.com/lazy-coder-03 (Sayantan Ghosh, Roll 335)


// Write a program to create your own exception as NegativeSizeException whenever negative values 
// are put in an array.


package assignment21b;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        try {
            if (n < 0) {
                throw new NegativeSizeException("Array size cannot be negative");
            }
            int[] arr = new int[n];
            System.out.println("Enter elements of array:");
            for (int i = 0; i < n; i++) {
                System.out.print("Enter element " + (i + 1) + ": ");
                arr[i] = sc.nextInt();
            }
            System.out.println("Array elements are:");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        } catch (NegativeSizeException e) {
            System.out.println(e);
        } finally {
            sc.close();
        }
               
    }

    
}
