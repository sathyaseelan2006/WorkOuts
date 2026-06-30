package Arrays.variations_binarysearch;

public class countoccurence {
    public static int firstoccurence(int arr[], int target) {
        int l = 0;
        int r = arr.length - 1;

        int ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (target == arr[mid]) {
                ans = mid;
                r = mid - 1;
            } else if (target < arr[mid]) {

                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    public static int lastoccurence(int arr[], int target) {
        int l = 0;
        int r = arr.length - 1;
        int ans = -1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (target == arr[mid]) {
                ans = mid;
                l = mid + 1;
            } else if (target < arr[mid]) {
                r = mid - 1;

            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    public static int count_occurence(int arr[], int target) {
        int first = firstoccurence(arr, target);
        if (first == -1)
            return -1;
        int last = lastoccurence(arr, target);

        return last - first + 1;
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 2, 2, 2, 5 };
        int x = 10;

        System.out.println(count_occurence(arr, x));
    }
}
