package Array.ReverseArray;

public class ArrayReverseShortAlogrithm {
    public static void main(String[] args) {
        int[] numbers = {5,4,3,2,1,0};
        printArray(numbers);
        reverseArray(numbers,0, numbers.length-1);
        printArray(numbers);
    }

    public static void printArray(int[] arr){
        int n=arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void reverseArray(int[] numbers, int start, int end){
        while (start<end) {
            //start = a, end = b; Swapping using three variables
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end]=temp;
            start++;
            end--;
        }
    }
}
