package challenges.hashmap;

import java.util.HashMap;
import java.util.Map;

public class FindFirstNonRepeatingChar {

    public static char findFirstNonRepeatingChar(String str) {
        Map<Character, Integer> map = new HashMap<>();

        for (var ch : str.toCharArray()) {
//            if (map.containsKey(ch)) {
//                var count = map.get(ch);
//                map.put(ch, count);
//
//            } else {
//                map.put(ch,1);
//            }

            var count = map.containsKey(ch) ? map.get(ch) : 0;
            map.put(ch, count+1);
        }

        System.out.println(map); //{ =2, p=2, a=2, r=1, e=3, g=1, l=1, n=1}

        for (var ch : str.toCharArray())
            if (map.get(ch) == 1)
                return ch;

        return Character.MIN_VALUE;
    }

    public static void main(String[] args) {
        // a green apple
        // hash table looks for item quickly
        // a=2  =2 g=1
        var ch = findFirstNonRepeatingChar("a green apple");
        System.out.println(ch);

    }
}
