package String;

public class CheckStringisPalindormeOrNot {
    public static void main(String[] args) {
        String s = "Rajat";
        isPalindrome(s);
        if(isPalindrome(s)== true){
            System.out.println("String is Palindrome : "+s);
        }
        else{
            System.out.println("String is not Palindrome : "+s);
        }
    }

    public static boolean isPalindrome(String s) {
        char[] charArray = s.toCharArray(); // String s "Rajat" will be converted into a character Array like this char[] charArray = {R,a,j,a,t} 
        int start = 0;
        int end = s.length()-1; // in Array we use arr.length to calculate Array lenght but in String we use string.length() i.e., length() methond for the same
        while (start<end) {
            if(charArray[start] != charArray[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
