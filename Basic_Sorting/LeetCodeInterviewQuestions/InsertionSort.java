package Basic_Sorting.LeetCodeInterviewQuestions;

public class InsertionSort {
    
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

    public InsertionSort(int value) {
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
            System.out.print(temp.value+ " ");
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
    
    public void insertionSort(){
        if(length < 2)
        return;
        Node sortedListHead = head;
        Node unSortedListHead = head.next;
        sortedListHead.next = null;
        while(unSortedListHead != null){
            Node current = unSortedListHead;
            unSortedListHead = unSortedListHead.next;
            if(current.value < sortedListHead.value){
                current.next = sortedListHead;
                sortedListHead = current;
            }else{
                Node searchPointer = sortedListHead;
        
        while(searchPointer.next != null && current.value > searchPointer.next.value){
            searchPointer = searchPointer.next;
        }
        current.next = searchPointer.next;
        searchPointer.next = current;
        }
        }
        head = sortedListHead;
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        tail = temp;
        
    }

    public static void main(String[] args) {
          InsertionSort myLinkedList = new InsertionSort(4);
        myLinkedList.append(2);
        myLinkedList.append(6);
        myLinkedList.append(5);
        myLinkedList.append(1);
        myLinkedList.append(3);


        System.out.println("Unsorted Linked List:");
        myLinkedList.printList();

        myLinkedList.insertionSort();

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
