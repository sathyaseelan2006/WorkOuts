package Arrays;

import java.util.*;

public class quicksorting {
    public static void quicksort(int arr[], int l, int h) {

        if (l < h) {
            int pi = partition(arr, l, h);

            quicksort(arr, l, pi - 1);
            quicksort(arr, pi + 1, h);
        }
    }

    public static int partition(int arr[], int l, int h) {

        int pv = arr[h];
        int i = l - 1;

        for (int x = l; x < h; x++) {
            if (arr[x] < pv) {
                i++;
                int temp = arr[i];
                arr[i] = arr[x];
                arr[x] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[h];
        arr[h] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 2, 1, 6, 4, 7, 8, 22, 4, 45, 954, 4, 3, 6, 5, 1 };

        System.out.println("array before sorting");
        for (int z : arr) {
            System.out.print(z + " ");
        }
        quicksort(arr, 0, arr.length - 1);
        System.out.println("\narray after sorting");

        for (int z : arr) {
            System.out.print(z + " ");
        }
    }
}
