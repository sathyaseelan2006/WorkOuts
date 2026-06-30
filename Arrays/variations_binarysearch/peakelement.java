package Arrays.variations_binarysearch;

public class peakelement {
    public static int findpeakelement(int arr[]) {
        int l = 0;
        int r = arr.length - 1;

        while (l < r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] > arr[mid + 1]) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l; // to print the element use arr[l];
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1, 4 };
        int target = 0;

        System.out.println(findpeakelement(arr));
    }
}
