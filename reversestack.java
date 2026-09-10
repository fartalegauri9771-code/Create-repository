import java.util.Stack;
public class reversestack {
    public static void main(String[] args) {
int[] arr = {10, 20, 30, 40, 50};
Stack<Integer> stack = new Stack<>();
for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
System.out.println("Reversed Array:");
for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}