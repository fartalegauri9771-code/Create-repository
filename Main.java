class Queue {
    int[] queue;
    int front;
    int rear;
    int size;

    Queue(int size) {
        this.size = size;
        queue = new int[size];
        front = -1;
        rear = -1;
    }
    void enqueue(int value) {

        if (rear == size - 1) {
            System.out.println("Queue Overflow");
        } else {

            if (front == -1) {
                front = 0;
            }
 rear++;
            queue[rear] = value;

            System.out.println(value + " inserted into queue");
        }
    }
    void dequeue() {

        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow");
        } else {

            System.out.println(queue[front] + " removed from queue");
            front++;
        }
    }
    void peek() {

        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Front element: " + queue[front]);
        }
    }
    void display() {

        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
        } else {

            System.out.println("Queue elements:");

            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }

            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Queue q = new Queue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();

        q.peek();

        q.dequeue();

        q.display();
    }
}