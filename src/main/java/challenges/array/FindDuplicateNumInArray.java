package challenges.array;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicateNumInArray {

    public static List<Integer> dups(int[] numbersArray) {
        List<Integer> newList = new ArrayList<>();
        int duplicateNum;

        for (int i = 0; i < numbersArray.length; i++) {
            for (int j = i + 1; j < numbersArray.length; j++) {
                if (numbersArray[i] == numbersArray[j]) {
                   duplicateNum = numbersArray[j];
                    newList.add(duplicateNum);
                }
            }
        }
        return newList;
    }

//    public int removeDuplicates(int[] nums) {
//        int j = 1;
    //The initial value of j is 1 since the first element in the array is always unique and doesn't need to be changed.
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i] != nums[i - 1]) {
//                nums[j] = nums[i];
//                j++;
//            }
//        }
//        return j;
//    }

    public static void main(String[] args) {

        int[] array1 = {2, 1, 2, 1};
        System.out.println(dups(array1));

    }
}
