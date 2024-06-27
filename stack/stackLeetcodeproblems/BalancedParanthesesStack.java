package stack.stackLeetcodeproblems;

import java.util.ArrayList;
import java.util.Stack;

public class BalancedParanthesesStack<T> {
    
    private ArrayList<T> stackList = new ArrayList<>();

    public ArrayList<T> getStackList(){
        return stackList;
    }

    public void printStack(){
        for(int i= stackList.size() -1; i>=0; i--){
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
            return stackList.get(stackList.size() -1);
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

    //Code to check if parantheses is balanced or not in Stack
    public static boolean isBalancedParantheses(String Parantheses){
        Stack<Character> stack = new Stack<>();
        for( char p : Parantheses.toCharArray()){
            if(p == '('){
                stack.push(p);
            }
            else if(p == ')'){
                if(stack.isEmpty() || stack.pop() != '('){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        testAndPrint("()",true);
        testAndPrint("()()", true);
        testAndPrint("(())", true);
        testAndPrint("()()()", true);
        testAndPrint("(()())", true);
        testAndPrint(")()(", false);
        testAndPrint(")(", false);
        testAndPrint("(()", false);
        testAndPrint("))", false);
        testAndPrint("(", false);
        testAndPrint(")", false);
    }

    private static void testAndPrint(String string, boolean b) {
        
        boolean result = isBalancedParantheses(string);
        System.out.println("Test String : "+string);
        System.out.println("Expected : " +b); //b is expected value
        System.out.println("Result : "+result);

        if(result == b){
            System.out.println("STATUS: Passed");
        }else{
            System.out.println("STATUS : Failed");
        }

        System.out.println("----------------------");
    }

    
}
