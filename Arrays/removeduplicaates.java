package Arrays;

import java.util.*;

public class removeduplicaates {
    public static void main(String args[]) {
        List<Integer> l = new ArrayList<>();
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        size = sc.nextInt();

        for (int i = 0; i < size; i++) {
            System.out.println("Enter " + (i + 1) + " Element: ");
            int val = sc.nextInt();
            l.add(val);
        }
        List<Integer> d = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            int dum = l.get(i);
            if (!d.contains(dum)) {
                d.add(dum);
            }
        }
        Collections.sort(d);
        System.out.print(d);
    }
}
