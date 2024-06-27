package stack;

public class Stack {
    
    private Node top;
    private int height;

    //class node
    class Node{
        int value;
        Node next;

        //node class constructor
        Node (int value){
            this.value = value;
        }

    }

    //stack class constructor
    public Stack(int value){
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }

    public Node getTop() {
        return top;
    }

    public int getHeight() {
        return height;
    }

    public void printStack() {
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (height == 0) {
            System.out.println("Top: null");
        } else {
            System.out.println("Top: " + top.value);
        }
        System.out.println("Height:" + height);
        System.out.println("\nStack:");
        if (height == 0) {
            System.out.println("empty");
        } else {
            printStack();
        }
    }
    
    public void makeEmpty() {
        top = null;
        height = 0;
    }

    //Push method
    public void push(int value){
        Node newNode = new Node(value);
        if(height == 0) top = newNode;
        if(height > 0){
            newNode.next = top;
            top = newNode;
        }
        height++;
    }

    //Pop method
    public Node pop(){
        if(height == 0) return null;
        Node temp = top;
        top = top.next;
        temp.next = null;
        height--;
        return temp;
    }
    
    public static void main(String args[]){
        Stack stack = new Stack(4); //for constructor code
        stack.printAll();


        System.out.println("Before push():");
        System.out.println("--------------");
        stack.printAll();

        stack.push(1);

        System.out.println("\n\nAfter push():");
        System.out.println("-------------");
        stack.printAll();
        System.out.println(" ");
        System.out.println("Pop Elements from Stack");
        // (2) Items - Returns 1 Node
        System.out.println(stack.pop().value);
        // (1) Item - Returns 4 Node
        System.out.println(stack.pop().value);
        // (0) Items - Returns null
        System.out.println(stack.pop());


        /*
            EXPECTED OUTPUT:
            ----------------
            1
            4
            null

        */

    }
}
