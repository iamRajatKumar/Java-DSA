//input: copy original array to temp array
//output: point original array to temp array

package Array;

public class ResizeArray {
    public static void main(String[] args) {
        ResizeArray rA = new ResizeArray();
        int[] original = new int[]{1,2,3,4,5};
        System.out.println("Size of Original Array : "+ original.length);
        original = rA.resize(original,10);
        System.out.println("Size of new Array : " + original.length);
    }

    public void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]+ " ");
        }
        System.out.println();
    }

    public int[] resize(int[] arr, int capacity){
            int[] temp = new int[capacity];
            for(int i=0; i<arr.length; i++){
                temp[i]=arr[i];
            }
            //arr = temp;
            return temp;
    }
}
