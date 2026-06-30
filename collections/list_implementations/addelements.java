package collections.list_implementations;

import java.util.*;

public class addelements {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        System.out.println(nums);
        int s = nums.size();
        System.out.println(s);
        List<String> goats = new ArrayList<>();
        System.out.println("Enter the GOATS name: ");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < s; i++) {
            String temp = sc.nextLine();
            goats.add(temp);

        }
        System.err.println("The goats: " + goats);
    }
}
