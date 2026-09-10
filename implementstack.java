class Stack {
    int[] stack;
    int top;
    int size;
 Stack(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }
    void push(int value) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
        } else {
            top++;
            stack[top] = value;
            System.out.println(value + " pushed into stack");
        }
    }
    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println(stack[top] + " popped from stack");
            top--;
        }
    }
    void peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Top element: " + stack[top]);
        }
    }
    void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack elements:");

            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }
}
public class implementstack {
    public static void main(String[] args) {
Stack s = new Stack(5);
s.push(10);
s.push(20);
 s.push(30);
 s.display();
 s.peek();
s.pop();
s.display();
    }
}