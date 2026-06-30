class Node {
    int data;
    Node link;

    Node(int value) {
        this.data = value;
        this.link = null;
    }
}

class LinkedList {
    Node head;  // starting node (head)

    // Insert at the beginning
    void insertAtBeginning(int value) {
        Node newNode = new Node(value);
        newNode.link = head;  // new node points to old head
        head = newNode;       // update head to new node
    }

    // Insert at the end
    void insertAtEnd(int value) {
        Node newNode = new Node(value);
        if (head == null) {  // empty list
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.link != null) { // move to last node
            temp = temp.link;
        }
        temp.link = newNode; // link last node to new node
    }

    // Insert at a given position (1-based index)
    void insertAtPosition(int value, int position) {
        if (position <= 0) {
            System.out.println("Invalid position!");
            return;
        }

        Node newNode = new Node(value);

        // Case 1: Insert at beginning
        if (position == 1) {
            newNode.link = head;
            head = newNode;
            return;
        }

        // Traverse to (position-1)th node
        Node temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.link;
        }

        if (temp == null) {
            System.out.println("Position out of range!");
            return;
        }

        // Insert new node after temp
        newNode.link = temp.link;
        temp.link = newNode;
    }

    // Display the list
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " → ");
            temp = temp.link;
        }
        System.out.println("null");
    }
}

public class Linkedlist_Inseration {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Insert at end
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.display(); // 10 → 20 → 30 → null

        // Insert at beginning
        list.insertAtBeginning(5);
        list.display(); // 5 → 10 → 20 → 30 → null

        // Insert at position
        list.insertAtPosition(15, 3); // insert 15 at 3rd position
        list.display(); // 5 → 10 → 15 → 20 → 30 → null
    }
}

