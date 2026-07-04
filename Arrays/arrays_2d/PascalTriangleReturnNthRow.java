package Arrays.arrays_2d;

import java.util.*;

public class PascalTriangleReturnNthRow {
    static List<Integer> ReturnNthRowinPSTriangle(int rownum) {
        int ans = 1;
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        for (int i = 1; i <= rownum; i++) {
            ans = ans * (rownum - i + 1);
            ans = ans / i;
            l1.add(ans);
        }
        return l1;
    }

    public static void main(String[] args) {
        System.out.println(ReturnNthRowinPSTriangle(6));
    }
}
