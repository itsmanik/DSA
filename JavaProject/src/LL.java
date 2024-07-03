public class LL {
    Node head;
    private int size;

    LL() {
        this.size = 0;
    }

    class Node {
        String data;
        Node next;
        Node(String data) {
            this.next = null;
            this.data = data;
            size++;
        }
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;
        head = head.next;
    }

    public void deleteLast() {
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;
        if(head.next == null) {
            head = null;
            return;
        }
        Node currNode = head;
        while(currNode.next.next != null) {
            currNode = currNode.next;
        }
        currNode.next = null;
    }

    public int getSize() {
        return size;
    }

    public void display() {
        Node ptr = head;
        while(ptr != null) {
            System.out.print(ptr.data + " -> ");
            ptr = ptr.next;
        }
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addLast("satish");
        list.addLast("neelambika");
        list.addLast("komal");
        list.addLast("manik");
        list.addFirst("don");
        list.deleteFirst();
        list.deleteLast();
        list.display();
        System.out.println(list.getSize());
    }
}
