package TimeComplexity;

public class BigOdifferentInputs {
    public static void main(String[] args) {
        int a = 10, b=10;
        bigOdifferentInputs(a,b);
        //System.out.println(bigOdifferentInputs(a,b));
    }

    private static void bigOdifferentInputs(int a, int b) {
        for(int i=0; i<a; i++)
        {
            System.out.println(i); // Time complexity O(a)
        }
        for(int j=0; j<b; j++)
        {
            System.out.println(j); // Time complexity O(b)
        }
        
    }

}

// For this type of time complexity that for two different inputs the Time complexity will be O(a+b)
// because there are two inputs a & b