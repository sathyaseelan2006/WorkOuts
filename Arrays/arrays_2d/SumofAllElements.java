package Arrays.arrays_2d;

import java.util.*;

public class SumofAllElements {

    public static int SumOfElements(int arr[][], int row, int columns) {
        int sum = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < columns; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();

        System.out.println("Enter the number of columns: ");
        int columns = sc.nextInt();

        int arr[][] = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(SumOfElements(arr, rows, columns));
    }
}
