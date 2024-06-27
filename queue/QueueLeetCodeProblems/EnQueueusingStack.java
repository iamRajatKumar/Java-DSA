package queue.QueueLeetCodeProblems;

import java.util.Stack;

public class EnQueueusingStack {
    
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public EnQueueusingStack(){
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    //MEthod to Add new element is Queue using Stack
    public void enqueue(int value){
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        stack1.push(value);
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    public int peek(){
        return stack1.peek();
    }

    public boolean isEmpty(){
        return stack1.isEmpty();
    }

    //main method
    public static void main(String[] args) {
      EnQueueusingStack queue = new EnQueueusingStack();
      
      queue.enqueue(1);
      queue.enqueue(2);
      queue.enqueue(3);
       // Output the front of the queue
       System.out.println("Front of the queue: " + queue.peek());

       // Check if the queue is empty
       System.out.println("Is the queue empty? " + queue.isEmpty());


       /*
           EXPECTED OUTPUT:
           ----------------
           Front of the queue: 1
           Is the queue empty? false

       */
    }
}

