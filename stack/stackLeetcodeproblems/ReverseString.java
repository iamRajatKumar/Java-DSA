package stack.stackLeetcodeproblems;

import java.util.ArrayList;
import java.util.Stack;

public class ReverseString<T> {
    
    private ArrayList<T> stackList = new ArrayList<>();

    public ArrayList<T> getStackList() {
        return stackList;
    }
    
    public void printStack(){
        for(int i = stackList.size() - 1; i >=0; i--){
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

    public void push(T value){
        stackList.add(value);
    }

    public T pop(){
        if(isEmpty()) return null;
        return stackList.remove(stackList.size() - 1);
    }

    //Code inside main class to reverse String present inside Stack
    public static String reverseString(String myString) {
        Stack<Character> stack = new Stack<>();
        String reversedString = "";
        for(char c : myString.toCharArray()){
            stack.push(c);
        }
        while (!stack.isEmpty()) {
            reversedString += stack.pop();
        }
        return reversedString;
    }

    public static void main(String[] args) {
        String myString = "Hello";
        System.out.println("String before Reverse : "+myString);
        String reversedString = reverseString(myString);
        System.out.println("String after Reverse: "+reversedString);
    }

}
