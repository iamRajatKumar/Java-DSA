public class Factorial {
    public static void main(String[] args) {
        int x = 5;
        int fact = 1;
        for(int i=1; i<=x; i++){
            fact *= i;
        }
        System.out.println(fact);
    }
}
