package Arrays.variations_binarysearch;

public class searchinrotatedarray {
    public static int search(int arr[], int target) {
        int l = 0;
        int h = arr.length - 1;

        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[l] <= arr[mid]) {
                if (target >= arr[l] && target < arr[mid]) {
                    h = mid - 1;
                } else {
                    l = mid + 1;
                }
            } else {
                if (target >= arr[mid] && target < arr[h]) {
                    l = mid + 1;
                } else {
                    h = mid - 1;
                }
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 4;

        System.out.println(search(arr, target));
    }
}

///// 1 2 3 4 5 6