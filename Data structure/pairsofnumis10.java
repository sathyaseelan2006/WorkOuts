import java.util.*;
public class pairsofnumis10 {
    public static void main(String[] args){
        List<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(5);
        a.add(3);
        a.add(7);
        a.add(5);
        a.add(8);

        

        System.out.println("Your list is: "+a);
        int sum=10;

        for(int i=0;i<a.size();i++){
            for(int j=i+1;j<a.size();j++){
                if(a.get(i)+a.get(j)==sum){
                    System.out.println("("+a.get(i)+","+a.get(j)+")");
                }
            }
            
        }
    }
}
