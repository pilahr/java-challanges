package challenges;

public class IntegerIsPalindrome {

    public static boolean isPalindrome(int x) {
        //convert to string
        String converted = String.valueOf(x);

        StringBuilder reversedString = new StringBuilder();

        reversedString.append(converted);

        reversedString.reverse();

        return (reversedString.toString().equals(converted) ? true : false);

    }
    public static void main (String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(10));

    }
}
