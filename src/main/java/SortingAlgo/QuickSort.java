package SortingAlgo;

import java.util.Arrays;

public class QuickSort {

    // 1 8 3 9 4 5 7
    // choose any number as a pivot
    // choose the last one = 7
    // move the num that lower than 7 to the left--- move all num that higher to the right
    // 5 4 3 1 - 7 - 8 9
    // quick sort on the lt then right
    // choose 1 as a pivot
    // move what greater than 1 to the right
    // 1 3 4 5
    // choose 5 then check 4 check 3
    // check the right of 7
    // choose 9 as a pivot
    // check left is 8 it's smaller left it on the left

    public static void main(String[] args) {
        int[] numbers = {1, 8, 3, 9, 4, 5, 7};

        System.out.println("Before: ");
        System.out.println(Arrays.toString(numbers));


        quickSort(numbers, 0, numbers.length-1);
        System.out.println("After: ");
        System.out.println(Arrays.toString(numbers));
    }

    public static void quickSort(int[] array, int lowIndex, int highIndex) {


        // move nums lower to the lt, higher to the rt
        // 1   8 3 9 4 5 ..7
        // lp          rp           pointer
        //     lp              is 8 > 7?         yes stop there lp pointing at 8
        //             rp      is 5 < 7?         yes stop there
        // swap numbers at two pointers
        // 1  5  3  9  4  8 ..7
        //      lp                 is 3 > 7?      no
        //          lp             is 9 > 7?      yes
        //             rp          is 4 < 7?      yes
        // swap numbers at two pointers
        // 1   5   3   4   9    8   .. 7
        //                lprp               at the same element -> swap pivot with 9
        // 1  5  3  4  7  8  9

        if (lowIndex >= highIndex) {
            return;
        }

        int pivot = array[highIndex];

        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while (leftPointer < rightPointer) {

            while (array[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }

            while (array[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }

            swap(array, leftPointer, rightPointer);
        }

        swap(array, leftPointer, highIndex);

        quickSort(array, lowIndex, leftPointer-1);
        quickSort(array, leftPointer+1, highIndex);
    }

    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] =temp;

    }
}
