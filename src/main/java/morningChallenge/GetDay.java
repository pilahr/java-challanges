package morningChallenge;

import java.util.Date;

public class GetDay {
    public static String getDay(Date date) {
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        return days[date.getDay()];
    }

    public static void main(String[] args) {
        Date date1 = new Date("12/07/2016");
        System.out.println(getDay(date1));

        Date date2 = new Date("09/04/2016");
        System.out.println(getDay(date2));

        Date date3 = new Date("12/08/2016");
        System.out.println(getDay(date3));
    }
}
