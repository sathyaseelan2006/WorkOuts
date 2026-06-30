package Stringss;

import java.util.*;

public class reverseastring {
    static String reverse(String str) {
        char arr[] = str.toCharArray();
        int st = 0;
        int end = str.length() - 1;

        while (st < end) {
            char temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;

        }
        return new String(arr);
    }

    public static void main(String[] args) {

        String str = "Usharani";
        reverseastring s = new reverseastring();

        System.out.println("string reverse: " + s.reverse(str));

    }
}
