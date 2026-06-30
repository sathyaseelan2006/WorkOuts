import java.util.*;
public class maxelementinlist {
    public static void main(String[] args){
     List<Integer> a= new ArrayList<>();
     a.add(5);
     a.add(69);
     a.add(7);
     a.add(8);
     a.add(9);
     a.add(100);
     a.add(0);
     int max= a.get(0);
     int id=0;

     for(int i =0;i<a.size();i++){
        if(a.get(i)>max){
            max=a.get(i);
            id=i;
        }
     }
     System.out.println("The max element in the list is: "+max);
     System.out.println("The index position is: "+id);
 
    }
}
