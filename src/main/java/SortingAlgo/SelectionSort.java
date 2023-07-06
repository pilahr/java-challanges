package SortingAlgo;

import java.util.Arrays;
import java.util.Random;


public class SelectionSort {
    // 4 5 1 2 3  start with 4 --- push 1 to the beginning and swap with 4
    // 1 5 4 2 3  start with 5
    // 1 2 4 5 3
    // 1 2 3 5 4
    // 1 2 3 4 5


    public static void main(String[] args) {
        int[] numbers = new int[10000];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10000);
        }

        System.out.println(Arrays.toString(numbers));

        long startTime = System.currentTimeMillis();
        selectionSort(numbers);
        long endTime = System.currentTimeMillis();

        System.out.println("Took " + (endTime-startTime) + " ms");

        System.out.println(Arrays.toString(numbers));
    }

    private static void selectionSort(int[] numbers) {
        int length = numbers.length;

        for (int i = 0; i < length -1; i++) { // don't go to the end of the array,, will be nothing to look at
            int min = numbers[i];
            int indexOfMin = i;

            for (int j = i+1; j < length; j++) {
                if (numbers[j] < min) {
                    min = numbers[j];
                    indexOfMin = j;
                }

            }
            swap(numbers, i, indexOfMin);
        }

    }

    private static void swap(int[] numbers, int a, int b) {
        int temp = numbers[a];
        numbers[a] = numbers[b];
        numbers[b] = temp;
    }

}
