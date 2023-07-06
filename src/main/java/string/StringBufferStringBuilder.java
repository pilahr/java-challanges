package string;

public class StringBufferStringBuilder {

    public static void main(String[] args) {

        // relocate string give you a buffer
        // thread safe
        StringBuffer sb = new StringBuffer("Airly");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append(" Darren");
        System.out.println(sb);

        sb.deleteCharAt(2);
        System.out.println(sb);

        sb.insert(0, "Java ");
        System.out.println(sb);

        sb.substring(2, 6);
        System.out.println(sb);

        String str = sb.toString();
        System.out.println(str);
    }
}
