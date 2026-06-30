public class LL_Doubly {
    Node head=null,tail=null;
    void add_end(int data){
        Node n=new Node(data);
        if(head==null){
            head=tail=n;
        }else{
            tail.next=n;
            n.prev=tail;
            tail=n;
        }
    }
    void add_beg(int data){
        Node n=new Node(data);
        if(head==null)
        head=tail=n;
        else{
            n.next=head;
            head.prev=n;
            head=n;
        }
    }
    void del_end(){
        if(head==null)
        System.out.print("No elements to delete");
        else if(head.next==null)
        head=null;
        else{
            tail=tail.prev;
            tail.next=null;
        }

    }
    void display(){
        if(head==null){
            System.out.println("No element to display");
        }else{
            Node t= head;
            while(t!=null){
                System.out.print(t.data+ " ");
                t=t.next;
            }
        }
    }
    void reverse(){
        Node t=tail;
        while(t!=null){
            System.out.print(t.data+" ");
            t=t.prev;
        }
    }
    void sort(){
        if(head==null)
        return;
        else{
            Node a=head;
            while(a.next!=null){
                Node m=a;
                while(m!=null){
                    if(a.data>m.data){
                        int t=a.data;
                        a.data=m.data;
                        m.data=t;
                    }
                    m=m.next;
                }
                a=a.next;
            }
        }
    }
    public static void main(String args[]){
        DL d=new DL();
        d.add_end(10);
        d.add_end(20);
        d.add_end(30);
        d.display();
        d.add_beg(50);
        System.out.println();
        d.display();
        System.out.println();
        d.reverse();
        System.out.println();
        d.sort();
        d.display();

    }
}
class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}