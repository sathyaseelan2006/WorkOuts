import java.util.*;
//we gonna perform CRUD operations on a list

/*public class listoperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
       
        
        // Create
        System.out.println("Enter the number of elements you want to add:");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element " + (i + 1) + ":");
            String element = sc.nextLine();
            list.add(element);
        }
        
        // Read
        System.out.println("Your list is: " + list);
        
        // Update
        System.out.println("Enter the index of the element you want to update:");
        int indexToUpdate = sc.nextInt();
        sc.nextLine(); // Consume newline
        if (indexToUpdate >= 0 && indexToUpdate < list.size()) {
            System.out.println("Enter the new value:");
            String newValue = sc.nextLine();
            list.set(indexToUpdate, newValue);
            System.out.println("Updated list: " + list);
        } else {
            System.out.println("Invalid index.");
        }
        
        // Delete
        System.out.println("Enter the index of the element you want to delete:");
        int indexToDelete = sc.nextInt();
        if (indexToDelete >= 0 && indexToDelete < list.size()) {
            list.remove(indexToDelete);
            System.out.println("List after deletion: " + list);
        } else {
            System.out.println("Invalid index.");
        }
    }
}*/

public class listoperations {
    public static void main(String[] args) {

        List<Integer> l1= new ArrayList<>();
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size of your list");
        int n = sc.nextInt();

        for (int i=0;i<n;i++){
            System.out.println("Enter the elements to your list: ");
            int var = sc.nextInt();
            l1.add(var);
        }
        System.out.println("Yourr list elements are: "+l1);

        // performing read 

        for(int i=0;i<l1.size();i++){
            l1.get(i);
        }

        // update

        int indexx;
        int val;

        

    


    }
}
