package morningChallenge;

import java.util.Arrays;

//    Given a non-empty array, return true if there is a place to split the array
//    so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.
//
//    canBalance([1, 1, 1, 2, 1]) → true
//    canBalance([2, 1, 1, 2, 1]) → false
//    canBalance([10, 10]) → true
public class BalanceArray {

    public static boolean canBalance(int[] numbersArray) {
        int arrLength = numbersArray.length;
        int[] leftArray = Arrays.copyOfRange(numbersArray, 0, (arrLength+1)/2);
        int[] rightArray = Arrays.copyOfRange(numbersArray, (arrLength+1)/2, arrLength);

        int leftSum = 0;
        int rightSum = 0;
        for (int number: leftArray) {
            leftSum += number;
        }

        for (int number: rightArray) {
            rightSum += number;
        }

        if (leftSum == rightSum) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println((canBalance(new int[]{1, 1, 1, 2, 1})));
        System.out.println((canBalance(new int[]{2, 1, 1, 2, 1})));
        System.out.println((canBalance(new int[]{10, 10})));
    }
}
