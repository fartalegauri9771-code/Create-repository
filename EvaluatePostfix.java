import java.util.Stack;

public class EvaluatePostfix {

    public static int evaluate(String[] tokens) {

        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {

            // If token is a number
            if (token.matches("-?\\d+")) {
                stack.push(Integer.parseInt(token));
            } 
            else {
                // Take two numbers from stack
                int b = stack.pop();
                int a = stack.pop();

                int result = 0;
                switch (token) {
                    case "+":
                        result = a + b;
                        break;

                    case "-":
                        result = a - b;
                        break;

                    case "*":
                        result = a * b;
                        break;

                    case "/":
                        result = a / b;
                        break;
                }
                stack.push(result);
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {

        String[] tokens = {"2", "1", "+", "3", "*"};

        int result = evaluate(tokens);

        System.out.println("Result: " + result);
    }
}