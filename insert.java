class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class insert {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        Node newNode = new Node(40);
        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        temp = head;
        while (temp != null){
            System.out.println(temp.data + " ->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}