package challenges.array;

public class MultiDimensionArray2 {

    int[][] numbersArray = {{-1, 2, 3}, {4, 5, -6}, {7, 8, 9}};

    public static int multiplied(int[][] numbersArray) {
        int result = 1;

        for (int i = 0; i < (numbersArray.length) - 2; i++) {
            result = result * numbersArray[i][0];
        }

        for (int j = 0; j < numbersArray[1].length; j++) {
            result = result * numbersArray[1][j];
        }

        for (int k = 0; k < numbersArray[2].length; k++) {
            k = 2;
            result = result * numbersArray[2][k];
        }
            return result;
    }

    public static void main(String[] args) {
        int[][] numbersArray = {{-1, 2, 3}, {4, 5, -6}, {7, 8, 9}};
        int output = multiplied(numbersArray);
        System.out.println(output);
    }
}
