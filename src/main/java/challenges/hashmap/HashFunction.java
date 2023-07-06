package challenges.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashFunction {

    // want to store index 123456, "Mosh"
    // array length = 100
    // need to stored on index 0 - 99

    public static int hash(int number) {
        return number % 100;
    }

    public static int hash2(String key) {
        int hash = 0;
        for (var ch : key.toCharArray())
            hash += ch;
        return hash % 100;
    }

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(123456, "Mosh");

        System.out.println(hash(123456)); // 56

        // if key is string Ex. Passport no.
        Map<String, String> map2 = new HashMap<>();
        System.out.println(hash2("123456-A")); // 419 --> 19 with %100 cause array has 100 values


        //every String in Java has a hash value
        String str = "orange";
        System.out.println(str.hashCode()); //-1008851410
    }
}
