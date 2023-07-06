package morningChallenge;

//  Create a method that takes two numbers as arguments
//  (`num`, `length`) and returns an array of multiples of `num`
//  until the array length reaches `length`.
//
//  For example:
//
//      `ArrOfNums(7, 5) ➞ {7, 14, 21, 28, 35}`

import java.util.Arrays;

public class ArrayOfNums {

    public static int[] arrayOfNums(int num, int length) {
        int[] result = new int[length];

        for (int i = 0; i < length; i ++) {
            result[i] = num * (i+1);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayOfNums(7,5)));
    }
}
