import java.util.Scanner;
public class prg2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine() ;

        char start=data.charAt(0);
        char end=data.charAt(data.length()-1);
        String newString = end+(data.substring(1, data.length()-1))+start;
        System.out.println(newString);
    }
}
