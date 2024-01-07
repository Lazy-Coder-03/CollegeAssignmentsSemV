//JAVA Assigments 10 for CMS-A CC-5 2024 (OOP with Java) by www.github.com/lazy-coder-03 (Sayantan Ghosh, Roll 335)

/*Write a Java program to remove a specific element from an array.  */
package assignment10;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element of Index " + (i) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Array before removing the element: " + Arrays.toString(arr));
        System.out.print("Enter the element you want to remove: ");
        int element = sc.nextInt();

        int[] newArr = removeElement(arr, element);
        System.out.println("Array after removing the element: " + Arrays.toString(newArr));
        sc.close();
    }

    public static int[] removeElement(int[] arr, int element) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            return arr; // Element not found, return the original array
        }

        int[] newArr = new int[arr.length - 1];
        int newIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i != index) {
                newArr[newIndex] = arr[i];
                newIndex++;
            }
        }

        return newArr;
    }

}

/*
 * Enter the size of the array: 10
 * Enter the elements of the array:
 * Enter element of Index 0: 5
 * Enter element of Index 1: 8
 * Enter element of Index 2: 9
 * Enter element of Index 3: 1
 * Enter element of Index 4: 2
 * Enter element of Index 5: 7
 * Enter element of Index 6: 3
 * Enter element of Index 7: 6
 * Enter element of Index 8: 4
 * Enter element of Index 9: 0
 * Array before removing the element: [5, 8, 9, 1, 2, 7, 3, 6, 4, 0]
 * Enter the element you want to remove: 4
 * Array after removing the element: [5, 8, 9, 1, 2, 7, 3, 6, 0]
 */