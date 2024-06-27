package Linked_List;

public class InsertionAtEnd {
    
    private ListNode head;
    
    public static class ListNode{
        private int data;
        private ListNode next;
        
        //constructor code
        public ListNode(int data){
            this.data = data;
            this.next = null;
        }

    }

    //method for display singly Linked List
    public void display(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data + " -> ");
            current= current.next;
        }
        System.out.println("null");
    }

    public void insertLast(int value){
        ListNode newNode = new ListNode(value);
        if(head == null){
            head =  newNode;
            return;
        }
        ListNode current = head;
        while(null != current.next){
            current = current.next;
        }
        current.next = newNode;
    }

    public static void main(String[] args) {
        InsertionAtEnd sllEnd = new InsertionAtEnd();
        sllEnd.insertLast(10);
        sllEnd.insertLast(25);
        sllEnd.insertLast(50);
        sllEnd.display();
    }

}
