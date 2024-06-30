package basicSorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] myArray = {1,2,4,3,5,6};
        System.out.println("Before ::" +Arrays.toString(myArray));
        insertionSort(myArray);
        System.out.println("After :: "+Arrays.toString(myArray));
    }

    public static void insertionSort(int[] array){
        for(int i= 1;  i< array.length; i++){
            int temp = array[i];
            int j = i-1;
            while (j>-1 && temp <array[j]) {
                array[j+1] = array[j];
                array[j] = temp;
                j--;
            }
        } 
    }
}
