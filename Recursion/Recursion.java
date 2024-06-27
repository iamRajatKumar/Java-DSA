package Recursion;

public class Recursion {

//Rescursion is a method which call itself unless and until it returns some values
//Resursion has two type of Case 
//1. Recusrive Case which is used to call the same method again and again
//2. Base Case this occurs when we get any value from the recusrive code.
//Stackoverflow happens when Recursive case calls itself again and again.

    public static void methodThree(){
        System.out.println("Three");
    }

    public static void methodTwo() {
        methodThree();
        System.out.println("Two");
    }

    public static void methodOne(){
        methodTwo();
        System.out.println("One");
    }

    public static void main(String[] args) {
        methodOne();
    }

}
