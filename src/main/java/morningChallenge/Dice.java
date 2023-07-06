package morningChallenge;

import java.util.Random;
import java.util.Scanner;

//    Write a Java method that replicates how a dice works.
//    The method should generate a number between 1-6.
//
//    dice() -> 1
//    dice() -> 3
//    dice() -> 5
//    dice() -> 1
//
//    Extension - Can the user define how big the dice they want to roll?
//    Can you separate this into a class? Include a "roll" method
//    and a way of storing the roll score?
//
// e.g. dice(10) would generate a number between 1-10.
public class Dice {

    private static Scanner scanner = new Scanner(System.in);
    private static Random RANDOM = new Random();

    public static int dice(int dice) {
        return RANDOM.nextInt(dice);
    }

    public static void main(String[] args) {
        System.out.println("Enter a number for your dice...");
        int dice = scanner.nextInt();
        System.out.println(dice(dice));
    }
}


//    int dice;
//    public static Random randomDiceNumber = new Random(6);
//    public Challenges(int dice) {
//        this.dice = dice;
//    }
//    public int roll(){
//        int diceNumber = randomDiceNumber.nextInt(6)+1;
//        return diceNumber;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(roll());
//        DiceTen diceTen = new DiceTen();
//
//        System.out.println(diceTen.roll(10));
//
//    }
//}
