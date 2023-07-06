package morningChallenge;

//    Create a method that takes 3 int values, a b c,
//    return their sum.
//    However, if one of the values is the same as another of the values,
//    it does not count towards the sum.
//
//                loneSum(1, 2, 3) → 6
//                loneSum(3, 2, 3) → 2
//                loneSum(3, 3, 3) → 0

public class LoneSum {

    public static int loneSum(int num1, int num2, int num3) {
        int sum = 0;

        if (num1 != num2 && num1 != num3) {
            sum += num1;
        }

        if (num2 != num1 && num2 != num3) {
            sum += num2;
        }

        if (num3 != num1 && num3 != num2) {
            sum += num3;
        }

        return sum;
    }

    public static void main(String[] args) {

        System.out.println(loneSum(1,2,3));
        System.out.println(loneSum(3,2,3));
        System.out.println(loneSum(3,3,3));
    }
}
