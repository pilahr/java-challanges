package challenges.array;

import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayList {

    public static void main(String[] args) {

        String[] friendsArray = new String[4]; // ARRAY FIXED SIZE
        String[] friendsArray2 = {"John", "Chris", "Eric", "Luke"};
        System.out.println(Arrays.toString(friendsArray2));
        System.out.println(friendsArray2[1]);
        System.out.println(friendsArray2.length);
        friendsArray2[0] = "Carl";
        System.out.println(friendsArray2[0]);
        // can't add element cause array has a fixed size
        // can't remove element from array


        ArrayList<String> friendsArrayList = new ArrayList<>(); //ARRAYLIST CAN GROW AND SHRINK
        ArrayList<String> friendsArrayList2 = new ArrayList<>(Arrays.asList("John", "Chris", "Eric", "Luke"));
        System.out.println(friendsArrayList2);
        System.out.println(friendsArrayList2.get(1));
        System.out.println(friendsArrayList2.size());
        friendsArrayList2.add(0, "Harry");
        friendsArrayList2.add("Mitch");
        System.out.println(friendsArrayList2);
        friendsArrayList2.set(0, "Carl");
        System.out.println(friendsArrayList2.get(0));
        friendsArrayList2.remove(0);
        friendsArrayList2.remove("Mitch");


    }
}
