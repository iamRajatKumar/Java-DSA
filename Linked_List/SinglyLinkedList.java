package Linked_List;

public class SinglyLinkedList {
    
    private ListNode head;

    private static class ListNode {
    private int data; //Generic Type
    private ListNode next; // Listnode next object should be Null       

    //constructor code
    public ListNode(int data){
        this.data = data;
        this.next = null;
       }
    }
    
    public void display(){
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
    //Counting elements of singly linked List
    public int lengthOfSinglyLinkedList(){
        if(head == null)
        {
            return 0;
        }
        int count = 0;
        ListNode current = head;
        while(current!= null){
            count++;
            current = current.next;
        }
        return count;
    }

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.head = new ListNode(10);           //inserting data in head node
        ListNode second = new ListNode(2);     //inserting data in second node
        ListNode third = new ListNode(8);      //inserting data in third node
        ListNode fourth = new ListNode(25);    ////inserting data in fourth node
        
        //Now we will connect together to form a chain
        sll.head.next = second; //10 → 2
        second.next = third;    //10 → 2 → 8
        third.next =  fourth;   //10 → 2 → 8 → 25 → null
        //printing code
        sll.display();
        System.out.println("Lenght of Singly Linked List : "+ sll.lengthOfSinglyLinkedList());
    }

}
