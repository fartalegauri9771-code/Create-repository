class Node {
    int data;
    Node next;
Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class Stack {
    Node top;
    void push(int value) {
        Node newNode = new Node(value);
 newNode.next = top;
        top = newNode;
 System.out.println(value + " pushed into stack");
    }
    void pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println(top.data + " popped from stack");
            top = top.next;
        }
    }
    void peek() {
        if (top == null) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Top element: " + top.data);
        }
    }
    void display() {
        if (top == null) {
            System.out.println("Stack is empty");
        } else {
            Node temp = top;

            System.out.println("Stack elements:");

            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
}

public class stack {
    public static void main(String[] args) {
 Stack s = new Stack();
 s.push(10);
s.push(20);
s.push(30);
s.display();
 s.peek();
 s.pop();
s.display();
    }
}