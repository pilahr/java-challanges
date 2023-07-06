package challenges;

import java.util.ArrayList;
import java.util.List;

public class JosephusProblem2 {

    public static void josh(List<Integer> person, int k, int index) {
        if (person.size() == 1) {
            System.out.println(person.get(0));
            return;
        }

        index = ((index + k) % person.size()); // 5 ppl k=2  index = (0+2)%5 = 2 index2---killed (player3)

        person.remove(index);

        josh(person, k, index);

    }

    public static void main(String[] args) {
        int n = 5;
        int k = 2;
        int index = 0;
        List<Integer> person = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            person.add(i);
        }

        josh(person, k, index);

    }
}
