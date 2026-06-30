package Arrays.variations_binarysearch;

public class SingleElement {
    public static int firstnonduplicate(int arr[]) {
        int l = 1;
        int r = arr.length - 2;

        if (arr.length == 1 || arr[0] != arr[1])
            return arr[0];

        if (arr[arr.length - 1] != arr[arr.length - 2]) {
            return arr[arr.length - 1];
        }
        while (l <= r) {
            int mid = (l + r) / 2;

            if (arr[mid] != arr[mid + 1] && arr[mid] != arr[mid - 1]) {
                return arr[mid];
            }

            if ((mid % 2 == 0 && arr[mid] == arr[mid + 1]) || (mid % 2 == 1 && arr[mid] == arr[mid - 1])) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 3, 3, 4, 4, 8, 8 };

        System.out.println(firstnonduplicate(arr));
    }
}
