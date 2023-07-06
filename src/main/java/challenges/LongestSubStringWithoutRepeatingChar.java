package challenges;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithoutRepeatingChar {

    // s = "abcabcbb  output 3 Ans is "abc"

//    public static int lengthOfLongestSubstring(String str) { /// O(n^2)
//        int maxLength = 0;
//
//        for (int i = 0; i < str.length(); i++) {
//            StringBuilder currentSubString = new StringBuilder();
//
//            for (int j = i; j < str.length(); j++) {
//                if (currentSubString.indexOf(String.valueOf(str.charAt(j))) != -1) {
//                    break;
//                }
//                currentSubString.append(str.charAt(j));
//                maxLength = Math.max(maxLength, currentSubString.length());
//            }
//        }
//        return maxLength;
//    }

//    public static int lengthOfLongestSubstring(String str) {
//        // using hashmap to stores the index
//
//
//        int maxLength = 0;
//
//        Map<Character, Integer> visitedCharacters = new HashMap<>();
//
//        for (int right = 0, left = 0; right < str.length(); right++) {
//            char currentChar = str.charAt(right);
//
//            if (visitedCharacters.containsKey(currentChar) && visitedCharacters.get(currentChar) >= left) {
//                left = visitedCharacters.get(currentChar) + 1;
//            }
//
//            maxLength = Math.max(maxLength, right - left +1);
//            visitedCharacters.put(currentChar, right);
//        }
//        return maxLength;
//    }

    public static int lengthOfLongestSubstring(String str) { // faster way
        int maxLength = 0;

        for (int right = 0, left = 0; right < str.length(); right++) {
            int indexOfFirstAppearanceInSubString = str.indexOf(str.charAt(right), left);
            if (indexOfFirstAppearanceInSubString != right) {
                left = indexOfFirstAppearanceInSubString +1;
            }
            maxLength = Math.max(maxLength, right - left);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}
