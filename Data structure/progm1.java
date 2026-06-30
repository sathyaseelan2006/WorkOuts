import java.util.Scanner;
public class progm1 {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       String name = sc.nextLine();
       System.out.println("Name:"+name);
       System.out.println("First letter:"+name.charAt(0));
       System.out.println("last letter:"+name.charAt(name.length()-1));
       System.out.println("middle letter:"+name.charAt(name.length()/2));

        String reversedString = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            reversedString += name.charAt(i);
        }

       if(name.equalsIgnoreCase(reversedString)){ 
           System.out.println(name + " is a palindrome.");
       } else {
           System.out.println(name + " is not a palindrome.");
       }

       System.out.println((name.substring(0,2)));
    }
}