package Arrays;

import java.util.*;

public class countODDandEven {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        int oddcount = 0;
        int evencount = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter " + (i + 1) + " element");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evencount++;
            } else {
                oddcount++;
            }
        }
        System.out.print("total odd numbers in the array is:" + (oddcount) + " Even count: " + evencount);
    }
}