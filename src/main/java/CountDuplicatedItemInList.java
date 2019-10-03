import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountDuplicatedItemInList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        list.add("c");

        Map<String, Integer> counterMap = new HashMap();
        for (String item : list) {
            if (counterMap.containsKey(item)) {
                int counter = counterMap.get(item);
                counter++;
                counterMap.put(item, counter);
            } else {
                counterMap.put(item, 1);
            }
        }


        for (Map.Entry<String, Integer> entry : counterMap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

    }
}
