package stack.stackLeetcodeproblems;

import java.util.ArrayList;

public class PushMethodwithArrayList<T> {
 
    private ArrayList<T> stackList = new ArrayList<>();
    
    public ArrayList<T> getStacArrayList(){
        return stackList;
    }

    public void printStack(){
        for(int i = stackList.size()-1; i>=0; i--){
            System.out.println(stackList.get(i));
        }
    }

    public boolean isEmpty(){
        return stackList.size() == 0;
    }

    public T peek(){
        if(isEmpty()){
            return null;
        }else{
            return stackList.get(stackList.size()-1);
        }
    }

    public int size(){
        return stackList.size();
    }

    //Push Method for ArrayList 
    public void push(T value){
        stackList.add(value);
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) {
        PushMethodwithArrayList myStack = new PushMethodwithArrayList<>();
        myStack.push(1);
        myStack.push(5);
        myStack.push(9);

        myStack.printStack();

    }


}
