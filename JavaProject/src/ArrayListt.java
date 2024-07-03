import java.util.ArrayList;
import java.util.Collections;

public class ArrayListt {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.remove(1);
        list.set(1, 5);
        list.add(1, 0);
        int size = list.size();
        System.out.println(size);
        Collections.sort(list);
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list);
    }
}