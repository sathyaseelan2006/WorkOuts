package Arrays.arrays_2d;

public class rotatearray180 {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int n = arr.length;
        int m = arr[0].length;

        int rotated[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                rotated[n - 1 - i][m - 1 - j] = arr[i][j];
            }
        }
        for (int[] row : rotated) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }

    }
}
