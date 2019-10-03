import java.util.HashMap;
import java.util.Map;

public class HashMapCheckIfKeyExists {
    public static void main(String[] args) {
        //create a new hashmap
        Map<String, String> map = new HashMap();
        //put country and its capital city
        map.put("USA", "Washington");
        map.put("Japan", "Tokyo");

        System.out.println("Is USA exists?");
        System.out.println(map.containsKey("USA"));

        System.out.println("Is Japan exists?");
        System.out.println(map.containsKey("Japan"));

        System.out.println("Is China exists?");
        System.out.println(map.containsKey("China"));
    }
}
