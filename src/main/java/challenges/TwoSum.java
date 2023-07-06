package challenges;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    // Input: nums = [2,7,11,15], target = 9
    // Output: [0,1]
    // Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

    // Input: nums = [3,2,4], target = 6
    // Output: [1,2]

//    public static int[] twoSum(int[] nums, int target) {         // O(n ^2)
//
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i+1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target) {
//                    return new int[]{i, j};
//                }
//            }
//        }
//        return new int[]{};
//    }


    //nums = [2, 7, 11, 15]  target = 9
    //num[0] = 2  target - num[0] = 7 --- to check if 7 exist in the map added key:value {2:0} in the map
    //num[1] = 7  target - num[1] = 2 --- 2 exist in the map --> return mp[2] and i = 1 as a vector {0,1}

    // {5, 2, 4} target=6
    // HashMap Key the num that need to add up to =6
    // K --> V (index)
    // 1 --> 0
    // 4 --> 1
    // when reach no.4 on index 2
    // Ans { 2, 1}


    public static int[] twoSum(int[] nums, int target) {            // O(n)
        Map<Integer, Integer> complements = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer complementIndex = complements.get(nums[i]);

            if (complementIndex != null) {
                return new int[]{i, complementIndex};
            }
            complements.put(target - nums[i], i);
        }
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
    }


}
