import java.util.ArrayList;
import java.util.List;

public class student {
    public static void main(String[] args) {
        List<Integer> l1= new ArrayList<>();
        List<String> b= new ArrayList<>();
        l1.add(103);
        l1.add(104);
        l1.add(105);
        b.add("sasi");
        b.add("SAthya");
        b.add("selva");

        for(int i=0;i<b.size();i++){
            System.out.println(l1.get(i)+" "+b.get(i));
            

        }

    }
}
