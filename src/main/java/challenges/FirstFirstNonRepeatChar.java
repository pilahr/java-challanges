package challenges;

import java.util.ArrayList;
import java.util.List;

public class FirstFirstNonRepeatChar {

    public static char firstNonRepeat(String str) {
        List<Character> charList = new ArrayList<>();


        for (int i = 0; i < str.length(); i++) {
            if (charList.contains(str.charAt(i))) {
                charList.remove((Character) str.charAt(i));
            } else {
                charList.add(str.charAt(i));
            }
        }
        return charList.get(0);
    }

    public static void main(String[] args) {

        String str = "greeksforgeeks";
        System.out.println(firstNonRepeat(str));
    }
}
