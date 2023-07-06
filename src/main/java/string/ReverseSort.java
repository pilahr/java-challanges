package string;

import java.util.Arrays;
import java.util.Collections;

public class ReverseSort {

    // scaler --> srleca

    public static String reverseSort(String str) {
        Character[] chararr = new Character[str.length()];

        for (int i = 0; i < str.length(); i++) {
            chararr[i] = str.charAt(i);
        }

        Arrays.sort(chararr, Collections.reverseOrder());

        StringBuilder newStr = new StringBuilder(chararr.length);

        for (Character ch : chararr) {
            newStr.append(ch.charValue());
        }

        return newStr.toString();
    }

    public static void main(String[] args) {
        String str = "scaler";
        System.out.println(reverseSort(str));
    }

}
// O(n*log n)