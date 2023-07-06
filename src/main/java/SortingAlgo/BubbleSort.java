package SortingAlgo;

import java.util.Random;

public class BubbleSort {
    // 5 3 6 1 8 7 2 4
    // check 5 3 --> swap to 3 5


    public static void main(String[] args) {
//        Random random = new Random();
//        int[] numbers = new int[10];
//
//        for (int i=0; i < numbers.length; i++) {
//            numbers[i] = random.nextInt(100000);
//        }

        int[] numbers = {5,3,2,7,8};

        System.out.println("Before: ");
        printArray(numbers);

//        boolean swappedSomething = true;
//
//        while (swappedSomething) {
//            swappedSomething = false;
//
//            for (int i = 0; i < numbers.length - 1; i++) { //the second last compared with the last
//                if (numbers[i] > numbers[i + 1]) {
//                    swappedSomething = true;
//                    int temp = numbers[i];
//                    numbers[i] = numbers[i + 1];
//                    numbers[i + 1] = temp;
//                }
//            }
//        }

        bubbleSort(numbers);

        System.out.println("After: ");
        printArray(numbers);
    }

    public static void bubbleSort(int[] numbers) {
        boolean swappedSomething = true;

        while (swappedSomething) {
            swappedSomething = false;

            for (int i = 0; i < numbers.length - 1; i++) { //the second last compared with the last
                if (numbers[i] > numbers[i + 1]) {
                    swappedSomething = true;
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                }
            }
        }
    }

    public static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
