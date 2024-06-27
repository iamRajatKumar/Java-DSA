package queue;

public class MyQueue {

    private Node first;
    private Node last;
    private int length;

    //nested class node
    class Node{
        int value;
        Node next;

        //nested class node constructor
        public Node(int value){
            this.value = value;
        }
    }

    //Queue Class Constructor
    public MyQueue(int value){
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length = 1;
    }
    
    public Node getFirst() {
        return first;
    }

    public Node getLast() {
        return last;
    }

    public int getLength() {
        return length;
    }

    public void printList() {
        Node temp = first;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (length == 0) {
            System.out.println("First: null");
            System.out.println("Last: null");
        } else {
            System.out.println("First: " + first.value);
            System.out.println("Last: " + last.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nQueue:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }
    
    public void makeEmpty() {
        first = null;
        last = null;
        length = 0;
    }

    //enqueue Method → Adding elements in Queue
    public void enqueue(int value){
        Node newNode = new Node(value);
        if(length == 0){
            first =  newNode;
            last = newNode;
        }else{
            last.next = newNode;
            last = newNode;
        }
        length++;
    }


    //Dequeue method → Removing elements from Queue
    public Node dequeue(){
        if(length == 0) return null;
        Node temp = first;
        if(length == 1){
            first = null;
            last = null;
        }else{
            first = first.next;
            temp.next = null;
        }
        length--;
        return temp;
    }

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue(4);
        
        myQueue.printAll();

        /*
            EXPECTED OUTPUT:
            ----------------
            First: 4
            Last: 4
            Length: 1
            
            Queue:
            4

        */

        System.out.println("---- Enqueue Methode Output ----");
        MyQueue mQueue = new MyQueue(5);

        System.out.println("Before enqueue():");
        System.out.println("--------------");
        mQueue.printAll();

        System.out.println("\n");
        System.out.println("Adding 0 in the Queue -->");
        mQueue.enqueue(0);

        System.out.println("\n\nAfter enqueue():");
        System.out.println("-------------");
        mQueue.printAll();

        /*
            EXPECTED OUTPUT:

            Before enqueue():
            --------------
            First: 2
            Last: 2
            Length: 1

            Queue:
            2


            After enqueue():
            -------------
            First: 2
            Last: 1
            Length: 2

            Queue:
            2
            1

        */


        //Code for dequeue main
        System.out.println("--- Using Enqueue Method to add elements----");
        MyQueue deQueue = new MyQueue(2);
        deQueue.enqueue(1);
        deQueue.printAll();

        System.out.println("");
        System.out.println("--- Using Dequeue Method ----");
        // (2) Items - Returns 2 Node
        System.out.println(deQueue.dequeue().value);

        System.out.println("");
        System.out.println("--- Using Dequeue Method again----");
        // (1) Item - Returns 1 Node
        System.out.println(deQueue.dequeue().value);

        System.out.println("");
        System.out.println("--- Using Dequeue Method again to make queue Empty----");
        // (0) Items - Returns null
        System.out.println(deQueue.dequeue());


        /*
            EXPECTED OUTPUT:
            ----------------
            2
            1
            null

        */

    }



}
