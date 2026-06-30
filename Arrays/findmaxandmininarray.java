package Arrays;

import java.util.*;

public class findmaxandmininarray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter " + (i + 1) + " element");
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.println("Min value in array: " + arr[0] + " MAx in array : " + arr[size - 1]);
    }
}
