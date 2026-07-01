package Arrays.arrays_2d;

// We gonna add the sum of primary diagonal and secondary diagonal ----> there is one common [i][i] that we need to add only once 
public class sumofDiagonal {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int row = arr.length;
        int col = arr[0].length;
        int sum = 0;

        int limit = Math.min(row, col);
        for (int i = 0; i < row; i++) {
            sum += arr[i][i];

            if (i != row - 1 - i) {
                sum += arr[i][i];
            }
        }
        System.out.println(sum);

    }
}
