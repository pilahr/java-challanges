package morningChallenge;

//Given a string, return the length of the largest "block" in the string.
// A block is a run of adjacent chars that are the same.
//
//        maxBlock("hoopla") → 2
//        maxBlock("abbCCCddBBBxx") → 3
//        maxBlock("") → 0


public class LengthOfLargestBlock {

    public static int maxBlock(String str) {
        if (str.length() == 0) {
            return 0;
        }

        int maxChar = 1;
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i-1)) {
                count++;
            } else {
                maxChar = Math.max(maxChar, count);
                count=1;
            }
        }
        return Math.max(maxChar, count);
    }

    public static void main(String[] args) {
        System.out.println(maxBlock("hoopla"));
        System.out.println(maxBlock("abbCCCddBBBxx"));
        System.out.println(maxBlock(""));
    }
}
