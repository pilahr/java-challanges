package challenges.hashmap;

import java.util.HashSet;
import java.util.Set;

public class FindFirstRepeatedChar {

    public static char findFirstRepeatedChar(String str) {
        Set<Character> set = new HashSet<>();

        for (var ch : str.toCharArray()) {
            if (set.contains(ch))
                return ch;

            set.add(ch);
        }

        return Character.MIN_VALUE;
    }

    public static void main(String[] args) {
        // green apple
        var ch = findFirstRepeatedChar("green apple");
        System.out.println(ch);

    }
}
