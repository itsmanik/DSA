import java.util.ArrayList;

public class StackAL {

    static class Stack {
        ArrayList<Integer> list = new ArrayList<>();
        public boolean isEmpty() {
            return list.size() == 0;
        }

        public void push(int ele) {
            list.add(ele);
        }

        public int pop() {
            if(isEmpty()) {
                return -1;
            }
            int ele = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return ele;
        }

        public int peek() {
            if(isEmpty()) {
                return -1;
            }
            int ele = list.get(list.size() - 1);
            return ele;
        }

    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(100);
        while(s.isEmpty() == false) {
            System.out.println(s.pop());
        }
    }
}
