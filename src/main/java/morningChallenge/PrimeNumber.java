package morningChallenge;

//In mathematics, the sieve of Eratosthenes is an ancient algorithm for finding all prime numbers
// up to any given limit.
//Write a Java program to print all primes smaller than or equal to any given number.
//primeTheEngine(125)-> [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113]
public class PrimeNumber {


//    public static void isPrime(int number) {
//        int flag = 0;
//        int m = 0;
//        m = number/2;
//
//        if (number == 0 || number == 1) {
//            System.out.println(number + " is not prime number");
//        } else {
//            for (int i =2; i <=m ; i++) {
//                if (number % i == 0) {
//                    System.out.println(number + " is not prime number");
//                    flag = 1;
//                    break;
//                }
//            }
//            if (flag == 0) {
//                System.out.println(number + " is prime");
//            }
//        }
//
//    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primeTheEngine(int limit) {

        for (int number = 2; number <= limit; number++) {
            if (isPrime(number)) {
                System.out.println(number);
            }

        }
    }

    public static void main(String[] args) {
        primeTheEngine(125);

        System.out.println(Math.sqrt(17));

    }
}
