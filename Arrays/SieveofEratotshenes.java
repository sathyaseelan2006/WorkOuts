import java.util.*;

public class SieveofEratotshenes {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Boolean[] arr = new Boolean[n + 1];
        Arrays.fill(arr, true);

        if (n >= 0)
            arr[0] = false;
        if (n >= 1)
            arr[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (arr[i]) {
                for (int j = i * i; j <= n; j += i) {
                    arr[j] = false;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]) {
                System.out.print(i + " ");
            }
        }

    }
}
