
public class bst_insertion{
  Node root;
  void insert(int value){
        Node n = new Node(value);
        if (root == null){
            root = n;
        }
        else{
            Node temp = root;
            while(true){
                if(temp.value>value){ 
                    if(temp.left==null){
                        temp.left = n;
                        break;
                    }
                    temp = temp.left;
                }
                else{
                    if(temp.right==null){
                        temp.right = n;
                        break;
                    }
                    temp = temp.right;
                }
            }
        }
    }
    void inorder(Node n){
        if(n== null){
            return;
        }
        inorder(n.left);
        System.out.print(" "+n.value);
        inorder(n.right);
       
        
    }
    
    void postorder(Node n){
        if(n==null){
            return;
        }              
       postorder(n.left);
       postorder(n.right);
       System.out.print(" "+n.value);

       
    }

    void preorder(Node n){
        if(n==null){
            return;
        }   
        System.out.print(" "+n.value);           
       preorder(n.left);
       preorder(n.right);
       
    }
  public static void main(String args[]){
    bst_insertion t = new bst_insertion();
    t.insert(40);
    t.insert(10);
    t.insert(5);
    t.insert(3);
    t.insert(50);
    t.insert(90);
    t.insert(70);
    t.insert(85);
    t.inorder(t.root);
    System.out.println(" ");
    t.postorder(t.root);
     System.out.println(" ");
     t.preorder(t.root);

  }
}
class Node{
    int value;
    Node left = null, right = null;
    Node(int value){
        this.value = value;
    }
}