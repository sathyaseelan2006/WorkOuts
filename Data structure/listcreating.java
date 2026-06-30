
import java.util.*;
public class listcreating {
    public static void main(String... args){
        List<Integer> l1= new ArrayList<>();
        l1.add(2);
        l1.add(20);
        l1.add(30);
        l1.add(999);
        l1.add(699);
        l1.add(9);
        l1.add(69);
        l1.add(79);
        l1.add(007);

        /*System.out.println("my list:"+l1);
        System.out.println("my list size:"+l1.size());
        System.out.println("Get a element in the list :"+l1.get(5));
        System.out.println("REplace a element:"+ l1.set(4,6969));
        System.out.println("delete a element: :"+l1.remove(8));
        System.out.println("my list:"+l1);
        System.out.println("find the size:"+l1.size());
        System.out.println("my list:"+l1);
        System.out.println("my list:"+l1.contains(6969));*/
         System.out.println("my list:"+l1);
         for(int i=0;i<l1.size();i++){
            if(i%2==0){
                System.out.println("Printing the even position numbers: "+ l1.get(i));
            }
         }
        
        


        //System.out.println("Shuffled list: "+ Collections.shuffle(l1));

    }
    



}
