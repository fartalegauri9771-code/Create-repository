import java.util.HashMap;

class Solution {

    public int lengthOfLongestSubstring(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            if (map.containsKey(ch) && map.get(ch) >= left) {
                left = map.get(ch) + 1;
            }

            map.put(ch, right);

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        String s = "abcabcbb";

        int result = obj.lengthOfLongestSubstring(s);

        System.out.println(result);
    }

    String intToRoman(int num) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    int romanToInt(String roman) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    int romanToInt(String roman) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    int romanToInt(String roman) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}