import java.util.*;
public class mapusage {
    public static void main(String... args){
        Map <Integer,String> map = new HashMap<>();
        
        Map <Integer,String> m = new HashMap<>();
        Map <Integer,String> mapedfr = new HashMap<>();

        


        Scanner sc =new Scanner(System.in);

        map.put(101,"Sanjai");
        map.put(102,"kaanom");
        map.put(103,"Sasikumar");
        map.put(104,"sathya");
        map.put(105,"Senthil");

        int key=0;
        String value ="0";
        int size=1;

        System.out.println(map);
        
        for(int i=0;i<size;i++){
           System.out.println("Enter the key: ");
            key = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the value: ");
            value = sc.nextLine();

            m.put(key,value);
            
        }

        System.out.println("your map: "+m);
        
        map.putAll(m);
        
        System.out.println("your map: "+map);


        for (Map.Entry<Integer,String> entry : mapedfr.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }




    }
}
