import java.util.*;
public class bst {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Node root;
        int arr[]=new int[4];
        for(int i =0;i<arr.length;i++){
            System.out.println("Enter the node "+(i+1)+  ":");
             arr[i]=sc.nextInt();

        }
        Node n = new Node(arr[0]);
        Node n2 = new Node(arr[1]);
        Node n3 = new Node(arr[2]);
        Node n4 = new Node(arr[3]);
         root =n;
        root.left = n2;
        root.right=n3;
   
       
       System.out.println(root);
       System.out.println(n);
       System.out.println(n2);
       System.out.println(n3.right.value);
       System.out.println(n4);
    }
    
}
class Node{
    int value;
    Node left=null,right=null;
    Node(int value){
        this.value = value;
    }
}
