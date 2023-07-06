package challenges.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//merge({{1,4,7}, {2,5,8}, {3,6,9}}) -> {1,2,3,4,5,6,7,8,9}
public class MergeThreeArrays {

    public static int[] merge(int[][] arrays) {
        List<Integer> mergedList = new ArrayList<>();

        for(int[] array:arrays) {
            for(int num: array) {
                mergedList.add(num);
            }
        }

        // convert list to array
        int[] mergedArray = new int[mergedList.size()];
        for (int i = 0; i < mergedList.size(); i++) {
            mergedArray[i] = mergedList.get(i);
        }
       Arrays.sort(mergedArray);

        return mergedArray;
    }

    public static void main(String[] args) {
        int[][] arrays = {{1,4,7}, {2,5,8}, {3,6,9}};
        System.out.println(Arrays.toString(merge(arrays)));

    }
}
