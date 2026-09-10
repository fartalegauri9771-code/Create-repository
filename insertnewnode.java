class Node {
     int data;
    Node next;
Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class insertnewnode {
    public static void main(String[] args) {
       Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        int value = 25;
        int position = 3;
          Node newNode = new Node(value);
        if (position == 1) {
            newNode.next = head;
            head = newNode;
        } else {
 Node temp = head;
            for (int i = 1; i < position - 1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

System.out.println("null");
    }
}