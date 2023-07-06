package morningChallenge;

//    Create a method that returns true if the given non-negative number
//    is a multiple of 3 or 5, but not both. Use the % "mod" operator.
//
//    old35(3) → true
//    old35(10) → true
//    old35(15) → false
public class CheckThreeAndFive {

    public static boolean old35(int number) {
        boolean check35 = false;

        if (number < 0) {
            check35 = false;
        } else if (number % 3 == 0 && number % 5 == 0) {
            check35 = false;
        } else if (number % 3 == 0 ) {
            check35 = true;
        } else if (number % 5 == 0) {
            check35 = true;
        }
        return check35;
    }

    public static void main(String[] args) {
        System.out.println(old35(3));
        System.out.println(old35(10));
        System.out.println(old35(5));
        System.out.println(old35(15));
        System.out.println(old35(4));
    }
}
