package Arrays.arrays_2d;

public class SetMatrixToZero {
    public static void SetZero(int arr[][]) {
        int m = arr.length;
        int n = arr[0].length;

        int[] row = new int[m];
        int col[] = new int[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    arr[i][j] = 0;
                }
            }
        }
        for (int each[] : arr) {
            for (int val : each) {
                System.out.print(val + " ");
            }
            System.err.println("");
        }
        // for (int var : row) {
        // System.out.println("row: " + var);
        // }
        // for (int cl : col) {
        // System.out.println("col" + cl);
        // }
    }

    public static void main(String[] args) {
        int[][] arr = {
                { 1, 1, 1 },
                { 1, 0, 1 },
                { 1, 1, 1 }
        };
        SetZero(arr);

    }
}
