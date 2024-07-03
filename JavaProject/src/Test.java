import java.util.HashMap;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Manik", "Gay");
        map.put("Naif", "Bi");
        map.put("Bhaskar", "Trans");
        map.remove("Bhaskar");
//        map.clear();
        for(String s : map.keySet()) {
            System.out.println("Key: " + s + ", Value: " + map.get(s));
        }
    }
}
