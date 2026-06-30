import java.util.*;
public class reverselist {
     public static void main(String[] args) {
         List<Integer> l = new ArrayList<>();

         l.add(1);
         l.add(2);
         l.add(3);
         l.add(4);

        // System.out.println("Reversed list: "+ Collection.Reversed(l));

    for(    int i=l.size()-1;i>=0;i--){ 

            System.out.println(l.get(i));
            
        }
     }   
}
