package Linked_List.LeetCode.SinglyLinkedList;

//import java.util.LinkedList;

public class FindMiddleNode {
    
    private Node head;
    private Node tail;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        
        FindMiddleNode myLinkedList = new FindMiddleNode(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.append(5);
        

        System.out.println("1 -> 2 -> 3 -> 4 -> 5");
        System.out.println( "Middle Node: "+ myLinkedList.findMiddleNode().value);
        
        
        myLinkedList.append(6);
        
        
        System.out.println("===========================");
        System.out.println("1 -> 2 -> 3 -> 4 -> 5 -> 6");
        System.out.println( "Middle Node: "+ myLinkedList.findMiddleNode().value);


        /*
            EXPECTED OUTPUT:
            ----------------
            1 -> 2 -> 3 -> 4 -> 5
            Middle Node: 3
            ===========================
            1 -> 2 -> 3 -> 4 -> 5 -> 6
            Middle Node: 4

        */
    }

    //Constructor Code
    public FindMiddleNode(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
    }
    //for getting head value
    public Node getHead() {
        return head;
    }

    //for getting tail value
    public Node getTail() {
        return tail;
    }

    //Method for print in LinkedList
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (head == null) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("\nLinked List:");
        if (head == null) {
            System.out.println("empty");
        } else {
            printList();
        }
    }
    
    public void makeEmpty() {
        head = null;
        tail = null;
    }

    //append method for adding elements in Last 
    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }


    //Method to find middle element
    public Node findMiddleNode() {
    // Initialize slow pointer to the head of the linked list
    Node slow = head;
 
    // Initialize fast pointer to the head of the linked list
    Node fast = head;
 
    // Traverse the linked list with two pointers: slow and fast
    // slow moves one node at a time, while fast moves two nodes at a time
    while (fast != null && fast.next != null) {
        // Move slow pointer to the next node
        slow = slow.next;
 
        // Move fast pointer to the next two nodes
        fast = fast.next.next;
    }
 
    // Return the Node object representing the middle node of the linked list
    return slow;
}
    
}
