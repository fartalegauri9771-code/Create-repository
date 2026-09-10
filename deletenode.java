class Node {
    int data;
    Node next;
 Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class deletenode {
    public static void main(String[] args) {
         Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
       if (head == null) {
            method();
        } else {
            head = head.next;
        }
        Node temp = head;
while (temp != null) {
            System.out.print(temp.data + " ->");
            temp = temp.next;
        }
 System.out.println("null");
    }
private static void method() {
        System.out.println("List is empty");
    }
}