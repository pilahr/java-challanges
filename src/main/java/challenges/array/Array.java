package challenges.array;

import java.util.Arrays;

public class Array {
    private int[] items;
    private int count;

    public Array(int length) {
        items = new int[length];
    }

    public void insert(int item) {
        // if array is full, resize it
        if (items.length == count) {
            // create a new array (twice the size}
            int[] newItems = new int[count * 2];


            // copy all the existing items
            for (int i = 0; i < count; i++)
                newItems[i] = items[i];

            // set items to this new array
            items = newItems;
        }
        // Add the new item at the end
        items[count++] = item;
    }

//    public int max(int[] items) {
//        int maxValue = items[0];
//        for (int i = 0; i < items.length; i++) {
//            if (items[i] > maxValue) {
//                maxValue = items[i];
//            }
//        }
//        return maxValue;
//    }

    public void removeAt(int index) {
        // validate the index
        if (index < 0 || index >= count)  //count is 4, index will be 3
            throw new IllegalArgumentException();

        // shift the items to the left to fill the hole
        // [10,20,30,40] want to remove 10 and shift the rest to the left
        // index 1... 1<-2 ... 2<-3
        for (int i = index; i < count; i++)
            items[i] = items[i + 1];

        count--;
    }

    public int indexOf(int item) {
        // loop over items in array if we find it , return index, otherwise, return -1

        // if the item is at the beginning of the array the best case of runtime complexity is O(1)
        // Ex, if there's a million items and you look for the last one : O(n) worst case

        // runtime complexity of this method is O(n)
        for (int i = 0; i < count; i++)
            if (items[i] == item)
                return i;
        return -1;
    }

    public void print() {
        for (int i = 0; i < count; i++)
            System.out.println(items[i]);
    }

    public static void main(String[] args) {

//        int[] numbers = new int[3];
//        numbers[0] = 10;
//        numbers[1] = 20;
//        numbers[2] = 30;

//        int[] numbers = {10, 20, 30};
//        System.out.println(numbers.length);
//        System.out.println(Arrays.toString(numbers));
        int[] numbers = {};
    }
}
