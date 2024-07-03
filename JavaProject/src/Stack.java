public class Stack {

    Node head;

    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void push(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int pop() {
        if(head == null) {
            return -1;
        }
        int data = head.data;
        head = head.next;
        return data;
    }

    public int peek() {
        if(head == null) {
            return -1;
        }
        return head.data;
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
