class Queue {
    int[] queue = new int[5];
    int front = 0;
    int rear = -1;
    void enqueue(int value) {
        if (rear == queue.length - 1) {
            System.out.println("Queue is Full");
        } else {
            rear++;
            queue[rear] = value;
        }
    }
     void dequeue() {
        if (front > rear) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println("Dequeued: " + queue[front]);
            front++;
        }
    }
 void peek() {
        if (front > rear) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println("Peek: " + queue[front]);
        }
    }
 void display() {
        if (front > rear) {
            System.out.println("Queue: Empty");
        } else {
            System.out.print("Queue: ");

            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }

            System.out.println();
        }
    }
}

public class fifo {
    public static void main(String[] args) {

        Queue q = new Queue();
     q.enqueue(10);
        System.out.println("After enqueue(10):");
          q.display();
          q.enqueue(20);
        System.out.println("After enqueue(20):");
        q.display();
        q.enqueue(30);
        System.out.println("After enqueue(30):");
        q.display();
         q.peek();
        q.display();
        q.dequeue();
        q.display();
        q.enqueue(40);
        System.out.println("After enqueue(40):");
        q.display();
        q.dequeue();
        q.display();
      q.peek();
        q.display();
    }
}