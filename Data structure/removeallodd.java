import java.util.*;
public class removeallodd {
    

    public static void main(String[] args){
        List<Integer> a = new ArrayList<>();

        a.add(5);
        a.add(6);
        a.add(9);
        a.add(10);
        a.add(16);
        a.add(21);
        a.add(24);
        a.add(17);
        a.add(30);
        a.add(40);
        a.add(71);
            System.out.println("For your reference the og list is: "+a);

        int temp=0;
        //int index=0;
        boolean enathu=false;

        for(int i=0;i<a.size();i++){

            if(a.get(i)%2!=0){

                enathu=true;
                
                a.remove(i);

            }

        }
        
            //a.set(index,0);
            System.out.println("Modified list is: "+a);

        
        //else{
            //System.out.println("no even elements found in the list");
        //}


    }
}
