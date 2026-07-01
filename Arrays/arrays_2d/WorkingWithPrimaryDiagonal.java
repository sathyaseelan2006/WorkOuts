package Arrays.arrays_2d;

public class WorkingWithPrimaryDiagonal {

    public static void PrintPrimaryDiagonal(int arr[][]) {
        int row = arr.length;
        int col = arr[0].length;
        // for a non-square matrix using i < Math.min(row,col)-----> to make a perfect
        // pair of the index ij
        int limit = Math.min(row, col); // -------------> best practise works for both square and non sqaure matrix
        for (int i = 0; i < limit; i++) {

            System.out.println(arr[i][i]);
        }

        int sum = 0;
        for (int i = 0; i < limit; i++) {
            sum += arr[i][i];
        }
        System.out.println("Sum of primary diagonal: " + sum);

    }

    public static void PrintSecondaryDiagonal(int arr[][]) {
        int row = arr.length;
        int col = arr[0].length;
        int sum = 0;

        int limit = Math.min(row, col);

        for (int i = 0; i < limit; i++) {
            System.out.println(arr[i][col - 1 - i]);
        }
        // to find the sum of the secondary diagonal
        for (int i = 0; i < limit; i++) {
            sum += arr[i][col - 1 - i];
        }
        System.out.println("Sum of Secondary diagonal: " + sum);
    }

    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        System.out.println("Primary Diagonal: ");
        PrintPrimaryDiagonal(arr);
        System.out.println("Secondary Diagonal: ");
        PrintSecondaryDiagonal(arr);
    }
}
