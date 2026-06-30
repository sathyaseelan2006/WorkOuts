package Arrays;

import java.util.*;

public class secondlargest {
    int findsecondlargest(int[] arr) {
        int scl = Integer.MIN_VALUE;
        int lrg = Integer.MIN_VALUE;

        for (int x : arr) {
            if (x > lrg) {
                scl = lrg;
                lrg = x;
            } else if (x > scl && x != lrg) {
                scl = x;
            }
        }
        return scl;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int s = sc.nextInt();

        int arr[] = new int[s];

        System.out.println("Enter the array: ");
        for (int i = 0; i < s; i++) {
            arr[i] = sc.nextInt();
        }
        secondlargest n = new secondlargest();

        System.out.println("The second largest element is: " + n.findsecondlargest(arr));

    }
}
