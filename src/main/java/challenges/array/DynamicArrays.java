package challenges.array;

import java.util.ArrayList;

public class DynamicArrays {
    // to build a dynamic array Java has Vector and ArrayList
    // Vector: grow at 100% of its size - method is synchronized only a single thread can access
    // ArrayList: grow at 50% of its size

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.remove(0);
        list.indexOf(20);
        list.lastIndexOf(20);
        list.contains(20);
        list.size();
        list.toArray(); // turns into array object [Ljava.lang.Object;@75bd9247

        System.out.println(list);
    }
}
