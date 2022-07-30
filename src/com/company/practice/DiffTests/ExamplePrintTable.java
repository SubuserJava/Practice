package com.company.practice.DiffTests;

public class ExamplePrintTable {

    public static void printMatrix(int size, int row, int[][] matrix) {

        for (int i = 0; i < 7 * matrix[row].length; i++) {
            System.out.print("-");
        }
        System.out.println("-");

        for (int i = 1; i <= matrix[row].length; i++) {
            System.out.printf("| %4d ", matrix[row][i - 1]);
        }
        System.out.println("|");

        if (row == size - 1) {

            // when we reach the last row,
            // print bottom line "---------"

            for (int i = 0; i < 7 * matrix[row].length; i++) {
                System.out.print("-");
            }
            System.out.println("-");

        }
    }

    public static void length(int[][] matrix) {

        int rowsLength = matrix.length;

        for (int k = 0; k < rowsLength; k++) {

            printMatrix(rowsLength, k, matrix);

        }

    }

    public static void main(String[] args) {

        int[][] matrix = {{1, 2, 5}, {3, 4, 6}, {7, 8, 9}

        };

        length(matrix);

    }
}

