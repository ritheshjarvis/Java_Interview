package programs;

import java.util.HashMap;
import java.util.Locale;

public class VowelCount {

    public static void main(String[] args) {
        String input = "aAbcdefiolej";

        char[] input_array = input.toLowerCase(Locale.ROOT).toCharArray();
        HashMap<Character, Integer> output = new HashMap();

        for(Character item: input_array){
            if (item == 'a' || item == 'e' || item == 'o' || item == 'u' || item == 'i'){
                System.out.println(item);
                if (output.containsKey(item)){
                    output.put(item, output.get(item) + 1);
                } else {
                    output.put(item, 1);
                }
            }
        }

        System.out.println(output);
    }
}
