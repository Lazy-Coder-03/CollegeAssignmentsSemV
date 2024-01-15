//JAVA Assigments 11 for CMS-A CC-5 2024 (OOP with Java) by www.github.com/lazy-coder-03 (Sayantan Ghosh, Roll 335)

// Write a Java program to insert an element (specific position) into an array.

package assignment11;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter the size of the array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<size; i++){
            System.out.print("Enter the element at index "+i+": ");
            array[i] = sc.nextInt();
        }
        System.out.println("The array is: ");
        printArray(array);
        System.out.print("Enter the element to be inserted: ");
        int element = sc.nextInt();
        System.out.print("Enter the position at which the element is to be inserted: ");
        int pos = sc.nextInt();
        sc.close();
        array = insertElement(array, element, pos);
        System.out.println("The new array is: ");
        printArray(array);

    }

    static int[] insertElement(int[] array, int element, int pos){
        int[] newArray = new int[array.length+1];
        for(int i=0; i<pos; i++){
            newArray[i] = array[i];
        }
        newArray[pos] = element;
        for(int i=pos+1; i<newArray.length; i++){
            newArray[i] = array[i-1];
        }
        return newArray;
    }

    static void printArray(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    
}

// Output:
// Enter the size of the array: 5
// Enter the elements of the array: 
// Enter the element at index 0: 1
// Enter the element at index 1: 2
// Enter the element at index 2: 4
// Enter the element at index 3: 5  
// Enter the element at index 4: 6
// The array is: 
// 1 2 4 5 6
// Enter the element to be inserted: 3
// Enter the position at which the element is to be inserted: 2
// The new array is: 
// 1 2 3 4 5 6