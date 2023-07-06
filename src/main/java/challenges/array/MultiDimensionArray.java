package challenges.array;

public class MultiDimensionArray {
    public static int multiplied(int[][] numbersArray) {
        int result = 1;
        for (int i = 0; i < (numbersArray.length)-1; i++) {
          result = result * numbersArray[i][0];
        }

        for (int j = 0; j < numbersArray[2].length; j++) {
              result = result * numbersArray[2][j];
          }
        return result;
    }

    public static void main(String[] args) {
        int[][] numbersArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int output = multiplied(numbersArray);
        System.out.println(output);
    }
}
