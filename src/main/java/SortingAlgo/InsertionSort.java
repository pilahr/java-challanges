package SortingAlgo;

import java.util.Arrays;
import java.util.Random;

public class InsertionSort {

    // 3 1 8 6 2  starts with 3 insert it - - - 3 - -
    // then 1 ===== 1 3 . . .
    // then 8       1 3 8 . .
    // then 6       1 3 6 8 .
    // then 2       1 2 3 6 8

    // 3 1 8 6 2 take 1 to a tempolary array
    // 3   8 6 2
    //   1
    // check backward to the left which is 3
    // 3 is greater that 1 ---- shift it to the right
    // place 1 back

    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

        System.out.println("Before: ");
        System.out.println(Arrays.toString(numbers));


        insertionSort(numbers);
        System.out.println("After: ");
        System.out.println(Arrays.toString(numbers));
    }

    private static void insertionSort(int[] inputArray) {
        for (int i = 1; i < inputArray.length; i++) {
            int currentValue = inputArray[i];

            int j = i - 1;
            while (j >= 0 && inputArray[j] > currentValue) {
                inputArray[j + 1] = inputArray[j];
                j--;
            }
            inputArray[j + 1] = currentValue;
        }
    }
}
