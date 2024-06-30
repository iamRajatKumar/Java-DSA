package basicSorting.LeetCodeInterviewQuestions;

public class SelectionSort {

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

    public SelectionSort(int value) { //LinkedList structure for SelectionSort
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
            System.out.print(temp.value+" ");
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
    
    void selectionSort(){
        if(this.length < 2)
            return;
        Node current = this.head;
        while(current.next != null){
            Node smallest = current;
            Node innerCurrent = current.next;
            while(innerCurrent != null){
               if(innerCurrent.value < smallest.value){
                  smallest = innerCurrent;
               }
            innerCurrent = innerCurrent.next;
            }
            if(smallest != current){
                int temp = current.value;
                current.value = smallest.value;
                smallest.value = temp;
            }
            current = current.next;
        }
    }

    public static void main(String[] args) {
        SelectionSort myLinkedList = new SelectionSort(4);
        myLinkedList.append(2);
        myLinkedList.append(6);
        myLinkedList.append(5);
        myLinkedList.append(1);
        myLinkedList.append(3);



        System.out.println("Unsorted Linked List:");
        myLinkedList.printList();

        myLinkedList.selectionSort();

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