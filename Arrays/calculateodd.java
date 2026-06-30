package Arrays;

import java.util.*;

public class calculateodd {
    int countOddandEvent(int[] arr) {
        int Oc = 0;
        int Ec = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                Ec++;
            }
        }
        return Ec;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        calculateodd o = new calculateodd();

        System.out.println("No of even numbers: " + (o.countOddandEvent(arr)) + " No of Odd numbers: "
                + (arr.length - (o.countOddandEvent(arr))));
    }
}
