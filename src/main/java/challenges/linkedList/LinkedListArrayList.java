package challenges.linkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListArrayList {

    public static void main(String[] args) {
        LinkedList<String> namesLinkedList = new LinkedList<>();
        namesLinkedList.add("John");
        namesLinkedList.add("Paul");
        namesLinkedList.add("George");
        namesLinkedList.add("Ringo");
        System.out.println(namesLinkedList);
        System.out.println(namesLinkedList.get(2));

        namesLinkedList.add(1, "Jerry");
        System.out.println(namesLinkedList);



        ArrayList<String> namesArrayList = new ArrayList<>();
        namesArrayList.add("John");
        namesArrayList.add("Paul");
        namesArrayList.add("George");
        namesArrayList.add("Ringo");
        System.out.println(namesArrayList);
        System.out.println(namesArrayList.get(2));

        namesArrayList.add(1, "Jerry");
        System.out.println(namesArrayList);


    }
}
