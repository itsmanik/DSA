import java.util.HashSet;
import java.util.Iterator;

public class HashSett {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(3);
        set.add(5);
        set.add(8);
        set.add(2);
        System.out.println(set);
        System.out.println(set.contains(5));
        Iterator it = set.iterator();
        // it.next
        // it.hasNext
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
