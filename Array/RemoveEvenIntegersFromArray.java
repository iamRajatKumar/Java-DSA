package Array;

public class RemoveEvenIntegersFromArray {

    public static void printArray(int[] arr){
        int n=arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
            //System.out.println(arr[10]);// Array index out of Bound eXception will occur because this array consist 6 elements indexs 0-5
        }
        System.out.println();
    }
    
    public static int[] removeEven(int[] arr){
        int oddCount=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2 != 0){
                // If Array index value divided by 2 will give remainder as not = 0
                // will increase the count variable
                oddCount++;
            }
        }
        int[] result = new int[oddCount];
        int arrindex=0;
        for (int i=0; i<arr.length; i++){
            if(arr[i]%2 != 0){
                result[arrindex]= arr[i];
                arrindex++;
            }
        }
        return result;

    }

    public static void main(String[] args) {
       int[] arr= {5,4,3,9,2,0,1,45,10,52};
       System.out.println("Original Array");
       printArray(arr); //for getting Original  Array
       int[] result = removeEven(arr);
       System.out.println("Removing Even No. from Array");
       printArray(result);

    }
    
}
