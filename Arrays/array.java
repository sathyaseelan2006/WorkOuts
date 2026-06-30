package Arrays;

import java.util.*;

public class array {
    public static void main(String args[]) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);


        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the " + (i + 1) + " element :");
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        for (int x : arr) {
            System.out.print(x + " ");
        }

        int index = Arrays.binarySearch(arr, 5);
        System.out.println(index);
        // index is 2

    }
}
