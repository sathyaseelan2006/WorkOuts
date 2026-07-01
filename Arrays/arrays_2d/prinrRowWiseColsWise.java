package Arrays.arrays_2d;

import java.util.Scanner;

public class prinrRowWiseColsWise {

    static void PrintRowWise(int arr[][]) {
        int row = arr.length;
        int col = arr[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.err.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    static void PrintColWise(int arr[][]) {
        int row = arr.length;
        int col = arr[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.err.print(arr[j][i] + " ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        System.out.println("Row wise printing: ");
        PrintRowWise(arr);
        System.out.println("Col wise printing: ");
        PrintColWise(arr);

    }
}
