
import java.util.HashSet;
import java.util.Set;

public class creatingset {
    public static void main(String[] args){
        Set<Integer>s1=new HashSet<>();
        Set<String>s2=new HashSet<>();

        s1.add(2);
        s1.add(3);
        s1.add(4);
        s1.add(5);
        s1.add(6);

        s2.add("Shanks");
        s2.add("Luffy");
        s2.add("Violet");
        s2.remove("Violet");

        System.out.println("My set elements are: "+s1);
        System.out.println("is my set empty: "+s1.isEmpty());
        System.out.println("checking contains: "+s1.contains(7));
        System.out.println("checking the size: "+s1.size());
        

        System.out.println("My set elements are: "+s2);
        System.out.println("Remove elements: "+s2.remove("violet"));
        s2.removeAll(s2);
        System.out.println(s2);


    }
}
