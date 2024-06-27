package SumofNaturalnum;
import java.io.IOException;
import java.util.Scanner;

public class SumOfNNaturalNum {
    public static void main(String args[]) throws IOException{
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the natural number");
        int NaturalNumber = scanner.nextInt();
        System.out.println("Natural num:" +NaturalNumber);
        //using Mathematical formula AP
        int sum=NaturalNumber*(NaturalNumber+1)/2;
        System.out.println("Sum of N natural num:"+sum);
        scanner.close();
    }
}
