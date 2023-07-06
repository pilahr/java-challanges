package challenges;

import java.util.Arrays;

public class RunLengthEncoding {

    public static void encoding(String str) {


        for (int i = 0; i < str.length(); i++) {
            int count = 1;

            while ( i < str.length() -1 && str.charAt(i) == str.charAt(i+1)) {
                count++;
                i++;
            }
            System.out.println(str.charAt(i) +""+ count);
        }
    }

    public static void main(String[] args) {
        String str = "wwwwaaadexxxxxxywww";
        encoding(str);

//        System.out.println(Arrays.toString(Arrays.stream(str.split("")).sorted().toArray()));
    }
}
