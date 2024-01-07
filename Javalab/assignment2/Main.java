//JAVA Assigments 2 for CMS-A CC-5 2024 (OOP with Java) by www.github.com/lazy-coder-03 (Sayantan Ghosh, Roll 335)

// Write a program that accepts a matrix of size m*n from the user and finds the minimum element of each row and each column.(using classes concept, can be done without classes too but oop is the main focus)

package assignment2;

public class Main {
    public static void main(String[] args) {
        Matrix m1 = new Matrix(4, 3);
        int[][] matrix1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, -9 }, { 2, 9, 10 } };
        m1.setMatrix(matrix1);
        m1.printMatrix();

        Matrix m2 = new Matrix(3, 4);
        int[][] matrix2 = { { 1, 2, 3, 4 }, { 4, 5, 6, 7 }, { 7, -8, 9, 12 } };
        m2.setMatrix(matrix2);
        m2.printMatrix();

    }
}

// Path: assignment2/Matrix.java
// Compare this snippet from assignment1/Main.java:
/*
Output:
__________________________
The matrix is: 
__________________________
|1 2 3 |1|
|4 5 6 |4|
|7 8 -9 |-9|
|2 9 10 |2|
__________________________
|1 2 -9 |
__________________________
The matrix is:
__________________________
|1 2 3 4 |1|
|4 5 6 7 |4|
|7 -8 9 12 |-8|
__________________________
|1 -8 3 4 |
 */
