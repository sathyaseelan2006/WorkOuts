import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class swappingthelist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        List<String> l1= new ArrayList<>();
     for(int i =0;i<n;i++){
       System.out.println("Enter the String: "); 
       String var = sc.nextLine();
       l1.add(var);
     }
     System.out.println("Your Poosaaayyy is :"+l1);
     //swapping 
     /*for(int i =1;i<l1.size()-1;i++)
      System.out.println(l1.get(l1.size()-1)+" "+l1.get(i)+"  "+l1.get(0));*/
      if(l1.size()>1){
    String temp;
    temp= l1.get(0);
    l1.set(0,l1.get(l1.size()-1));
    l1.set(l1.size()-1,temp);

      }
      System.out.println("Your swapped WetAhhhPoosaaayyy: "+l1);
    }
}

