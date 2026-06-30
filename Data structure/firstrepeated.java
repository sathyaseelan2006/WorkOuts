import java.util.*;
public class firstrepeated {
    public static void  main(String[] args){
         Scanner sc = new Scanner(System.in);
         String s = sc.nextLine();

         int count=0;
        char ch ;

        
         Set<Character> s1 = new HashSet<>();
         // List<Character> l = new ArrayList<>(s1);

         for(int i = 0; i<s.length();i++){

            
            if(s1.contains(s.charAt(i))){
                ch = s.charAt(i);

                count++;
                System.out.println("first repeated:  "+ch);
                break;
            
            }
            else{
                s1.add(s.charAt(i));
            }
            

         }
         
    }
}
