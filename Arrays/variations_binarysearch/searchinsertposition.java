package Arrays.variations_binarysearch;

public class searchinsertposition {
    // we need to find the index position on which a target element should be placed
    // in a array

    public static int searchpostion(int[] arr, int target) {
        int l = 0;
        int r = arr.length - 1;
        int ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                l = mid + 1;

            } else {
                r = mid - 1;
            }
        }
        return l;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 4 };
        int target = 3;

        System.out.println(searchpostion(arr, target));
    }
}
