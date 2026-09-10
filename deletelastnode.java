class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class deletelastnode {
    static Node head;
static void deleteLast() {
    if (head == null) {
            System.out.println("List is empty");
            return;
        }
if (head.next == null) {
            head = null;
            return;
        }
Node temp = head;
 while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
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
System.out.println("Before deletion:");
        display();
deleteLast();
System.out.println("After deleting last node:");
        display();
    }
}