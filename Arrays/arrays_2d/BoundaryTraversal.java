package Arrays.arrays_2d;

public class BoundaryTraversal {
    static void printBoudaryElements(int arr[][]) {
        if (arr.length == 0 || arr[0].length == 0) {
            return;
        }

        int top = 0;
        int bottom = arr.length - 1;
        int left = 0;
        int right = arr[0].length - 1;

        int row = arr.length;
        int col = arr[0].length;

        if (row == 1) {
            for (int i = 0; i < col; i++) {
                System.out.print(arr[0][i] + " ");
            }
            System.out.println();
            return;
        }
        if (col == 1) {
            for (int i = 0; i < row; i++) {
                System.out.print(arr[i][0] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = left; i <= right; i++) {
            System.out.print(arr[top][i] + " ");
        }
        for (int i = top + 1; i <= bottom; i++) {
            System.out.print(arr[i][right] + " ");
        }
        if (top < bottom) {
            for (int i = right - 1; i >= left; i--) {
                System.out.print(arr[bottom][i] + " ");
            }
        }
        if (left < right) {
            for (int i = bottom - 1; i > top; i--) {
                System.out.print(arr[i][left] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        printBoudaryElements(arr);
    }
}
