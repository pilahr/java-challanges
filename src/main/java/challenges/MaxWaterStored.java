package challenges;

public class MaxWaterStored {

    public static int maxWater(int[] array) {
        int result = 0;

        for (int i = 1; i < array.length-1; i++) { // for every element of the array except first and last

            // find max element of its left
            int left = array[i];
            for ( int j = 0; j < i; j++) {
                left = Math.max(left, array[j]);
            }

            // find max element of its right
            int right = array[i];
            for (int j = i +1; j < array.length; j++) {
                right = Math.max(right, array[j]);
            }

            result += Math.min(left, right) - array[i];

        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.println(maxWater(array));
    }
}
