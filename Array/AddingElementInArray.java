package Array;

public class AddingElementInArray {
    public static void main(String[] args){
        AddingElementInArray arrUtil = new AddingElementInArray();
        arrUtil.arrayDemo();
    }

    public void printArray(int[] arr){
        int n=arr.length;
        for(int i=0; i<n; i++){
            System.out.println(arr[i]+"");
            //System.out.println(arr[10]);// Array index out of Bound eXception will occur because this array consist 6 elements indexs 0-5
        }
        System.out.println();
    }
    
    public void arrayDemo() {
        int[] myArray = {5,4,3,2,1,6};//new int[5]; //default values
        printArray(myArray);
    }
    
}

