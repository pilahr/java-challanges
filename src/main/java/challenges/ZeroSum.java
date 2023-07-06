package challenges;

import java.util.*;

public class ZeroSum {

    public static int[] findZeroSumSubarray(int[] nums) {
        int[] result = new int[0];
        Map<Integer, Integer> sumMap = new HashMap<>();
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            // If the current sum is zero, we found a subarray with zero sum
            if (sum == 0) {
                result = Arrays.copyOfRange(nums, 0, i + 1);
                return result;
            }

            // If the sum already exists in the map, we found a subarray with zero sum
            if (sumMap.containsKey(sum)) {
                int startIndex = sumMap.get(sum) + 1;
                result = Arrays.copyOfRange(nums, startIndex, i + 1);
                return result;
            }

            // Store the sum along with its index in the map
            sumMap.put(sum, i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {4, 2, -3, 1, 6};
        int[] nums2 = {1, 2, -5, 1, 2, 1};
        int[] zeroSumSubarray = findZeroSumSubarray(nums);
        int[] zeroSumSubarray2 = findZeroSumSubarray(nums2);
        System.out.println(Arrays.toString(zeroSumSubarray));
        System.out.println(Arrays.toString(zeroSumSubarray2));
    }




}
