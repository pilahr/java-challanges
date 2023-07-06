package challenges;

public class JosephusProblem {

    public static int josephus(int numberOfPeople, int k) {
        int i = 1;
        int answer = 0;

        while (i <= numberOfPeople) {
            answer = (answer + k) % i;
            i++;
        }
        return answer + 1;
    }

    public static void main(String[] args) {
        int numberOfPeople = 5;
        int k = 2;
        System.out.println(josephus(numberOfPeople,k));
    }
}
