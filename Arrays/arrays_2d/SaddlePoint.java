package Arrays.arrays_2d;

/* saddle point is a number which is smaller in its row and higher in its column

start with the first number in the matrix arr[0][0] --> scout the entire row check whether it is the smaller in the row , 

if true mark down the column j and check whether the minVal is the greater number in it's column---> if no break stop immediately

*/
public class SaddlePoint {
    static void FindSaddlePoint(int arr[][]) {

        int row = arr.length;
        int col = arr[0].length;
        boolean found = false;

        for (int i = 0; i < row; i++) {
            int minval = arr[i][0];
            int mincol = 0;
            for (int j = 1; j < col; j++) { // initializing j=1 cause we need to check arr[0][1] , min val is arr[0][0]
                if (arr[i][j] < minval) {
                    minval = arr[i][j];
                    mincol = j;
                }
            }
            boolean isMax = true;
            for (int k = 0; k < row; k++) {
                if (arr[k][mincol] > minval) {
                    isMax = false;
                    break;
                }
            }
            if (isMax) {
                System.out.println("Saddle point " + minval + " [" + i + "][" + mincol + "]");
                found = true;
            }
        }
        if (!found) {
            System.out.println("No saddle Point Found");
        }

    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 1 },
                { 2, 3, 2 },
                { 1, 6, 5 }
        };
        FindSaddlePoint(matrix);
    }
}
