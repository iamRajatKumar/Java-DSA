package TimeComplexity;

//import java.util.Scanner;

public class BigOofN {
    public static void main(String[] args) {
        // System.out.println("Enter the numbers");
        // Scanner s = new Scanner(System.in);
        // int n = s.nextInt();
        int n = 10;
        // for Single for Loop we will get time complexity of Big O(n) where n belongs to the input Number
        for(int i = 0; i<n; i++){
            System.out.println(i);
        }
    }
}
// for n = 10 loop will execute 10 times so the time complexity will be big O(n)
// big O(n) graph is similar to y = mx that is as the input increases time will also increase to execute the code.