package morningChallenge;

//Write a program that accepts three numbers from the user
// and prints "increasing" if the numbers are in increasing order,
// "decreasing" if the numbers are in decreasing order,
// and "Neither increasing or decreasing order" otherwise.
//
//      direction(12,15,19) -> "increasing"
//      direction(100,15,3) -> "decreasing"
//      direction(20,30,19) -> "Neither increasing or decreasing order"
public class Direction {

    public static void direction(int num1, int num2, int num3) {
        if (num1 < num2 && num2 < num3) {
            System.out.println("increasing");
        } else if (num1 > num2 && num2 > num3) {
            System.out.println("decreasing");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }

    public static void main(String[] args) {
        direction(12, 15, 19);
        direction(100, 15, 3);
        direction(20, 30, 19);
    }
}
