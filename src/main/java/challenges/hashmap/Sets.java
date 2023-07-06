package challenges.hashmap;

import java.util.HashSet;
import java.util.Set;

public class Sets {
    // Maps: k -> v
    // Sets: k --- to remove duplicate values
    // [1,2,3,3,2,1]

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        int[] numbers = {1,2,3,3,2,1,4};
        for (var number : numbers)
            set.add(number);
        System.out.println(set);

        set.remove(2);
        System.out.println(set);

        set.clear();
        System.out.println(set);
    }
}
