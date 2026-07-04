package Arrays;

public class Prefixsum {
    static int[] Createprefix(int arr[]) {
        int prefix[] = new int[arr.length + 1];
        prefix[0] = 0;
        for (int i = 1; i <= arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i - 1];
        }
        return prefix;
    }

    static int Calculatesum(int[] prefix, int l, int r) {
        return prefix[r + 1] - prefix[l];
    }

    public static void main(String[] args) {
        int[] arr = { 3, 0, 1, 4, 2, 5 };

        int[] prefix = Createprefix(arr);

        System.out.println(Calculatesum(prefix, 1, 3)); // 5
        System.out.println(Calculatesum(prefix, 2, 5)); // 12
        System.out.println(Calculatesum(prefix, 0, 4)); // 10
    }
}
