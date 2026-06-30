package Arrays.variations_binarysearch;

import java.util.*;

public class minimun_in_sortedarray {
    public static int findmin(int arr[]) {
        int l = 0;
        int r = arr.length - 1;
        int ans = Integer.MAX_VALUE;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (arr[l] <= arr[r]) {
                ans = Math.min(ans, arr[l]);
                break;
            }

            if (arr[l] <= arr[mid]) {
                ans = Math.min(ans, arr[l]);
                l = mid + 1;
            } else {
                ans = Math.min(ans, arr[mid]);
                r = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 1, 2 };
        System.out.println(findmin(arr));
    }
}
