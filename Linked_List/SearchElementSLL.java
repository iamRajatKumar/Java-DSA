package Linked_List;

public class SearchElementSLL {
    
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
     public boolean find(ListNode head, int searchkey){
        if(head == null){
            return false;
        }
        ListNode current = head;
        while (current != null) {
            if(current.data == searchkey){
                return true;
            }
            current = current.next;
        }
        return false;
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
        SearchElementSLL searchElementSLL= new SearchElementSLL();
        searchElementSLL.display(head);

        if(searchElementSLL.find(head, 5)) {
            System.out.println("Search key found !!!");
        }else{
            System.out.println("Search key not found !!!");
        }
        
    }
    
}
