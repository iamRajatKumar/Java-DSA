package Array;

public class MaximumInArray {
    public static void main(String[] args) {
        int[] arr = {5,9,3,15,8,2,88};
        MaximumInArray max = new MaximumInArray();
        System.out.println(max.findMaximum(arr));
    }

    private int findMaximum(int[] arr){
        //edge
        if(arr == null || arr.length == 0 ){
            throw new IllegalArgumentException("Invalid Input");
        }
        int max =arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > max) // for finding MAximum value we have used greater than symbol ">" inside if Statement code block
            { 
                max = arr[i];
            }
        }
        return max;

    }
}

