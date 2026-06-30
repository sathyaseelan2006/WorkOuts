package Stringss;

public class countwords {
    public static void main(String args[]) {
        String s = "I am a horny bitch";
        String s1 = s.trim();
        int count = 1;
        String arr[] = new String[100];

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == ' ' && s1.charAt(i - 1) != ' ') {
                count++;
            }
        }
        System.out.println(count);
    }
}
