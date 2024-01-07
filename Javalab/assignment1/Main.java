//JAVA Assigments 1 for CMS-A CC-5 2024 (OOP with Java) by www.github.com/lazy-coder-03 (Sayantan Ghosh, Roll 335)

// Write a program to sort the first half of the array in ascending order and the second half of the array in descending order.

package assignment1;
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
        sc.close();
        int[] sortedArr = HalfSort.halfSort(arr);
        System.out.println("The sorted array where half elements are acsending and half are decending: ");
        for (int i = 0; i < n; i++) {
            System.out.print(sortedArr[i] + " ");
        }
    }
    
}

// Path: assignment1/HalfSort.java
// Compare this snippet from assignment1/Main.java:

//output1:
// Enter the size of the array: 6
// Enter the elements of the array:
// Enter element 1: 1
// Enter element 2: 2
// Enter element 3: 3
// Enter element 4: 4
// Enter element 5: 5
// Enter element 6: 6
// The sorted array where half elements are acsending and half are decending:
// 1 2 3 6 5 4

// output2:
// Enter the elements of the array: 
// Enter element 1: 6
// Enter element 2: 1
// Enter element 3: 2
// Enter element 4: 5
// Enter element 5: 7
// Enter element 6: 3
// The sorted array where half elements are acsending and half are decending: 
// 1 2 6 7 5 3