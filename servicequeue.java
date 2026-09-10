import java.util.LinkedList;
import java.util.Queue;

public class servicequeue {
    public static void main(String[] args) {
        Queue<String> customerQueue = new LinkedList<>();
        customerQueue.add("Rahul");
        customerQueue.add("Priya");
        customerQueue.add("Amit");
        customerQueue.add("Sneha");

        System.out.println("Customers in Queue:");
        System.out.println(customerQueue);

        System.out.println("\nServing Customers:");

        while (!customerQueue.isEmpty()) {

            String customer = customerQueue.poll();

            System.out.println("Serving: " + customer);
        }

        System.out.println("\nAll customers have been served.");
    }
}