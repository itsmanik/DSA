import java.util.HashMap;
import java.util.Map;

public class HashMapp {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "manik");
        map.put(2, "neha");
        map.put(3, "manandar");
        map.put(4, "hello world");
        map.put(5, "this world");

        System.out.println(map.getOrDefault(7, "hell nahh"));
        System.out.println('b' - 'a');
//        for(Map.Entry<Integer, String> e : map.entrySet()) {
//            System.out.println(e.getKey());
//        }
        for(Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
