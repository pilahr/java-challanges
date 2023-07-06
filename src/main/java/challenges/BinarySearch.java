package challenges;

public class BinarySearch {

    public static int search(int[] array, int search) {
        int low = 0;
        int high = array.length - 1;
        int mid;

        while (low <= high) {
            mid = low + ((high - low) / 2);

            if (array[mid] == search) {
                return mid;
            } else if (array[mid] < search) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] array= {1,2,4,5,7,8};
        System.out.println(search(array, 5));
        System.out.println(search(array, 9));
        System.out.println(search(array, -5));
    }
}
