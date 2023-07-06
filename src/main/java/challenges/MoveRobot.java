package challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveRobot {

    public static int[] position(String command) {
        int length = command.length();
        int countUp = 0;
        int countDown = 0;
        int countLeft = 0;
        int countRight = 0;

        int[] list = new int[2];

        for (int i = 0; i < length; i++) {
            if (command.charAt(i) == 'U') {
                countUp++;
            } else if (command.charAt(i) == 'D') {
                countDown++;
            } else if (command.charAt(i) == 'L') {
                countLeft++;
            } else if (command.charAt(i) == 'R') {
                countRight++;
            }

            int xPosition = countRight - countLeft;
            int yPosition = countUp - countDown;
            list[0] = xPosition;
            list[1] = yPosition;
        }
        return list;
    }

    public static void main(String[] args) {
        String command = "UDLRD";
        System.out.println(Arrays.toString(position(command)));
    }
}
