package Array;

public class FindMissingnumInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6};
        System.out.println("Missing Number : "+missingNumber(arr));
    }
    public static int missingNumber(int[] arr){
        int n = arr.length+1; // n is length of Array + 1 i.e. if Lenght is 5 then n = 6
        int sum = n*(n+1)/2;  // sum of N natural numbers if n =6 then sum = 21
        for(int num : arr){   //It's enhanced  for loop, In simple terms for(int num = 0; num < arr.length; num++) //arr[num] will be subtracted from sum 
            sum = sum - num; // sum = sum -arr[num]; 
        } //sum = 21-6 → 15-5 → 10-3 → 7-2 → 5-1 → 4 will be the answer for this array
        return sum;
    }
}
