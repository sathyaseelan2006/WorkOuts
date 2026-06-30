import java.util.*;
public class setopt {
    public static void main(String[] args) {
        Set<Integer> a = new HashSet<>();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);

        System.out.println("Your set: "+a);

        //to remove  an element

        System.out.println("To remove the element 20: " +a.remove(20));
        System.out.println(a);

        // to check a element present in the set

        System.out.println("To check if 30 present in the set: "+a.contains(30));

        //to find the size of the set

        System.out.println("The size of your set is: "+a.size());
      
        for(int i : a){
            System.out.println(a);
        }



    
        Set<Integer> m = new LinkedHashSet<>();
        Set<Integer> s = new LinkedHashSet<>();

        m.add(6);
        m.add(7);
        m.add(8);
        m.add(9);
        m.add(10);

        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(5);

        
        Set<Integer> union = new LinkedHashSet<>(s);
        union.addAll(m);

        System.out.println("Union of m and s: " + union);
    }
}



    



