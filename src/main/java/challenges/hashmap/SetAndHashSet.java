package challenges.hashmap;

import java.util.*;

public class SetAndHashSet {

    public static void main(String[] args) {
        // set is an interface
        // List maintain order you added to the list
        // Hashset no order
        // use case: remove duplicate items
        Set<String> names = new HashSet<>();
        // TreeSet can return names by order -- if order is not needed use HashSet is quicker
        // LinkedHashSet -- print out same order as it was inserted

        names.add("Walter");
        names.add("Jesse");
        names.add("Mike");
        names.add("Skyler");
        names.add("Walter"); // set don't allow duplicate
        names.add("Alan");

//        names.remove("Walter");
//
//
//        System.out.println(names); //[Walter, Mike, Skyler, Jesse]
//        System.out.println(names.size());
//        System.out.println(names.contains("Mike"));
//        System.out.println(names.isEmpty());
//
//        names.clear();
//        System.out.println(names);

        // using for loop
        for (String name : names) {
            System.out.println(name);
        }

        // using lambda func
        names.forEach(System.out::println);
        Iterator<String> namesIterator = names.iterator();
        while (namesIterator.hasNext()) {
            System.out.println(namesIterator.next());
        }


        List<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(2);
        numberList.add(1);

        System.out.println(numberList);

        Set<Integer> numberSet = new HashSet<>();
        numberSet.addAll(numberList);
        System.out.println(numberSet);
    }
}
