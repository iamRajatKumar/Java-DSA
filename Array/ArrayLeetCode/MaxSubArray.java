package Array.ArrayLeetCode;

import java.util.Arrays;

public class MaxSubArray {
    //using Kadane’s Algorithm:
    public static int maxSubarray(int[] nums){
        int n = nums.length;
        if(n == 0) return 0;
        int max = Integer.MIN_VALUE;
        int max_ending_here = 0;
        for(int i = 0; i < n; i++){
            max_ending_here = max_ending_here + nums[i];
            if(max < max_ending_here)
            max = max_ending_here;
            if(max_ending_here < 0)
            max_ending_here=0;
        }
        return max;
    }


    public static void main(String[] args) {
        // Example 1: Simple case with positive and negative numbers
        int[] inputCase1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result1 = maxSubarray(inputCase1);
        System.out.println("Example 1: Input: " + Arrays.toString(inputCase1) + "\nResult: " + result1);  

        // Example 2: Case with a negative number in the middle
        int[] inputCase2 = {1, 2, 3, -4, 5, 6};
        int result2 = maxSubarray(inputCase2);
        System.out.println("Example 2: Input: " + Arrays.toString(inputCase2) + "\nResult: " + result2); 

        // Example 3: Case with all negative numbers
        int[] inputCase3 = {-1, -2, -3, -4, -5};
        int result3 = maxSubarray(inputCase3);
        System.out.println("Example 3: Input: " + Arrays.toString(inputCase3) + "\nResult: " + result3); 

        // Example 4: Case with all positive numbers
        int[] inputCase4 = {1, 2, 3, 4, 5};
        int result4 = maxSubarray(inputCase4);
        System.out.println("Example 4: Input: " + Arrays.toString(inputCase4) + "\nResult: " + result4); 

        // Example 5: Case with alternating positive and negative numbers
        int[] inputCase5 = {1, -1, 1, -1, 1};
        int result5 = maxSubarray(inputCase5);
        System.out.println("Example 5: Input: " + Arrays.toString(inputCase5) + "\nResult: " + result5); 
        
        /*
            EXPECTED OUTPUT:
            ----------------
            Example 1: Input: [-2, 1, -3, 4, -1, 2, 1, -5, 4]
            Result: 6
            Example 2: Input: [1, 2, 3, -4, 5, 6]
            Result: 13
            Example 3: Input: [-1, -2, -3, -4, -5]
            Result: -1
            Example 4: Input: [1, 2, 3, 4, 5]
            Result: 15
            Example 5: Input: [1, -1, 1, -1, 1]
            Result: 1
        */
        
    }    
}
