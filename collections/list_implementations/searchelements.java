package collections.list_implementations;

import java.util.ArrayList;
import java.util.List;

public class searchelements {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);

        System.out.println("Element at the 0th index is: " + nums.get(0));
    }
}
