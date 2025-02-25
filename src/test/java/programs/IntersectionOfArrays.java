//# Find the intersection of two arrays

package programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfArrays {
    public static Set intersection(Integer[] arr1, int[] arr2){
//        Set<Integer> set1 = new HashSet<>();
//        for(int item : arr1){
//            set1.add(item);
//        }

        Set<Integer> set1 = new HashSet(Arrays.asList(arr1));

        Set<Integer> out = new HashSet<>();
        for(int item : arr2){
            if (set1.contains(item)){
                out.add(item);
            }
        }

        return out;
    }

    public static void main(String[] args){
        Integer[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {3, 7, 8};

        Set result = intersection(arr1, arr2);
        System.out.println(result);
    }
}
