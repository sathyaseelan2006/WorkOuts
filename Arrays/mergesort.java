package Arrays;

import java.util.*;

public class mergesort {

    static void mergesort(int arr[], int l, int r) {
        if (l < r) {
            int mid = ((l + r) / 2);
            mergesort(arr, l, mid);
            mergesort(arr, mid + 1, r);

            merge(arr, l, mid, r);
        }
    }

    static void merge(int arr[], int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int larr[] = new int[n1];
        int rarr[] = new int[n2];

        for (int i = 0; i < n1; i++) {
            larr[i] = arr[l + i];
        }
        for (int i = 0; i < n2; i++) {
            rarr[i] = arr[mid + 1 + i];
        }
        int i = 0;
        int j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (larr[i] <= rarr[j]) {
                arr[k++] = larr[i++];

            } else {

                arr[k++] = rarr[j++];

            }

        }
        while (i < n1) {
            arr[k++] = larr[i++];

        }
        while (j < n2) {
            arr[k++] = rarr[j++];

        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array before sorting: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        mergesort(arr, 0, arr.length - 1);
        System.out.println();

        System.out.println("Array after sorting: ");

        for (int x : arr) {
            System.out.print(x + " ");
        }

    }
}