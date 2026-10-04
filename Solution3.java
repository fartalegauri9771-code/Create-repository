import java.util.*;

class Solution3 {

    public List<String> letterCombinations(String digits) {

        List<String> result = new ArrayList<>();

        if (digits == null || digits.length() == 0) {
            return result;
        }

        String[] mapping = {
            "", "",
            "abc", "def",
            "ghi", "jkl", "mno",
            "pqrs", "tuv", "wxyz"
        };

        backtrack(
            digits,
            0,
            new StringBuilder(),
            result,
            mapping
        );

        return result;
    }

    private void backtrack(
        String digits,
        int index,
        StringBuilder current,
        List<String> result,
        String[] mapping
    ) {

        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }

        String letters = mapping[digits.charAt(index) - '0'];

        for (int i = 0; i < letters.length(); i++) {

            current.append(letters.charAt(i));

            backtrack(
                digits,
                index + 1,
                current,
                result,
                mapping
            );

            current.deleteCharAt(current.length() - 1);
        }
    }

    public static void main(String[] args) {

        // Solution3 object
        Solution3 obj = new Solution3();

        String digits = "23";

        List<String> result = obj.letterCombinations(digits);

        System.out.println("Input: " + digits);
        System.out.println("Output: " + result);
    }
}