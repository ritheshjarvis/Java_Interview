// Reverse a sting in Python

package programs;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println("Hie, Rithesh here");
        String input = "abcdefg";
        String output = "";
        System.out.println(input);
        char[] input_arr = input.toCharArray();

//        Method 1: for loop with reverse indexing
        for(int i = input_arr.length - 1; i >= 0; i--){
            output = output + input_arr[i];
        }
        System.out.println("Output: " + output);

//        Method 2: for loop - pre-adding the element
        for(int i = 0; i < input_arr.length; i++){
            output = input_arr[i] + output;
        }
        System.out.println(output);
    }
}
