//JAVA Assigments 1 for CMS-A CC-5 2024 (OOP with Java) by www.github.com/lazy-coder-03 (Sayantan Ghosh, Roll 335)

// Write a program to sort the first half of the array in ascending order and the second half of the array in descending order.

package assignment01;

public class HalfSort {
    static int[] halfSort(int[] arr) {
        int[] sortedArr = new int[arr.length];// array to store the sorted array
        int[] tempArr = new int[arr.length];// temp array to store the sorted array
        int temp = 0;
        // copying the array to temp array
        for (int i = 0; i < arr.length; i++) {
            tempArr[i] = arr[i];
        }

        // sorting first half in ascending order

        for (int i = 0; i < arr.length / 2; i++) {
            for (int j = i + 1; j < arr.length / 2; j++) {
                if (tempArr[i] > tempArr[j]) {
                    temp = tempArr[i];
                    tempArr[i] = tempArr[j];
                    tempArr[j] = temp;
                }
            }
        }
        
        // sorting second half in descending order

        for (int i = arr.length / 2; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (tempArr[i] < tempArr[j]) {
                    temp = tempArr[i];
                    tempArr[i] = tempArr[j];
                    tempArr[j] = temp;
                }
            }
        }
        // copying the sorted array to sortedArr
        for (int i = 0; i < arr.length; i++) {
            sortedArr[i] = tempArr[i];
        }
        return sortedArr;
    }

}