package Array;

public class SecondMaximum {
    public static void main(String[] args) {
        int[] arr ={13,34,2,34,33,1};
        findSecondMax(arr);
        System.out.println("Second maximum value inside array is: " +findSecondMax(arr));
    }

    private static int findSecondMax(int[] arr) {
        
        int Max = Integer.MIN_VALUE; 
        // we will assign Max to integer minimum value for easily comparing the Integer.MinValue is -2147483648
        int secondMax = Integer.MIN_VALUE;
        // we will assign secondMax to integer minimum value for easily comparing the Integer.MinValue is -2147483648
        
        for(int i = 0; i<arr.length; i++){
            if (arr[i]> Max) 
            // for this if condition arr[i] i.e. arr[0] = Max i.e. arr[0] = 13 > -2147483648 condition will be true
            {
                secondMax = Max;  
                Max = arr[i];     // Now Max will become 13 for arr[0] first time of loop execution                
                // for i=1 → arr[1] = 34; Max =13 will assign to second max i.e. secondMax=13 and Max=34
                // for i=2 → arr[2] = 2 & Max = 34 condition false "else if" will be executed
                // for i=3 → arr[3] = 34 & 34 = Max not greater than condition false exit
                // for i=4 → arr[4] = 33 > 34 = Max condition false exit
                // for i=5 → arr[5] = 1 > 34 condition false exit
            }

            else if (arr[i]>secondMax && arr[i]!=Max) {
                secondMax = arr[i];
                //arr[2] = 2 > 13 condition false 
                //arr[3] = 34 > 13 condition true && arr[3] → 34 != Max i.e. 34 condition false exit.
                //arr[4] = 33 > 13 condition true && arr[4] → 33 != 34 i.e. Max condition true, secondMax = arr[4] i.e. SecondMax =33. 
                //arr[5] = 1 > 33 condition false exit
            } 
        }
        
        return secondMax;

    }
    
}
