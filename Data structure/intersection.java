import java.util.*;
public class intersection {
    public static void main(String[] args) {

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

       Set<Integer> intersec = new LinkedHashSet<>(m);
       Set<Integer>union=new LinkedHashSet<>(m);
       //Set<Integer>check=new LinkedHashSet<>(m);
       union.addAll(s);
       intersec.retainAll(s);
       union.removeAll(intersec);
       boolean check = false;
       


       System.out.println("Intersection: "+intersec);
       System.out.println("Removed the insecction elements from the set: "+union);

       if(intersec.isEmpty())
       {
        System.out.println("m is not a subset of s");
       }
       else{
        check =true;
        System.out.println("True");
       }
       


        
    }
}
