import java.util.HashMap;

public class Solution15 {

    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int num = nums[i];

            if (map.containsKey(num)) {

                int previousIndex = map.get(num);

                if (i - previousIndex <= k) {
                    return true;
                }
            }

            map.put(num, i);
        }

        return false;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 1};
        int k = 3;

        Solution15 obj = new Solution15();

        boolean result = obj.containsNearbyDuplicate(nums, k);

        System.out.println("Contains Nearby Duplicate: " + result);
    }
}