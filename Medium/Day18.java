/*22. Generate Parentheses
Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

 

Example 1:

Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]
Example 2:

Input: n = 1
Output: ["()"] */
/*import java.util.*;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }

    private void backtrack(List<String> result, String current, int open, int close, int max) {
        // If the current string is complete
        if (current.length() == max * 2) {
            result.add(current);
            return;
        }

        // Add '(' if we still can
        if (open < max) {
            backtrack(result, current + "(", open + 1, close, max);
        }

        // Add ')' only if it keeps the string valid
        if (close < open) {
            backtrack(result, current + ")", open, close + 1, max);
        }
    }
}
 */