package basicSorting;

import java.util.Arrays;

public class BubbleSort {
    
    public static void main(String[] args) {
        int[] myArray =  {4,2,6,5,1,3};
        System.out.println("Before :: "+Arrays.toString(myArray));
        bubbleSort(myArray);
        System.out.println("After :: "+Arrays.toString(myArray));
    }

    public static void bubbleSort(int[] array){
       for(int i = array.length-1; i>0; i--){
        for(int j = 0; j< array.length-1; j++){
            if(array[j] > array[j+1]){
                int temp = array[j];
                array[j] = array[j+1];
                array [j+1] = temp;
            }
        }
       }
    }
}
