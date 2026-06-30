import java.util.*;
public class frequency {
    public static void main(String[] args) {
        //to find the frequency of a number
        boolean f= false;
        List<Integer> l1= new ArrayList<>();
        l1.add(2);
        l1.add(3);
        l1.add(3);
        l1.add(3);
        l1.add(3);
        l1.add(2);
        l1.add(4);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to know it's freq: ");
        int element= sc.nextInt();
        int count=0;
        for(int i =0;i<l1.size();i++){
            if(element== l1.get(i)){
                f= true;
                count++;
            }
        }
        if(f){
            System.out.println("Frequency: "+count);
        }
            else{
                System.out.println("No such element found");
            }
        
        



    }
}
