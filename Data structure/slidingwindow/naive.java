package slidingwindow;

import java.util.*;

import Arrays.findmaxandmininarray;

public class naive {
    int findmaxsum(int[] arr, int k) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i <= arr.length - k; i++) {
            int current = 0;

            for (int j = i; j < i + k; j++) {
                current += arr[j];
            }

            if (current > max) {
                max = current;
            }
        }

        return max;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int curr = 0;
        int max = -1000000;
        System.out.println("Enter the K value: ");
        int k = sc.nextInt();
        System.out.println("Enter the array size: ");
        int s = sc.nextInt();

        int arr[] = new int[s];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < s; i++) {
            arr[i] = sc.nextInt();
        }
        naive n = new naive();
        System.out.println("Max sum in the array is: " + n.findmaxsum(arr, k));
    }
}
