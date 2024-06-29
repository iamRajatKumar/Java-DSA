package Sorting.LeetCodeInterviewQuestions;

public class BubbleSort {
    
    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public BubbleSort(int value) { //LinkedList structure for Bubblesort
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }

    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }
    
    void bubbleSort(){
        if(this.length < 2)
        return;
        Node SortedUntil = null;
        while (SortedUntil != this.head.next){
            Node current = this.head;
            while(current.next != SortedUntil){
                Node nextNode = current.next;
                if(current.value > nextNode.value){
                    int temp = current.value;
                    current.value = nextNode.value;
                    nextNode.value = temp;
                }
                current = current.next;
            }
            SortedUntil = current;
        }
    }

    public static void main(String[] args) {
        BubbleSort myLinkedList = new BubbleSort(4);
        myLinkedList.append(2);
        myLinkedList.append(6);
        myLinkedList.append(5);
        myLinkedList.append(1);
        myLinkedList.append(3);



        System.out.println("Unsorted Linked List:");
        myLinkedList.printList();

        myLinkedList.bubbleSort();

        System.out.println("\nSorted Linked List:");
        myLinkedList.printList();



        /*
            EXPECTED OUTPUT:
            ----------------
            Unsorted Linked List:
            4
            2
            6
            5
            1
            3
            
            Sorted Linked List:
            1
            2
            3
            4
            5
            6

        */
    }
}
