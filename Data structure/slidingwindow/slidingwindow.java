package slidingwindow;

import java.util.Scanner;

public class slidingwindow {

    int calculatemaxsum(int[] arr, int k) {
        if (k <= 0 || k > arr.length) {
            throw new IllegalArgumentException("Invalid k: must be between 1 and arr.length");
        }

        int winsum = 0;
        for (int i = 0; i < k; i++) {
            winsum += arr[i];
        }

        int maxsum = winsum;

        for (int i = k; i < arr.length; i++) {
            winsum = winsum - arr[i - k] + arr[i];

            if (winsum > maxsum) {
                maxsum = winsum;
            }
        }
        return maxsum;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the K value: ");
        int k = sc.nextInt();
        System.out.println("Enter the array size: ");
        int s = sc.nextInt();

        int arr[] = new int[s];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < s; i++) {
            arr[i] = sc.nextInt();
        }
        slidingwindow sn = new slidingwindow();
        System.out.println("Max sum in the array is: " + sn.calculatemaxsum(arr, k));
    }
}
