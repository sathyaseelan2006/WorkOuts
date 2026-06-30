package Arrays.variations_binarysearch;

import java.util.*;

public class upperbound {
    public static int findlowerbound(int arr[], int target) {
        int l = 0;
        int r = arr.length - 1;
        int ans = -1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] > target) {
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 3, 3, 4, 5, 6, 7, 8, 9 };
        int target = 3;

        System.out.println(findlowerbound(arr, target));
    }
}
