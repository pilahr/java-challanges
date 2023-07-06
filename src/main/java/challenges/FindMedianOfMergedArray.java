package challenges;

import challenges.array.Array;

import java.util.Arrays;

public class FindMedianOfMergedArray {
    public static int[] mergedArrays(int[] arrayA, int[] arrayB) {
        int[] mergedArray = new int[arrayA.length + arrayB.length];
        int indexA = 0;
        int indexB = 0;
        int indexC = 0;

        while(indexA < arrayA.length && indexB < arrayB.length) {
            if (arrayA[indexA] < arrayB[indexB]) {
                mergedArray[indexC++] = arrayA[indexA++];
            } else {
                mergedArray[indexC++] = arrayB[indexB++];
            }
        }

        while (indexA < arrayA.length) {
            mergedArray[indexC++] = arrayA[indexA++];
        }

        while (indexB < arrayB.length) {
            mergedArray[indexC++] = arrayB[indexB++];
        }

        return mergedArray;
    }

    public static double findMedian(int[] arrayA, int[] arrayB) {
        int[] mergedArray = mergedArrays(arrayA, arrayB);
        int length = mergedArray.length;
        int left = 0;
        int right = length - 1;

        while (left <= right) {
            int mid = (left + right)/2;

            if (length % 2 == 0) {
                return (double) (mergedArray[mid] + mergedArray[mid + 1]) /2;
            } else {
                return mergedArray[mid];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arrayA = {1,3,4};
        int[] arrayB = {2,4,4};
        System.out.println(Arrays.toString(mergedArrays(arrayA,arrayB)));
        System.out.println(findMedian(arrayA, arrayB));

    }
}
