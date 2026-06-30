package Arrays.variations_binarysearch;

public class lastofoccurrence {
    public static int lastoccurence(int arr[], int target) {
        int l = 0;
        int r = arr.length - 1;
        int ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == target) {
                ans = mid;
                l = mid + 1;
            } else if (arr[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 3, 3 };
        int target = 3;

        System.out.println(lastoccurence(arr, target));
    }
}
