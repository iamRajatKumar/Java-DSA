package Linked_List.LeetCode.DoublyLinkedList;

public class SwapDLL {

        private Node head;
        private int length;
    
        class Node {
            int value;
            Node next;
            Node prev;
    
            Node(int value) {
                this.value = value;
            }
        }
    
        public SwapDLL(int value) {
            Node newNode = new Node(value);
            head = newNode;
            length = 1;
        }
    
        public Node getHead() {
            return head;
        }
    
        public int getLength() {
            return length;
        }
    
        public void printList() {
            StringBuilder output = new StringBuilder();
            Node temp = head;
            while (temp != null) {
                output.append(temp.value);
                if (temp.next != null) {
                    output.append(" <-> ");
                }
                temp = temp.next;
            }
            System.out.println(output.toString());
        }
        
        public void makeEmpty() {
            head = null;
            length = 0;
        }
        
        public void append(int value) {
            Node newNode = new Node(value);
            if (length == 0) {
                head = newNode;
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
                newNode.prev = current;
            }
            length++;
        }
    
        public void swapPairs(){
            Node dummyNode = new Node(0);
            dummyNode.next = head;
            Node previousNode = dummyNode;
            while(head != null && head.next != null){
                Node firstNode = head;
                Node secondNode = head.next;
                previousNode.next = secondNode;
                firstNode.next = secondNode.next;
                secondNode.next = firstNode;
                
                secondNode.prev = previousNode;
                firstNode.prev = secondNode;
                
                if(firstNode.next != null){
                    firstNode.next.prev = firstNode;
                }
                
                head = firstNode.next;
                previousNode = firstNode;
            }
            head = dummyNode.next;
            if(head!= null) head.prev = null;
        }

        public static void main(String[] args) {
        SwapDLL myDll = new SwapDLL(1);
        myDll.append(2);
        myDll.append(3);
        myDll.append(4);

        System.out.println("myDll before swapPairs:");
        myDll.printList();

        myDll.swapPairs();

        System.out.println("\nmyDll after swapPairs:");
        myDll.printList();

        /*
            EXPECTED OUTPUT:
            ----------------
            myDll before swapPairs:
            1 <-> 2 <-> 3 <-> 4
            
            myDll after swapPairs:
            2 <-> 1 <-> 4 <-> 3

        */

        }
        
 
    
    
}