package Stringss;

import java.util.*;

public class frequencycount {
    public static void main(String args[]) {
        String s = "Eppovume nammadha";
        int arr[] = new int[26];

        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                arr[Character.toLowerCase(c) - 'a']++;
            }

        }
        for (int i = 0; i < 26; i++) {
            if (arr[i] > 0) {
                System.out.println((char) (i + 'a') + "-->" + arr[i]);
            }
        }
    }
}
