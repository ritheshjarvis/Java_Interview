// Find the Occurrence of character in a given string

package programs;

import java.util.HashMap;

public class OccurrenceOfCharacter {
    public static void main(String[] args){
        String input = "aabbcdefg";
        char[] input_arr = input.toCharArray();

        HashMap<Character, Integer> output = new HashMap<>();

        for(Character ch : input_arr){
            if (output.containsKey(ch)) {
                output.put(ch, output.get(ch) + 1);
            } else {
                output.put(ch, 1);
            }
        }

        System.out.println(output);
        System.out.println(output.keySet());
        System.out.println(output.values());
        System.out.println(output.entrySet());
    }
}
