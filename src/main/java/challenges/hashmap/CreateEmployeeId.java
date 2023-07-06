package challenges.hashmap;

import java.util.HashMap;

public class CreateEmployeeId {

    // map is collection of key value pair

    public static void main(String[] args) {
        HashMap<String, Integer> empIds = new HashMap<>();

        empIds.put("John", 12345);
        empIds.put("Jerry", 54321);
        empIds.put("Carl", 87907);

        System.out.println(empIds); //{Carl=87907, John=12345, Jerry=54321}

        System.out.println(empIds.get("Carl")); //87907

        System.out.println(empIds.containsKey("Jerry")); // true

        System.out.println(empIds.containsValue(87907)); // true

        empIds.put("John", 98765); // John value will be replaced

        System.out.println(empIds);

        empIds.replace("John", 777); // to replace, if key doesn't exist won't do anything
        System.out.println(empIds);

        empIds.putIfAbsent("John", 222);// John not gonna be updated, cause he's already there
        empIds.putIfAbsent("Steve", 222);
        System.out.println(empIds);

        empIds.remove("Steve");
        System.out.println(empIds);

    }

}
