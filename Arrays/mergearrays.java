package Arrays;

import java.util.*;

public class mergearrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("size 1 : ");
        int s1 = sc.nextInt();

        int arr1[] = new int[s1];
        System.out.println("Enter the array 1 elements: ");
        for (int i = 0; i < s1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("size 2 : ");
        int s2 = sc.nextInt();
        int arr2[] = new int[s2];
        System.out.println("Enter the array 2 elements: ");
        for (int i = 0; i < s2; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] merged = new int[s1 + s2];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < s1 && j < s2) {
            if (arr1[i] < arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }
        while (i < s1) {
            merged[k++] = arr1[i++];
        }
        while (j < s2) {
            merged[k++] = arr2[j++];
        }
        for (int x : merged) {
            System.out.print(x + " ");
        }
    }
}
