package Array.ReverseArray;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,0}; 
        System.out.print("Original Array: ");
      
        // for printing original Array 
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
           }
        System.out.println();
        reverse(arr,arr.length); //length = 6

    }

    //Main code
    static void reverse(int[] arr, int length) {
        
        int[] array = new int[length];
        int j = length;

        for(int i=0; i< length; i++){
            array[j-1]= arr[i]; 
            //array[6-1] i.e. 5 //arr[i] i.e. 0 index
            // will put the value of index 5 i.e. Value '0' at arr of index 0
            j=j-1; // j=6-1=5 now For Loop wil Take value of J as 5
        }
        System.out.print("Reversed Array: ");
        //Printing element using new forloop 
        for(int k=0; k<length; k++){
            System.out.print(array[k]+" "); 
            //Array of K will print new reversed values in Array
        }


    }
}
