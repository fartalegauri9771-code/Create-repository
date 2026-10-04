public class Solution19 {

    public boolean isHappy(int n) {

        int slow = n;
        int fast = n;

        do {
            slow = sumOfSquares(slow);
            fast = sumOfSquares(sumOfSquares(fast));

        } while (slow != fast);

        return slow == 1;
    }

    private int sumOfSquares(int n) {

        int sum = 0;

        while (n > 0) {

            int digit = n % 10;
            sum += digit * digit;
            n = n / 10;
        }

        return sum;
    }

    public static void main(String[] args) {

        int n = 19;

        Solution19 obj = new Solution19();

        boolean result = obj.isHappy(n);

        System.out.println("Number: " + n);
        System.out.println("Is Happy Number: " + result);
    }
}