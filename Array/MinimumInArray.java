package Array;

public class MinimumInArray {
    public static void main(String[] args) {
        int[] arr = {5,9,3,15,8,2,88};
        MinimumInArray ma = new MinimumInArray();
        System.out.println(ma.findMinimum(arr));
    }

    public int findMinimum(int[] arr){
        //edge
        if(arr == null || arr.length == 0 ){
            throw new IllegalArgumentException("Invalid Input");
        }
        int min =arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i] < min) // less tham symbol "<" inside if block
            {
                min = arr[i];
            }
        }
        return min;

    }
}
