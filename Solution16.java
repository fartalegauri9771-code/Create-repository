import java.util.HashSet;

public class Solution16 {

    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {

            if (set.contains(num)) {
                return true;
            }

            set.add(num);
        }

        return false;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 1};

        Solution16 obj = new Solution16();

        boolean result = obj.containsDuplicate(nums);

        System.out.println("Contains Duplicate: " + result);
    }
}