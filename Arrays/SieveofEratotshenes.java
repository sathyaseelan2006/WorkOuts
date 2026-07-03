import java.util.*;
import java.util.*;

public class SieveofEratotshenes {
    static boolean isprime(int num) {
        if (num == 0 || num == 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    static ArrayList<Integer> sieve(int n) {
        ArrayList<Integer> l1 = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (isprime(i)) {
                l1.add(i);
            }
        }
        return l1;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        List<Integer> l1 = sieve(n);

        for (int sum : l1) {
            System.out.print(sum + " ");
        }

    }
}
