import java.util.HashSet;

class Solution8 {

    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

    
        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        for (int num : set) {

            if (!set.contains(num - 1)) {

                int currentNum = num;
                int count = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }

        return longest;
    }

    public static void main(String[] args) {

        Solution8 obj = new Solution8();

        int[] nums = {100, 4, 200, 1, 3, 2};

        int result = obj.longestConsecutive(nums);

        System.out.println("Longest Consecutive Sequence: " + result);
    }
}