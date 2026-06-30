
package Stringss;

import java.util.*;

public class removeduplicates {
    public static void main(String args[]) {
        String s = "Programming";

        String result = "";
        int freq[] = new int[26];

        for (char c : s.toCharArray()) {
            if (freq[Character.toLowerCase(c) - 'a'] == 0) {
                result += Character.toLowerCase(c);
                freq[Character.toLowerCase(c) - 'a']++;
            }
        }
        System.out.println(result);
    }
}