package Arrays.arrays_2d;

import java.util.*;

import Arrays.binarysearch;

public class SearchInMatrix {
    static boolean linearsearch(int arr[][], int target) {
        int n = arr.length;
        int m = arr[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean BinarySearch(int arr[][], int target) {

        int row = arr.length;
        int col = arr[0].length;
        int l = 0;
        int r = row * col - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            int val = arr[mid / col][mid % col];

            if (target == val) {
                return true;
            } else if (target > val) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return false;
    }

    static boolean StairCaseSearch(int arr[][], int target) {
        int row = 0;
        int col = arr[0].length - 1;

        while (row < arr.length && col >= 0) {
            if (target == arr[row][col]) {
                return true;
            } else if (arr[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 3, 1, 2 },
                { 9, 0, 0 },
                { 1, 4, 5 }
        };
        int[][] sortedMatrix = {
                { 1, 3, 5 },
                { 7, 9, 11 },
                { 13, 15, 17 }
        };

        System.out.println(linearsearch(matrix, -1));
        System.out.println("Binary Search Says");
        System.out.println(BinarySearch(sortedMatrix, 0));
        System.out.println("Stair case Search Says: " + StairCaseSearch(sortedMatrix, 1));
    }
}
