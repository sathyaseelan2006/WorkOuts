package Arrays.arrays_2d;

import java.util.*;

public class SumOfCols {

    public static void findMaxincol(int arr[][]) {

        int row = arr.length;
        int col = arr[0].length;
        for (int i = 0; i < col; i++) {
            int max = 0;
            for (int j = 0; j < row; j++) {
                if (arr[j][i] > max) {
                    max = arr[j][i];
                }

            }
            System.out.println("col : " + i + " max : " + max);
        }

    }

    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 31 },
                { 4, 15, 6 },
                { 7, 8, 9 }
        };

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[0].length; j++) {
                sum += arr[j][i];
            }
            System.out.println("Col " + i + " Sum: " + sum);
        }
        findMaxincol(arr);

    }
}
