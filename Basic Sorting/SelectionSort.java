package Sorting;

import java.util.Arrays;

public class SelectionSort {
    
    public static void selectionSort(int[] array){
        for(int i=0; i<array.length; i++){
            int minIndex = i;
            for(int j= i+1; j < array.length; j++){
                if(array[j]< array[minIndex]){
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
         
        int[] myArray = {4,2,6,5,1,3};
        System.out.println("Before ::"+ Arrays.toString(myArray));
        selectionSort(myArray);
        System.out.println("After ::"+ Arrays.toString(myArray));
    }
}
