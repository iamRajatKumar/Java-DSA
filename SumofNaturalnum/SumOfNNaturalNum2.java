package SumofNaturalnum;
import java.util.Scanner;

public class SumOfNNaturalNum2 {
    public static void main(String args[]){
        System.out.println("Enter N Natural numbers:");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int sum=0;
        for(int i=0; i<=n; i++){
            sum= sum+i;
        }
        System.out.println("Sum of N Natural num = " +sum);
        sc.close();
    }
}
