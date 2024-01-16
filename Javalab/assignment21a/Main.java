//JAVA Assigments 21 for CMS-A CC-5 2024 (OOP with Java) by https://www.github.com/lazy-coder-03 (Sayantan Ghosh, Roll 335)

// Write a program to create your own exception as NegativeSizeException whenever negative values 
// are put in an array.

package assignment21a;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter size of array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter elements of array:");
            for (int i = 0; i < n; i++) {
                System.out.print("Enter element " + (i + 1) + ": ");
                arr[i] = sc.nextInt();
                if (arr[i] < 0) {
                    throw new NegativeSizeException("Array elements cannot be negative");
                }
            }
            System.out.println("Array elements are:");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i]+" ");
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            sc.close();
        }
    }
}
//OUTPUT:
// Enter size of array: 5
// Enter elements of array:
// Enter element 1: 1
// Enter element 2: 2
// Enter element 3: 5
// Enter element 4: 4
// Enter element 5: 3
// Array elements are:
// 1 2 5 4 3 
// PS C:\Users\Sayantan\Desktop\College Assignments Sem V>  & 'C:\Program Files\Java\jdk-19\bin\java.exe' '-XX:+ShowCodeDetailsInExceptionMessages' '-cp' 'C:\Users\Sayantan\AppData\Roaming\Code\User\workspaceStorage\863bca577ba12b2ec072278e8786b7da\redhat.java\jdt_ws\College Assignments Sem V_2621194\bin' 'assignment21a.Main' 
// Enter size of array: 6
// Enter elements of array:
// Enter element 1: 1
// Enter element 2: 2
// Enter element 3: 3
// Enter element 4: -4
// assignment21a.NegativeSizeException: Array elements cannot be negative