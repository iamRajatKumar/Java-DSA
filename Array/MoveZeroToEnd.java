//input [8,1,0,2,1,0,3]
//output [8,1,2,1,3,0,0]

package Array;

public class MoveZeroToEnd {

    public static void main(String[] args) {
        int[] arr = {8,1,0,2,1,0,3};
        printArray(arr);
        moveZeros(arr, arr.length);
        printArray(arr);
    }

    private static void printArray(int[] arr) {
         
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    private static void moveZeros(int[] arr, int n) {
        int j = 0; //focus on 0th Elements in array
        for(int i =0; i<n; i++){
            if(arr[i] != 0 && arr[j] == 0){
                //for index =0 → arr[i] = 8 != 0 condition true && arr[j]= 8 == 0 condition false exit
                //for index =1 → arr[i] = 1 != 0 condition true && arr[j]= 1 == 0 condition false exit
                //for index =2 → arr[i] = 0 != 0 condition false exit

                //for index =5 → arr[i] = 0 != 0 condition false exit

            
                int temp = arr[i]; 
                arr[i] = arr[j];   
                arr[j] = temp;     
                //for index =3 → arr[i] = 2 != 0 condition true && arr[j]= 0 == 0 condition true execute code
                //temp = 2
                //arr[i] = 0
                //arr[j] = 2
                //for index =4 → arr[i] = 1 != 0 condition true && arr[j]= 0== 0 condition true exexute
                //temp=1
                //arr[i]= 0
                //arr[j] = 1
                //for index =6 → arr[i] = 6 != 0 condition true && arr[j]= 0 == 0 condition true exexute
                // temp = 6
                //arr[i] = 0
                //arr[j] = 6
            }
            if(arr[j]!=0){
                //for index = 0 arr[j]= 8 !=0 condition true 
                //for index = 1 arr[j]= 1 !=0 condition true 
                //for index = 2 arr[j]= 0 !=0 condition false exit 
                //for index = 3  after swapping arr[j]= 2 !=0 condition true 
                //for index = 4 arr[j]= 1 !=0 condition false exit
                //for index = 5 arr[j]= 1 !=0 condition true 
                //for index = 6 arr[j]= 1 !=0 condition true 
                
                j++; 
                //j++ → j[1]
                //j++ → j[2]
                //j++ → j[4]
                //j++ → j[5]
            }
        }

    }
}