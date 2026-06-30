package Stringss;

import java.util.*;

public class validpalindromecheck {
    public static void main(String args[]) {
        String s = "A man, a plan, a canal: Panama";

        String clean = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        // System.out.println(clean);

        int st = 0;
        int end = clean.length() - 1;
        boolean result = true;

        while (st < end) {
            if (clean.charAt(st) != clean.charAt(end)) {
                result = false;
                break;
            }
            st++;
            end--;
        }
        System.out.println(result);
    }
}
