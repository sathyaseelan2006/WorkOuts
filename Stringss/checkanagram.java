package Stringss;

public class checkanagram {
    static String isAnagram(String s1, String s2) {
        String result = "";

        int frq[] = new int[26];
        for (char c : s1.toCharArray()) {

            frq[Character.toLowerCase(c) - 'a']++;

        }
        for (char s : s2.toCharArray()) {

            frq[Character.toLowerCase(s) - 'a']--;

        }
        for (int i = 0; i < 26; i++) {
            if (frq[i] != 0) {
                return "Is Not anagram";
            }
        }

        return "Is anagram";
    }

    public static void main(String args[]) {
        String s1 = "nagaram";
        String s2 = "anagram";

        checkanagram c = new checkanagram();

        System.out.println(c.isAnagram(s1, s2));

    }
}
