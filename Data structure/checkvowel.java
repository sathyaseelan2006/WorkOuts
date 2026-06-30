import java.util.*;
public class checkvowel {
 public static void main(String... args){
        
        Scanner sc = new Scanner (System.in);
        Map <Character,Integer> m = new HashMap<>();
        m.put('I',1);
        m.put('V',5);
        m.put('X',10);
        m.put('L',50);
        m.put('C',100);
        m.put('D',500);
         m.put('M',1000);

        String s = sc.nextLine();
        String rev= "";
        char ch = ' ';
        int add =0;

        for(int i=s.length()-1;i>=0;i--){
          rev+=s.charAt(i);
        }
        System.out.println(rev);

        for(int i = 0; i<rev.length();i++){

          ch = rev.charAt(i);
          if(m.containsKey(ch)){
            add=add+m.get(ch);
          }
        

        }
        System.out.println(add);


        

        


    
    
}
}
    

