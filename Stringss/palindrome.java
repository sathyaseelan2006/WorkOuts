package Stringss;

public class palindrome {
    public static void main(String args[]) {
        String s = "malayalam";

        int st = 0;
        int end = s.length() - 1;
        boolean result = true;

        while (st < end) {
            if (s.charAt(st) != s.charAt(end)) {
                result = false;
                break;
            }
            st++;
            end--;
        }

        System.out.println("IsPalindrome: " + result);
    }
}
