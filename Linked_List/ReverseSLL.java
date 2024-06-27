package Linked_List;

public class ReverseSLL {
    
    //private ListNode head;

    private static class ListNode {
    private int data; //Generic Type
    private ListNode next; // Listnode next object should be Null       

    //constructor code
    public ListNode(int data){
        this.data = data;
        this.next = null;
       }
    }
    
    public void display(ListNode head){
        ListNode current = head;
        //int count = 0;              //for counting length of singly Linked List
        while (current!=null) {
            System.out.print(current.data + " --> ");
            //count++;                // if ListNode head = 0 or null then count will be 0
            current = current.next;
        }
        System.out.println("null ");
        //System.out.print("Length of Singly LinkedList is : "+count);
    }

    //code to reverse SLL
    public ListNode reverse(ListNode head){
        if(head == null) return head;
        
        ListNode current = head;        // Initialize current point to head i.e., current = head = 10
        ListNode previous = null;       // Initialize previous = null
        ListNode next = null;           // Initialize next = null 
        while(current != null){         // Current != null
            next = current.next;        //next = current.next i.e., current = 10, current.next = 8 therefore next = 8;
            current.next = previous;    //previous = null and current.next point to 8 by this current.next point to null
            previous = current;         //current = 10 and previous = null; previous = current will point previous to 10 i.e. previous = 10
            current = next;             //next = 8 and current = 10 so now current = next by now current will point to 8 i.e., current = 8
        }                               // And this loop continues until current = null and reaches end of the linked list
        return previous;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(10);           //inserting data in head node
        ListNode second = new ListNode(8);     //inserting data in second node
        ListNode third = new ListNode(1);      //inserting data in third node
        ListNode fourth = new ListNode(11);    ////inserting data in fourth node
        
        //Now we will connect together to form a chain
        head.next = second;     //10 → 8
        second.next = third;    //10 → 8 → 1
        third.next =  fourth;   //10 → 8 → 1 → 11 → null
        //printing code
        ReverseSLL searchElementSLL= new ReverseSLL();
        searchElementSLL.display(head);
        ListNode reverse = searchElementSLL.reverse(head);
        searchElementSLL.display(reverse);
    }

}
