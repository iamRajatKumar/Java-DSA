package TimeComplexity;

//import java.util.Scanner;

public class BigOofNsquare {
    public static void main(String[] args) {
        // System.out.print("Enter the numbers ");
        // Scanner s = new Scanner(System.in);
        // int n = s.nextInt();
        int n = 10;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                System.out.println(i+" "+j);
            }
        // for Mutliple for Loop we will get time complexity of Big O(n²) i.e. Big O of N Square where n belongs to the input Number
        }
        
    }
}
// This code will execute n * n i.e n² times.
// The graph of Big O(n²) is similar to parabolic graph where Quadratic equation is f(x) = Ax²+bx+c.
// f(x) = Ax²+bx+c if we remove constant variable from this equation i.e, A,bx,c then will get x² as Big O(x²) time to execute the code