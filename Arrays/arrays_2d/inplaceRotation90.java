package Arrays.arrays_2d;

public class inplaceRotation90 {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) { // j=i+1 this allows us to skip the arr[i][i](diagonal elements)-from
                                              // getting swaped
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // we have successfully made a transpose now we need to reverse the array

        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = n - 1;
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left++] = matrix[i][right];
                matrix[i][right--] = temp;

            }
        }

        for (int summa[] : matrix) {
            for (int val : summa) {
                System.out.print(val + " ");
            }
            System.out.println(" ");
        }
    }

}
