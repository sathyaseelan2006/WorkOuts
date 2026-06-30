package collections;

import java.util.*;

public class basic {
    public static void main(String args[]) {
        Collection<String> phones = new ArrayList<>();
        phones.add("Samsung");
        phones.add("Apple");
        phones.add("Blackberry");
        phones.add("Oppo");
        phones.add("Vivo");

        System.out.println(phones);
        phones.remove("Apple");
        System.out.println(phones);
    }
}
