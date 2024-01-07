//JAVA Assigments 2 for CMS-A CC-5 2024 (OOP with Java) by www.github.com/lazy-coder-03 (Sayantan Ghosh, Roll 335)

// Write a program that accepts a matrix of size m*n from the user and finds the minimum element of each row and each column.(using classes concept, can be done without classes too but oop is the main focus)

package assignment2;

public class Matrix {
    private int row;
    private int col;
    private int[][] matrix;

    Matrix(int rows, int cols) {
        this.row = rows;
        this.col = cols;
        this.matrix = new int[rows][cols];
    }

    // method to set the matrix
    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public int minRow(int row) {
        int min = matrix[row][0];
        for (int i = 0; i < col; i++) {
            if (min > matrix[row][i]) {
                min = matrix[row][i];
            }
        }
        return min;
    }

    public int minCol(int col) {
        int min = matrix[0][col];
        for (int i = 0; i < row; i++) {
            if (min > matrix[i][col]) {
                min = matrix[i][col];
            }
        }
        return min;
    }

    public void printMatrix() {
        System.out.println("__________________________");
        System.out.println("The matrix is: ");
        System.out.println("__________________________");
        for (int i = 0; i < row; i++) {
            System.out.printf("|");
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.printf("|");
            System.out.print(minRow(i));
            System.out.printf("|");
            System.out.println();
        }
        System.out.println("__________________________");
        System.out.printf("|");
        for (int i = 0; i < col; i++) {
            System.out.print(minCol(i) + " ");
        }

        System.out.printf("|");
        System.out.println();
    }
}
