package Arrays.arrays_2d;

/*           given the row and column of a pascal Triangle get the element present there
   
    -- with out printing the triangle and creating one we can find it using the NcR factorial formulae
 */
public class PascalTriangleReturnNcR {
    static long NcR(long r, long c) {

        c = Math.min(c, r - c); // t0 reduce the ite

        long res = 1;
        for (int i = 0; i < c; i++) {
            res = res * (r - i);
            res = res / (i + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        int row = 4;
        int col = 4;
        System.out.println(NcR(row - 1, col - 1));
    }

}
