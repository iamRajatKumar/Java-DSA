package Linked_List.LeetCode.SinglyLinkedList;


public class KthNodeFromEnd {

    private Node head;
    private Node tail;
    
    class Node {
        int value;
        Node next;
    
        Node(int value) {
                this.value = value;
            }
        }
    
    public KthNodeFromEnd(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        }
    
        public Node getHead() {
            return head;
        }
    
        public Node getTail() {
            return tail;
        }
    
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
    
        public Node findKthFromEnd(int k) {
            Node slow = head; // Initialize slow pointer at head
            Node fast = head; // Initialize fast pointer at head
         
            // Move fast pointer k steps ahead
            for (int i = 0; i < k; i++) {
                if (fast == null) { // If k is out of bounds, return null
                    return null;
                }
                fast = fast.next; // Move the fast pointer to the next node
            }
         
            // Move both pointers until fast reaches the end
            while (fast != null) {
                slow = slow.next; // Move the slow pointer to the next node
                fast = fast.next; // Move the fast pointer to the next node
            }
         
            return slow; // Return the kth node from the end (slow pointer)
        }


    //main method
     public static void main(String[] args) {
        KthNodeFromEnd myLinkedList = new KthNodeFromEnd(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.append(5);

        int k = 2;
        int result = myLinkedList.findKthFromEnd(k).value;

        System.out.println(result); // Output: 4

        k = 4;
        result = myLinkedList.findKthFromEnd(k).value;

        System.out.println(result); // Output: 4

        /*
            EXPECTED OUTPUT:
            ----------------
            4
            
        */
        
    }
    
        
}
    
 
