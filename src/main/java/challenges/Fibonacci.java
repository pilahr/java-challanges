package challenges;

public class Fibonacci {

    // count = 5
    // 0   1   1    2   3   5
    // n1  n2  sum=1
    //     n1  n2   sum=2

    public static int fibonacci(int count) {
        int n1 = 0;
        int n2 = 1;
        int sum;

        if (count == n1 || count == n2) {
            return count;
        }

        for (int i = 2; i <= count; i++) {
            sum = n1 + n2;
            n1 = n2;
            n2 = sum;
        }
        return n2;
    }

    public static void main(String[] args) {
        int count = 5;
        System.out.println(fibonacci(count));
        System.out.println(fibonacci(1));
        System.out.println(fibonacci(10));
        System.out.println(fibonacci(0));
        System.out.println(fibonacci(4));
    }
}
