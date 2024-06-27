package Linked_List.udemy_lectures_Code.DoublyLinkedList;

public class DoublyLinkedList {
    
    private Node head;
    private Node tail;
    private int length;

    //Node class
    class Node{
        int value;
        Node next;
        Node prev;
    
        //comstructor 
        Node(int value){
            this.value = value;
        }
    }

    //Doubly LL method
    public DoublyLinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList(){
        Node temp = head;
        while (temp!= null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void getHead(){
        System.out.println("Head : "+head.value);
    }

    public void getTail(){
        System.out.println("Tail : "+tail.value);
    }
    public void getLength(){
        System.out.println("Length : " +length);
    }

    public void printAll() {
        if (length == 0) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nDoubly Linked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }
    
    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
    }


    //append method

    public void append(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }

    //Method for Remove Last in DLL
    public Node removeLast(){
        if(length == 0) return null;
        Node temp = tail;
        if(length == 1){
            head = null;
            tail = null;
        }else{
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }
        length--;
        return temp;
    }

    //adding first elemnet in the linked List
    public void prepend(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        length++;
    }

    //Remove first Node from a LinkedList
    public Node removeFirst(){
        if(length == 0) return null;
        Node temp = head;
        if(length == 1){
            head = null;
            tail = null; 
        }else{
            head = head.next;
            head.prev = null;
            temp.next = null;
        }
        length--;
        return temp;
    }

    //get index value method
    public Node get(int index){
        if(index < 0 || index >= length) return null;
        Node temp = head;
        if(index < length/2){
            for(int i = 0; i<index; i++) 
            temp = temp.next;
        }else{
            temp = tail;
            for(int i =length -1; i> index; i--){
                temp = temp.prev;
            }
        }
        return temp;
    }

    //set
    public boolean set(int index, int value){
        Node temp = get(index);
        if(temp != null){
            temp.value = value;
            return true;
        }
        return false;
    }

    //insertion code
    public boolean insert(int index, int value)
    {
        if(index < 0 || index > length) return false;
        if(index == 0){
            prepend(value);
            return true;
        }
        if(index == length){
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node before = get(index - 1);
        Node after = before.next;
        before.next = newNode;
        after.prev = newNode;
        newNode.prev = before;
        newNode.next = after;
        length++;
        return true;
    }

    //remove method

    public Node remove(int index){
        if(index < 0 || index >= length) return null;
        if(index == 0) return removeFirst();
        if(index == length-1) return removeLast();
        Node temp = get(index);
        temp.next.prev = temp.prev;
        temp.prev.next = temp.next;
        temp.next = null;
        temp.prev = null;
        length--;
        return temp;
    }




    //Main method
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList(1);
        
        // doublyLinkedList.getHead();
        // doublyLinkedList.getTail();
        // doublyLinkedList.getLength();
        doublyLinkedList.append(2);
        //doublyLinkedList.append(value);
        doublyLinkedList.printList();

        // (2) Items - Returns 2 Node
        System.out.println(doublyLinkedList.removeLast().value);
        // (1) Item - Returns 1 Node
        System.out.println(doublyLinkedList.removeLast().value);
        // (0) Items - Returns null
        System.out.println(doublyLinkedList.removeLast());
        
        
    	/*
        	EXPECTED OUTPUT:
        	----------------
        	2
        	1
        	null

     	*/
        
         DoublyLinkedList doublyLinkedList2 = new DoublyLinkedList(2);
         doublyLinkedList2.append(3);

         System.out.println("Before prepend():");
         System.out.println("-----------------");
         doublyLinkedList2.printAll();
 
         doublyLinkedList2.prepend(1);
 
         System.out.println("\n\nAfter prepend():");
         System.out.println("----------------");
         doublyLinkedList2.printAll();
         
         
         /*
             EXPECTED OUTPUT:
     
             Before prepend():
             -----------------
             Head: 2
             Tail: 3
             Length: 2
     
             Doubly Linked List:
             2
             3
     
     
             After prepend():
             ----------------
             Head: 1
             Tail: 3
             Length: 3
     
             Doubly Linked List:
             1
             2
             3
 
         */
         
        //RemoveFirst
        DoublyLinkedList removeFirstmyDLL = new DoublyLinkedList(2);
        removeFirstmyDLL.append(1);
        
        removeFirstmyDLL.printList();
        // (2) Items - Returns 2 Node
        System.out.println(removeFirstmyDLL.removeFirst().value);
        // (1) Item - Returns 1 Node
        //System.out.println(myDLL.removeFirst().value);
        // (0) Items - Returns null
        //System.out.println(myDLL.removeFirst());


        /*
            EXPECTED OUTPUT:
            ----------------
            2 -> 1 -> null
            remove first node i.e. 2
            output : 1 -> null

        */
        removeFirstmyDLL.printList();
        System.out.println("\n"); //for next line better code output look

        //GET Method output
        System.out.println("GET Method output");
        
        DoublyLinkedList myDLL = new DoublyLinkedList(0);
        myDLL.append(5);
        myDLL.append(9);
        myDLL.append(1225);

        myDLL.printList();
        System.out.println("value at index 1: " + myDLL.get(1).value);
        System.out.println("value at index 3: "+ myDLL.get(3).value + "\n");
        
        //insert method output
        DoublyLinkedList insertDLLNode = new DoublyLinkedList(1);
        insertDLLNode.append(3);

        System.out.println("DLL before insert():");
        insertDLLNode.printList();

        insertDLLNode.insert(1, 2);

        System.out.println("\nDLL after insert(2) in middle:");
        insertDLLNode.printList();

        insertDLLNode.insert(0, 0);

        System.out.println("\nDLL after insert(0) at beginning:");
        insertDLLNode.printList();

        insertDLLNode.insert(4, 4);

        System.out.println("\nDLL after insert(4) at end:");
        insertDLLNode.printList();


        /*
            EXPECTED OUTPUT:
            ----------------
            DLL before insert():
            1
            3

            DLL after insert(2) in middle:
            1
            2
            3

            DLL after insert(0) at beginning:
            0
            1
            2
            3

            DLL after insert(4) at end:
            0
            1
            2
            3
            4

        */

        DoublyLinkedList removeDLL = new DoublyLinkedList(1);
        removeDLL.append(2);
        removeDLL.append(3);
        removeDLL.append(4);
        removeDLL.append(5);

        System.out.println("DLL before remove():");
        removeDLL.printList();

        System.out.println("\nRemoved node:");
        System.out.println(removeDLL.remove(2).value);
        System.out.println("DLL after remove() in middle:");
        removeDLL.printList();

        System.out.println("\nRemoved node:");
        System.out.println(removeDLL.remove(0).value);
        System.out.println("DLL after remove() of first node:");
        removeDLL.printList();

        System.out.println("\nRemoved node:");
        System.out.println(removeDLL.remove(2).value);
        System.out.println("DLL after remove() of last node:");
        removeDLL.printList();


        /*
            EXPECTED OUTPUT:
            ----------------
            DLL before remove():
            1
            2
            3
            4
            5

            Removed node:
            3
            DLL after remove() in middle:
            1
            2
            4
            5

            Removed node:
            1
            DLL after remove() of first node:
            2
            4
            5

            Removed node:
            5
            DLL after remove() of last node:
            2
            4

        */


        
    }

}
