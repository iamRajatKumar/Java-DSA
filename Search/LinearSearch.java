package Search;

public class LinearSearch {

    public static int linearSearch(int[] array, int n, int x){

        for(int i=0; i< n; i++){
            if(array[i] == x) return i;
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        int x = 5;
        System.out.println("Index at: "+linearSearch(arr, n, x)+" Value of X :" + x);
    }
}
