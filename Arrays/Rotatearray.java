package Arrays;

import java.util.*;

public class Rotatearray {
    public static void reverese(int[] arr, int st, int ed) {
        while (st < ed) {
            int temp = arr[st];
            arr[st] = arr[ed];
            arr[ed] = temp;
            st++;
            ed--;
        }
    }

    public static void rotate(int arr[], int k) {

        int s = arr.length;
        k = k % s;
        if (k < 0) {
            k = k + s;
        }
        reverese(arr, 0, k - 1);
        reverese(arr, k, s - 1);
        reverese(arr, 0, s - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int c = sc.nextInt();
        int arr[] = new int[c];

        System.out.println("Enter the array elements: ");
        for (int i = 0; i < c; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number of times to be rotated");
        int k = sc.nextInt();

        rotate(arr, k);

        for (int z : arr) {
            System.out.print(z + " ");
        }
    }

}
