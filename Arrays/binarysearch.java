package Arrays;

import java.util.*;

public class binarysearch {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 7, 8, 99, 810 };

        int l = 0;
        int r = arr.length - 1;
        int target = 102;
        boolean res = false;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == target) {
                res = true;
                break;
            } else if (arr[mid] < target) {
                l = mid + 1;
            } else {

                r = mid - 1;
            }
        }
        System.err.println(res ? "found" : "not found");
    }
}
