package TimeComplexity;

public class BigOof1 {
    public static void main(String[] args) {
        int n=1;
        addItems(n);
        System.out.println(addItems(n));
   }
   public static int addItems(int n){
    return n + n + n;
   }
}

// This time complexity is known as Big O of 1 or O(1)
//Big O(1) is also called constant time i.e., what ever the input of N numbers the time Complexity will be constant
// the graph for this time complexity i.e., Big O(1) will be a straight Line Graph similar to the equation f(x)= c .
// O(1) is much more efficient than anyother BigO notation