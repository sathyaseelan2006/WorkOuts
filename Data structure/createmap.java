import java.util.*;

public class createmap {
    public static void main(String[] args) {
        Map<Integer, String> m = new HashMap<>();

        m.put(1, "sab");
        m.put(2, "namachi");
        m.put(3, "Lohith");
        m.put(4, "Chandru");
        m.put(5, "barath");

        System.out.println("Created a map: " + m);
        System.out.println("contais key 3?" + m.containsKey(3));
        System.out.println("Contains value Arul?: " + m.containsValue("Arul"));
        System.out.println("Removing the elements: " + m.remove(4));
        System.out.println("After removing barath: " + m);

        int size = 2;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < size; i++) {
            System.out.println("Enter the key to add in the map: ");
            int key1 = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the value to add in the map: ");
            String value1 = sc.nextLine();
            m.put(key1, value1);

        }
        System.out.println("After adding new elements: " + m);
        System.out.print("the updated map is: " + m);

    }
}
