package Arrays.variations_binarysearch;

public class RotationCount {
    public static int Returncount(int arr[]) {
        int l = 0;
        int r = arr.length - 1;

        while (l <= r) {

            if (arr[l] <= arr[r]) {
                return l;
            }
            int mid = l + (r - l) / 2;

            if (arr[l] <= arr[mid]) {

                l = mid + 1;
            } else {
                r = mid;
            }

        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };

        System.out.println(Returncount(arr));
    }
}
