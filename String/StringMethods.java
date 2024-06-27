package String;

public class StringMethods {
    public static void main(String[] args) {
        String s = "Rajat";
        String neww = "IceCream";
        String s1= "";
        String s2 ="    HEllo Rajat     ";
        s1 = s.toUpperCase(); // Convert the string to Upper Case
        System.out.println(s1);
        s1 = s.toLowerCase(); // Convert the string to Lower Case
        System.out.println(s1);
        s1 = s.replace("R", "S"); // Replace the string Character
        System.out.println(s1);
        s1 = s.replaceAll(s, neww); //Replace the String with new String
        System.out.println(s1);
        s1= s2.trim(); //this method will eliminates all the Extra Space in starting and end of a String
        System.out.println("without trim : " +s2);
        System.out.println("After trim : "+s1);
        int index = neww.indexOf("C"); // index of will check the index value of given Character or String
        System.out.println(index);

    }
}
