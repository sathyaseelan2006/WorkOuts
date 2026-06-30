package Arrays.variations_binarysearch;

public class SearchRotatedArrayII {
    public static Boolean Returnelement(int arr[], int target) {
        int l = 0;
        int r = arr.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == target) {
                return true;
            }
            if (arr[l] == arr[mid] && arr[mid] == arr[r]) {
                l++;
                r--;
            } else if (arr[l] <= arr[mid]) {
                if (target >= arr[l] && target < arr[mid]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            } else {
                if (target > arr[mid] && target <= arr[r]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] nums = { 2, 5, 6, 0, 0, 1, 2 };

        System.out.println(Returnelement(nums, 0)); // true
        System.out.println(Returnelement(nums, 3)); // false
    }
}
