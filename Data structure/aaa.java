import java.util.*;
class aaa {
     public static void main(String[] args) {
         
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine().trim();
   // String d= s.trim();
    String lastword=" ";
    String w =" ";    //" exaple statement "
     
      
   for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch!=' '){
                w=w+ch;
                
            }
           else { 
                // End of word -> add to HashMap
                if (!w.isEmpty()) {
                    
                    w = " "; // reset for next word
                     lastword += w;
                }

            }
        }
         if (!w.isEmpty()) {
            lastword += w;
        }

      System.out.println(lastword);
      System.out.println(lastword.trim().length());


    }
}
    
