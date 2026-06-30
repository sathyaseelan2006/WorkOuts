package Arrays;

import java.util.*;

public class zerotoend {
    public static void main(String args[]) {
        int arr[] = { 1, 2, 0, 4, 3, 0, 5, 0 };
        int index = 0;
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
