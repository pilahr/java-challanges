package morningChallenge;


//Write a Java method to find the smallest number among three numbers.
//miniMe(25,37,29) -> 25
//miniMe(0.02,20,2) -> 0.02
//miniMe(50,57,50.1) -> 50
public class SmallestNumOfThree {
    public static double miniMe(double num1, double num2, double num3) {
        double smallest = num1;
        if (num2 < smallest) {
            smallest = num2;
        } else if (num3 < smallest) {
            smallest = num3;
        }
        return smallest;
    }

    public static void main(String[] args) {
        double numbers1 = miniMe(25, 37, 29);
        System.out.println(numbers1);

        double numbers2 = miniMe(0.02, 20, 2);
        System.out.println(numbers2);

        double numbers3 = miniMe(50, 57, 50.1);
        System.out.println(numbers3);

        double numbers4 = miniMe(25, 57, 1);
        System.out.println(numbers4);
    }
}
