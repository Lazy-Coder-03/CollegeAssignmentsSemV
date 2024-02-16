//JAVA Assigments 8 for CMS-A CC-5 2024 (OOP with Java) by www.github.com/lazy-coder-03 (Sayantan Ghosh, Roll 335)

// Write a program in java that handles both ‘ArrayIndexOutOfBoundsException’ and 
// ‘ArithmeticException’.

package notReq.assignment08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the index of the element you want to access: ");
        int index = sc.nextInt();
        try {
            System.out.println("The element at index " + index + " is " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The index you entered is invalid.");
        }
        System.out.print("Enter the number you want to divide the element at index " + index + " with: ");
        int divisor = sc.nextInt();
        try {
            System.out.println("The result of the division is " + arr[index] / divisor);
        } catch (ArithmeticException e) {
            System.out.println("The divisor you entered is invalid.");
        } finally {
            System.out.println("The work is done.");
            sc.close();
        }

    }

}

/*
 * Enter the size of the array: 6
 * Enter the elements of the array:
 * Enter element 1: 1
 * Enter element 2: 2
 * Enter element 3: 3
 * Enter element 4: 6
 * Enter element 5: 5
 * Enter element 6: 4
 * Enter the index of the element you want to access: 3
 * The element at index 3 is 6
 * Enter the number you want to divide the element at index 3 with: 0
 * The divisor you entered is invalid.
 * The work is done.
 */