package Arrays.variations_binarysearch;

public class floorandceil {
    public static int returnfloor(int arr[], int target) {
        int l = 0;
        int r = arr.length - 1;
        int floor = -1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (target >= arr[mid]) {
                floor = arr[mid];
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return floor;
    }

    public static int returnceil(int arr[], int target) {
        int l = 0;
        int r = arr.length - 1;
        int ceil = -1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (target <= arr[mid]) {
                ceil = arr[mid];
                r = mid - 1;

            } else {
                l = mid + 1;
            }
        }
        return ceil;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 6, 8 };
        int x = 5;

        System.out.println("Floor = " + returnfloor(arr, x));
        System.out.println("Ceil = " + returnceil(arr, x));
    }
}
