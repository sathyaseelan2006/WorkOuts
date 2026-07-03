package Arrays.arrays_2d;

import java.util.*;

public class PascalsTriangle {
    static List<List<Integer>> PrintPascalTriangle(int numrow) {

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < numrow; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    int val = result.get(i - 1).get(j - 1) + result.get(i - 1).get(j);
                    row.add(val);
                }
            }
            result.add(row);
        }
        for (int i = 0; i < result.size(); i++) {
            for (int s = 0; s < result.size() - 1 - i; s++) {
                System.out.print(" ");
            }
            for (int temp : result.get(i)) {
                System.out.print(temp + " ");
            }
            System.out.println();
        }

        return result;

    }

    public static void main(String[] args) {
        System.out.print(PrintPascalTriangle(5));

    }

}
