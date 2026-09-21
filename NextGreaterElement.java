import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {

    public static int[] findNGE(int[] arr) {

        int n = arr.length;
        int[] result = new int[n];

        Stack<Integer> stack = new Stack<>();

        
        for (int i = n - 1; i >= 0; i--) {

            // Remove smaller or equal elements
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

           
            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }

           
            stack.push(arr[i]);
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {4, 5, 2, 10, 8};

        int[] result = findNGE(arr);

        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("NGE:   " + Arrays.toString(result));
    }
}