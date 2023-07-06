package challenges.hashmap;

import java.util.Map;

public class HashMapEx {

    public static void main(String[] args) {
        Map<Integer, String> map = new java.util.HashMap<>();
        map.put(1, "John");
        map.put(2, "Mosh");
        map.put(3, "Mary");

        System.out.println(map);
        var value = map.get(3);
        System.out.println(value);

        map.containsKey(3); // O(1)
        map.containsValue("Mosh"); // O(n)
        System.out.println(map);

        for (var item : map.keySet())
            System.out.println(item); // 1 2 3

        for (var item : map.entrySet())
            System.out.println(item); // 1=John 2=Mosh 3=Mary
    }
}
