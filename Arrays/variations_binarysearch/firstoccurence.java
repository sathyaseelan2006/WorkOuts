package Arrays.variations_binarysearch;

public class firstoccurence {
    public static int firstofoccurence(int arr[], int target) {
        int l = 0;
        int r = arr.length - 1;
        int ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == target) {
                ans = mid;
                r = mid - 1; // checking actually wheather there exsist another copy of the element in the
                             // left side if 1 2 (2) 2 mid-->() but there is a another 2 in the left
            } else if (arr[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3 };
        int target = 3;

        System.out.println(firstofoccurence(arr, target));
    }
}
