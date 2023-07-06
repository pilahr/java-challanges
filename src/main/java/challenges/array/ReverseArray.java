package challenges.array;

import java.util.Arrays;
import java.util.Collections;

public class ReverseArray {

    public static int[] reverse(Integer[] numbersArray) {
        int length = numbersArray.length;
        int[] newArray = new int[length];

        for(int i = length-1; i > -1; i--) {

            // Storing the elements of the input array in reverse order
            newArray[length-i-1] = numbersArray[i];
        }
        return newArray;

    }


    public static void main(String[] args) {
        Integer[] numbersArray = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(reverse(numbersArray)));


        Collections.reverse(Arrays.asList(numbersArray));
        System.out.println(Arrays.toString(numbersArray));

    }

}
