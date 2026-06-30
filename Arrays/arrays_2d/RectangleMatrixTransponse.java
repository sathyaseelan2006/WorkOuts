package Arrays.arrays_2d;

import java.util.*;

// could be used for both square and also rectangle 
public class RectangleMatrixTransponse {
    public static void main(String[] args) {

        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };

        int rows = arr.length;
        int cols = arr[0].length;

        int Transpose[][] = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                Transpose[j][i] = arr[i][j];
            }
        }
        for (int matrix[] : Transpose) {
            for (int val : matrix) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
