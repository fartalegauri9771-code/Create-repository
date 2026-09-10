class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Queue {
    Node front;
    Node rear;
    void enqueue(int value) {
        Node newNode = new Node(value);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        System.out.println(value + " inserted into queue");
    }
 void dequeue() {
        if (front == null) {
            System.out.println("Queue Underflow");
            return;
        }

        System.out.println(front.data + " removed from queue");

        front = front.next;
        if (front == null) {
            rear = null;
        }
    }
    void peek() {
        if (front == null) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Front element: " + front.data);
        }
    }
    void display() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }
Node temp = front;
System.out.println("Queue elements:");
while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
         System.out.println();
    }
}
public class implementlinklist {
    public static void main(String[] args) {

        Queue q = new Queue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);

        q.display();

        q.peek();

        q.dequeue();

        q.display();
    }
}