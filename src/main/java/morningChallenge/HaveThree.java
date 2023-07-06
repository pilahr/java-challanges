package morningChallenge;

//Create a method that takes an array of ints,
// return true if the value 3 appears in the array exactly 3 times,
// and no 3's are next to each other.
//
//        haveThree([3, 1, 3, 1, 3]) → true
//        haveThree([3, 1, 3, 3]) → false
//        haveThree([3, 4, 3, 3, 4]) → false
public class HaveThree {
    public static boolean haveThree(int[] numbers) {
        int count = 0;
        boolean consecutiveThree = false;

        for (int i = 0; i < numbers.length; i ++) {
            if (numbers[i] == 3) {
                count ++;

                if (i > 0 && numbers[i-1] == 3) {
                    consecutiveThree = true;
                }
            }
        }
        return count == 3 && !consecutiveThree;
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 3, 1, 3};
        int[] nums1 = {3, 1, 3, 3};
        int[] nums2 = {3, 4, 3, 3, 4};

        System.out.println(haveThree(nums));
        System.out.println(haveThree(nums1));
        System.out.println(haveThree(nums2));

    }
}
