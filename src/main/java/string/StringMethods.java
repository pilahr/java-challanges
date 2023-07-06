package string;

import java.util.Locale;

public class StringMethods {

    public static void main(String[] args) {
        String name = "  Piyaporn";
        String surname = "Lahr";

        boolean result = name.equalsIgnoreCase("piyaporn");
        System.out.println(result);

        System.out.println(name.length());

        System.out.println(name.charAt(2));

        System.out.println(name.indexOf("p"));

        System.out.println(name.isEmpty());

        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        System.out.println(name.trim());

        System.out.println(name.replace("y", "b"));

        System.out.println(name.concat(" "+ surname));
    }
}
