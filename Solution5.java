import java.util.*;

class Solution5 {

    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {

            char[] chars = str.toCharArray();

            Arrays.sort(chars);

            String key = new String(chars);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(str);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {

        Solution5 obj = new Solution5();

        String[] strs = {
            "eat",
            "tea",
            "tan",
            "ate",
            "nat",
            "bat"
        };

        List<List<String>> result = obj.groupAnagrams(strs);

        System.out.println("Input: " + Arrays.toString(strs));
        System.out.println("Output: " + result);
    }
}