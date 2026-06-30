import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class sumoflist {
    public static void main(String[] args) {

        int sum=0;
        Scanner sc = new Scanner(System.in);

        List<Integer> l1= new ArrayList<>();

        System.out.println("Enter the size of your list: ");
        int size = sc.nextInt();

        for(int i =1; i<size+1;i++){
            System.out.println("Enter  element "+i+":" );
            int var = sc.nextInt();
            //System.out.println(var);
            l1.add(var);
            
        }

        for(int j =0;j<l1.size();j++){
            
            sum+=l1.get(j);
        }
        System.out.println("Your list is: "+l1);
        System.out.println("sum of your list is: "+sum);


    //int n=l1.size();
    int arr[] = new int[l1.size()];

      for(int i =0; i<l1.size();i++){

        arr[i]=l1.get(i);

      }
      System.out.println("Your list to array: "+Arrays.toString(arr));
    }
}

