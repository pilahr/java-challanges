package challenges;

public class CountWaysToReachNthStair {

    // There are n stairs, a person standing at the bottom wants to reach the top.
    // The person can climb either 1 stair or 2 stairs at a time.
    // Count the number of ways, the person can reach the top.

//    Input: n = 1
//    Output: 1
//    There is only one way to climb 1 stair
//
//    Input: n = 2
//    Output: 2
//    There are two ways: (1, 1) and (2)
//
//    Input: n = 4
//    Output: 5
//            (1, 1, 1, 1), (1, 1, 2), (2, 1, 1), (1, 2, 1), (2, 2)

    // the value of ways(n) is equal to fibonacci(n+1)
    public static int fib(int n) {
        // fibonacci 0 1 1 2 3 5
        if ( n <= 1) return n;

        return fib(n -1) + fib(n -2);
    }

    public static int countWays(int stair) {
        return fib(stair + 1);
    }

    public static void main(String[] args) {
        System.out.println(fib(10));
        System.out.println(countWays(9));
    }
}
