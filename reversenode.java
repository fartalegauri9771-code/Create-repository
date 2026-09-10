class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class reversenode {
    static Node head;
 static void reverse() {
        Node prev = null;
        Node current = head;
        Node next;
while (current != null) {
     next = current.next;
   current.next = prev;
   prev = current;
           current = next;
        }
 head = prev;
    }
    static void display() {
 Node temp = head;
while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
 System.out.println("null");
    }
    public static void main(String[] args) {
 head = new Node(10);
head.next = new Node(20);
head.next.next = new Node(30);
head.next.next.next = new Node(40);
System.out.println("Original Linked List:");
        display();
        reverse();
System.out.println("Reversed Linked List:");
        display();
    }
}