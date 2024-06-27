package TimeComplexity;
public class TimeComplexityDemo_SumofNnaturalNum {
    public static void main(String args[]){
        
        double now = System.currentTimeMillis();
        TimeComplexityDemo_SumofNnaturalNum demo =new TimeComplexityDemo_SumofNnaturalNum();
        System.out.println(demo.findSum(99999));
        System.out.println("Time Taken : " +(System.currentTimeMillis() - now) + "millisecs.");
    }
        public int findSum(int n){
            return n*(n+1)/2;
        }

    //     public int findSum(int n){
    //     int sum=0;
    //     for(int i=0; i<=n; i++){
    //         sum= sum+i;
    //     }
    //     return sum;
    // }
}
