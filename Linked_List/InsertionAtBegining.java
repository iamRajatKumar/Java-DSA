package Linked_List;

public class InsertionAtBegining {
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
        while (current!=null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    public void insertFirst(int value){
        ListNode newNode= new ListNode(value); //constructor of Listnode value
        newNode.next = head;
        head = newNode;
    }

    public static void main(String[] args) {
        InsertionAtBegining sll = new InsertionAtBegining();
        sll.insertFirst(11); //method to insert data
        sll.insertFirst(25);
        //sll.insertFirst(50);
        sll.display();
    }
}