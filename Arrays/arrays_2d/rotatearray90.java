package Arrays.arrays_2d;

//both clock and anti-clock wise 
public class rotatearray90 {

    public static void anticlockwise90(int arr[][]) {
        int n = arr.length;
        int m = arr[0].length;

        int rotated[][] = new int[m][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                rotated[n - 1 - j][i] = arr[i][j];
            }
        }
        System.out.println("Counter clock wise rotation: ");
        for (int matrix[] : rotated) {
            for (int val : matrix) {
                System.out.print(val + " ");
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
        int n = arr.length;
        int m = arr[0].length;

        int rotated[][] = new int[m][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                rotated[j][m - 1 - i] = arr[i][j];
            }
        }
        System.out.println("Clock wise rotation");
        for (int matrix[] : rotated) {
            for (int val : matrix) {
                System.out.print(val + " ");
            }
            System.out.println(" ");
        }
        anticlockwise90(arr);
    }
}
