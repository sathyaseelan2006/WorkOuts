package Stringss;

public class countvowels {
    public static void main(String[] args) {

        String s = "aeiou";
        String s1 = s.toLowerCase();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s1.charAt(i) == 'a' || s1.charAt(i) == 'e' || s1.charAt(i) == 'i' || s1.charAt(i) == 'o'
                    || s1.charAt(i) == 'u') {
                count++;
            }
        }
        System.out.println("Total vowels present are: " + count);
        System.out.println("Total consonants are: " + (s1.length() - count));
    }
}
