// Reverse a string with Recursion

package programs;

public class ReverseStringWithRecursion {
    public static String reverse(String inputStr){
        if (inputStr.length() <= 1){
            return inputStr;
        } else {
            return reverse(inputStr.substring(1)) + inputStr.substring(0,1);
        }
    }

    public static void main(String[] args){
        String input = "abcdefg";
        String output = reverse(input);
        System.out.println(output);
    }
}
