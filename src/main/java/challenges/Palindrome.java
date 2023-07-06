package challenges;

import java.util.ArrayList;
import java.util.List;

public class Palindrome {

    public static boolean palindrome(String word) {
        List<Character> characters = new ArrayList<>();

        for (int i = 0; i < word.length(); i++) {
            if (characters.contains(word.charAt(i))) {
                characters.remove((Character) word.charAt(i));
            } else {
                characters.add(word.charAt(i));
            }
        }
        System.out.println(characters);
        if (characters.size() > 1) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(palindrome("civic"));
        System.out.println(palindrome("abba"));
        System.out.println(palindrome("civil"));
    }
}
