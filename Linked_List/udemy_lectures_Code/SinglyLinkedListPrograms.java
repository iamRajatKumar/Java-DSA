package Linked_List.udemy_lectures_Code;

public class SinglyLinkedListPrograms {

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

    //Constructor code
    public SinglyLinkedListPrograms(int value) {
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

    //for Printing Node
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    //for Printing All
    public void printAll() {
        if (length == 0) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nLinked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }
    
    //Making Linked List empty
    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
    }

    //Adding node at the end of the LinkedList
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

    //Remove Last node from the singly Linked List
    public Node removeLast() {
        if (length == 0) return null;
        Node temp = head;
        Node pre = head;
        while(temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }

    //Adding node at the starting of the LinkedList
    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    //Removing first node from the LinkedList
    public Node removeFirst() {
        if (length == 0) return null;
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if (length == 0) {
            tail = null;
        }
        return temp;
    }

    //getting node index value from the Linked list
    public Node get(int index) {
        if (index < 0 || index >= length) return null;
        Node temp = head;
        for(int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    //Changing the value of the Linked list using index value
    public boolean set(int index, int value) {
        Node temp = get(index);
        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }

    //Inserting value at the given index of the Linked List
    public boolean insert(int index, int value)  {
        if (index < 0 || index > length) return false;
        if (index == 0) {
            prepend(value);
            return true;
        }
        if (index == length) {
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node temp = get(index - 1);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }

    //Removing value at the given index of the Linked list
    public Node remove(int index) {
        if (index < 0 || index >= length) return null;
        if (index == 0) return removeFirst();
        if (index == length - 1) return removeLast();

        Node prev = get(index - 1);
        Node temp = prev.next;

        prev.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }

    //Reversing the Linked List
	public void reverse(){
	   Node temp = head;
	   head = tail;
	   tail = temp;
	   Node after = temp.next;
	   Node before = null;
	   for(int i = 0; i < length; i++){
	       after = temp.next;
	       temp.next =  before;
	       before= temp;
	       temp = after;
	   }
	}



    //Main method 
   
    public static void main(String[] args) {
        
        //Constructor Code for SinglyLinkedList
        System.out.println("constructor:");
        SinglyLinkedListPrograms myLinkedList = new SinglyLinkedListPrograms(4);
        
        myLinkedList.printAll();
        

        /*
            EXPECTED OUTPUT:
            ----------------
            Head: 4
            Tail: 4
            Length: 1
            
            Linked List:
            4

        */

        //Append in LinkedList
        System.out.println("Append");
        SinglyLinkedListPrograms appendLinkedList = new SinglyLinkedListPrograms(1);
        appendLinkedList.makeEmpty();
        appendLinkedList.append(1);
        appendLinkedList.append(2);


        appendLinkedList.printAll();
        
        
        /*
       		EXPECTED OUTPUT:
        	----------------
        	Head: 1
        	Tail: 2
        	Length: 2
        
        	Linked List:
        	1
        	2
        
     	*/
        
        //Remove Last in Linked List  
        System.out.println("Remove Last");  
		SinglyLinkedListPrograms RemoveLast = new SinglyLinkedListPrograms(1);
        RemoveLast.append(2);
        

        // (2) Items - Returns 2 Node
        System.out.println(RemoveLast.removeLast().value);
        // (1) Item - Returns 1 Node
        System.out.println(RemoveLast.removeLast().value);
        // (0) Items - Returns null
        System.out.println(RemoveLast.removeLast());
        
        
    	/*
        	EXPECTED OUTPUT:
        	----------------
        	2
        	1
        	null

     	*/

        //Prepend Node in Linked List
        System.out.println("Prepend");
        SinglyLinkedListPrograms prependNode = new SinglyLinkedListPrograms(2);
        prependNode.append(3);

        System.out.println("Before prepend():");
        System.out.println("-----------------");
        prependNode.printAll();

        prependNode.prepend(1);

        System.out.println("\n\nAfter prepend():");
        System.out.println("----------------");
        prependNode.printAll();

        
        /*
            EXPECTED OUTPUT:
    
            Before prepend():
            -----------------
            Head: 2
            Tail: 3
            Length: 2
    
            Linked List:
            2
            3
    
    
            After prepend():
            ----------------
            Head: 1
            Tail: 3
            Length: 3
    
            Linked List:
            1
            2
            3

        */


        //Remove First node from Linked List
        System.out.println("Remove First");
        SinglyLinkedListPrograms removeFirstNode = new SinglyLinkedListPrograms(2);
        removeFirstNode.append(1);
       
        // (2) Items - Returns 2 Node
        System.out.println(removeFirstNode.removeFirst().value);
        // (1) Item - Returns 1 Node
        System.out.println(removeFirstNode.removeFirst().value);
        // (0) Items - Returns null
        System.out.println(removeFirstNode.removeFirst());


        /*
            EXPECTED OUTPUT:
            ----------------
            2
            1
            null

        */

        //Get Linked list index value
        System.out.println("get Index");
        SinglyLinkedListPrograms getmyLinkedList = new SinglyLinkedListPrograms(0);
        getmyLinkedList.append(1);
        getmyLinkedList.append(2);
        getmyLinkedList.append(3);


        System.out.println(getmyLinkedList.get(3).value);


        /*
            EXPECTED OUTPUT:
            ----------------
            3

        */


        //Set Linked list main program
        System.out.println("Set value at given index");
        SinglyLinkedListPrograms setmyLinkedList = new SinglyLinkedListPrograms(0);
        setmyLinkedList.append(1);
        setmyLinkedList.append(2);
        setmyLinkedList.append(3);

        System.out.println("Linked List before set():");
        setmyLinkedList.printList();

        setmyLinkedList.set(2, 99);

        System.out.println("\nLinked List after set():");
        setmyLinkedList.printList();

        
        /*
            EXPECTED OUTPUT:
            ----------------
            Linked List before set():
            0
            1
            2
            3
            
            Linked List after set():
            0
            1
            99
            3

        */

        //Insertion into Linked List
        System.out.println("Insert into SLL");
        SinglyLinkedListPrograms insertmyLinkedList = new SinglyLinkedListPrograms(1);
        insertmyLinkedList.append(3);

        System.out.println("LL before insert():");
        insertmyLinkedList.printList();

        insertmyLinkedList.insert(1, 2);

        System.out.println("\nLL after insert(2) in middle:");
        insertmyLinkedList.printList();

        insertmyLinkedList.insert(0, 0);

        System.out.println("\nLL after insert(0) at beginning:");
        insertmyLinkedList.printList();

        insertmyLinkedList.insert(4, 4);

        System.out.println("\nLL after insert(4) at end:");
        insertmyLinkedList.printList();


        /*
            EXPECTED OUTPUT:
            ----------------
            LL before insert():
            1
            3

            LL after insert(2) in middle:
            1
            2
            3

            LL after insert(0) at beginning:
            0
            1
            2
            3

            LL after insert(4) at end:
            0
            1
            2
            3
            4

        */

        //Remove Main code
        System.out.println("Remove Code Input & Output");
        SinglyLinkedListPrograms removemyLinkedList = new SinglyLinkedListPrograms(1);
        removemyLinkedList.append(2);
        removemyLinkedList.append(3);
        removemyLinkedList.append(4);
        removemyLinkedList.append(5);

        System.out.println("LL before remove():");
        removemyLinkedList.printList();

        System.out.println("\nRemoved node:");
        System.out.println(removemyLinkedList.remove(2).value);
        System.out.println("LL after remove() in middle:");
        removemyLinkedList.printList();

        System.out.println("\nRemoved node:");
        System.out.println(removemyLinkedList.remove(0).value);
        System.out.println("LL after remove() of first node:");
        removemyLinkedList.printList();

        System.out.println("\nRemoved node:");
        System.out.println(removemyLinkedList.remove(2).value);
        System.out.println("LL after remove() of last node:");
        removemyLinkedList.printList();


        /*
            EXPECTED OUTPUT:
            ----------------
            LL before remove():
            1
            2
            3
            4
            5

            Removed node:
            3
            LL after remove() in middle:
            1
            2
            4
            5

            Removed node:
            1
            LL after remove() of first node:
            2
            4
            5

            Removed node:
            5
            LL after remove() of last node:
            2
            4

        */

       
       // reversing singly linked list
        System.out.println("Reverse Code Input & Output");
        SinglyLinkedListPrograms reversemyLinkedList = new SinglyLinkedListPrograms(1);
        reversemyLinkedList.append(2);
        reversemyLinkedList.append(3);
        reversemyLinkedList.append(4);

        System.out.println("LL before reverse():");
        reversemyLinkedList.printList();

        reversemyLinkedList.reverse();

        System.out.println("\nLL after reverse():");
        reversemyLinkedList.printList();
        

        /*
            EXPECTED OUTPUT:
            ----------------
            LL before reverse():
            1
            2
            3
            4
            
            LL after reverse():
            4
            3
            2
            1

        */

    }

}


