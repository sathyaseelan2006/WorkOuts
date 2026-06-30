import java.util.*;
public class tagetelement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elemet to be found:");
        int target = sc.nextInt();
        List<Integer> sam= new ArrayList<>();
        sam.add(10);
        sam.add(20);
        sam.add(30);
        sam.add(40);
        sam.add(50);
        boolean found=false;
        for(int i=0;i<sam.size();i++){
            int ch= sam.get(i);
            if(target==ch){
                found=true;
        }
    }
            if(found){
               System.out.println("Element is Found");
            }
            else{
                System.out.println("No such element: ");
            }
        }
}

