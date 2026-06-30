package Arrays;

import java.util.*;

public class bubblesort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int x = sc.nextInt();
        int arr[] = new int[x];

        System.out.println("Enter the array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length - 1; i++) { // -1 cuz to avoid outofindex error
            for (int j = 0; j < arr.length - 1 - i; j++) { // s.-1.-i cuz to avoid repeated checking of the sorted
                                                           // element {no repeatation}
                if (arr[j] > arr[j + 1]) { // arr[arr.length]----> length != index number so it is error thus we do
                                           // {arr.length-1}
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("array after sorting: ");
        for (int z : arr) {
            System.err.print(z + " ");
        }
    }
}
